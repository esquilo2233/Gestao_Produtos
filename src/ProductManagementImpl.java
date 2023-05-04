import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManagementImpl implements ProductManagement{
    private List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void editProduct(String name, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.set(i, product);
                break;
            }
        }
    }

    @Override
    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equals(name));
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return products.stream()
                .filter(product -> product.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> searchProductByCategory(String category) {
        return products.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public List<Product> listAllProducts() {
        return products;
    }
}
