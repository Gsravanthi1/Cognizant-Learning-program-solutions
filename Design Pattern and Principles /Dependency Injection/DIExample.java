// ===================== Exercise 11: Dependency Injection =====================

// Repository interface
interface CustomerRepository {
    String findCustomerById(String id);
}

// Concrete repository class
class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        // Just a dummy lookup
        return "Customer#" + id + ": G. Sravanthi";
    }
}

// Service class depending on the repository
class CustomerService {
    private CustomerRepository repository;

    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void displayCustomer(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer Details: " + customer);
    }
}

// Test class for Dependency Injection
class DIExample {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        service.displayCustomer("101");
    }
}
