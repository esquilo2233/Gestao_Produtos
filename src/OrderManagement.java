public interface OrderManagement {
    void updateStock(Product product, int quantity);
    void createOrder(Customer customer, List<Product> products);
}
