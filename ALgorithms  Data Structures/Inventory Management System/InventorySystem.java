// Product class represents each item in inventory
class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }
}

// Inventory class to manage products
class Inventory {
    ArrayList<Product> products = new ArrayList<>();

    // Add new product to the inventory
    public void addProduct(Product p) {
        products.add(p);
    }

    // Update product quantity using product ID
    public void updateProduct(int id, int newQty) {
        for (Product p : products) {
            if (p.productId == id) {
                p.quantity = newQty;
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Delete product by ID
    public void deleteProduct(int id) {
        boolean removed = products.removeIf(p -> p.productId == id);
        if (!removed) {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        for (Product p : products) {
            System.out.println("ID: " + p.productId + ", Name: " + p.productName +
                               ", Qty: " + p.quantity + ", Price: ₹" + p.price);
        }
    }
}
