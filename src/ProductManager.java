import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Product getProductBtId(int id) {
        for (Product product : products) {
            if (product.getId() == id) return product;
        }
        return null;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) return product;
        }
        return null;
    }

    public void setProductById(int id, String newName) {
        this.getProductBtId(id).setName(newName);
    }

    public void removeProductById(int id) {
        this.products.remove(getProductBtId(id));
    }

    public List<Product> getProducts() {
        return new ArrayList<>(this.products);
    }

    public void sortByPriceUp() {
        Collections.sort(this.products);
    }

    public void sortBtPriceDown() {
        this.products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return -product.getPrice().compareTo(t1.getPrice());
            }
        });
    }
}
