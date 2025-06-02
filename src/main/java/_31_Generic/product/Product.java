package _31_Generic.product;

public class Product {
    public static void main(String[] args) {
        ProductController<String> productController1 = new ProductController<>("Laptop", "Intel");
        System.out.println(productController1);
        ProductController<Double> productController2 = new ProductController<>("SmartPhone", 79.99);
        System.out.println(productController2);


    }
}
