
interface Observer {
    void update(String stock, double price);
}

interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stock;
    private double price;

    public void setStockData(String stock, double price) {
        this.stock = stock;
        this.price = price;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    public void deregister(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stock, price);
        }
    }
}

class MobileApp implements Observer {
    public void update(String stock, double price) {
        System.out.println("MobileApp: " + stock + " is now " + price);
    }
}

class WebApp implements Observer {
    public void update(String stock, double price) {
        System.out.println("WebApp: " + stock + " is now " + price);
    }
}

class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStockData("TCS", 3400.75);
    }
}
