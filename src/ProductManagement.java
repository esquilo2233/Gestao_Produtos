import java.util.List;

public interface ProductManagement {
    void addProduct(Product product);
    void editProduct(String name, Product product);
    void removeProduct(String name);
    List<Product> searchProductByName(String name);
    List<Product> searchProductByCategory(String category);
    List<Product> listAllProducts();
}
