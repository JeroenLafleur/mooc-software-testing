package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    public void homeProduct() {
        Product homeProduct = new Product("Couch", 500.99,"HOME");
        ProductDao productDao = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(homeProduct);
        Mockito.when(productDao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(productDao);
        discountApplier.setNewPrices();

        double expectedPrice = 500.99 * 0.90;
        Assertions.assertEquals(expectedPrice, homeProduct.getPrice());
    }

    @Test
    public void businessProduct() {
        Product businessProduct = new Product("Desk", 699.99,"BUSINESS");
        ProductDao productDao = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(businessProduct);
        Mockito.when(productDao.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(productDao);
        discountApplier.setNewPrices();

        double expectedPrice = 699.99 * 1.10;
        Assertions.assertEquals(expectedPrice, businessProduct.getPrice());
    }
}
