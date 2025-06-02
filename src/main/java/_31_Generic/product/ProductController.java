package _31_Generic.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductController<T> {
    private String productName;
    private T productInfo;

    @Override
    public String toString() {
        return productName + productInfo;
    }
}
