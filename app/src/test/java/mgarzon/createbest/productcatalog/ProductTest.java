package mgarzon.createbest.productcatalog;
import static org.junit.Assert.*;
import org.junit.Test;

public class ProductTest {

    @Test
    public void checkProductName() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the name of the product", "DELL MONITOR", aProduct.getProductName());
    }

    @Test
    public void checkProductId() {
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        assertEquals("Check the id of the product", "1", aProduct.getId());
    }

    @Test
    public void checkProductPrice() {

        double output;
        double expected = 180;
        double delta = 0.01;
        // I am making this test to fail
        Product aProduct = new Product("1", "DELL MONITOR", 180);
        output = aProduct.getPrice();
        assertEquals(output, expected, delta);
    }


}
