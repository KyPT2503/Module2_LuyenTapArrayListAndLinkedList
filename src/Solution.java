public class Solution {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.addProduct(new Product(1, "A", 12));
        productManager.addProduct(new Product(2, "B", 11));
        productManager.addProduct(new Product(3, "C", 13));
        productManager.addProduct(new Product(4, "D", 15));
        productManager.addProduct(new Product(5, "E", 14));
        System.out.println(productManager.getProducts());
        productManager.sortBtPriceDown();
        System.out.println(productManager.getProducts());
        productManager.sortByPriceUp();
        System.out.println(productManager.getProducts());
    }
}
