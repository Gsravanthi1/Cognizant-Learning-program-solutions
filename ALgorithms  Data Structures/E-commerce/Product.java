class Product {
    int productId;
    String productName;
    String category;

    public Product(int id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
}

class Search {

    // Linear Search
    public int linearSearch(Product[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].productName.equals(name)) return i;
        }
        return -1;
    }

    // Binary Search (sorted by name)
    public int binarySearch(Product[] arr, String name) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].productName.compareTo(name);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
