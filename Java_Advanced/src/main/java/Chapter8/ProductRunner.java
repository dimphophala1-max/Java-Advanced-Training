package Chapter8;

/**
 * @author : Dimpho Phala
 * Date : 13/10/2026
 **/
public class ProductRunner {
    public static void main(String[] args) {

        try {
            Product objProduct = new Product("code123", "microwave", 500, 5);

            objProduct.increasePrice(1);
            objProduct.sell(2);
            System.out.println(objProduct);
        }catch (IllegalArgumentException | LowStockException | HighPriceIncreaseException ex){
            System.err.println(ex.getMessage());
        }

    }
}