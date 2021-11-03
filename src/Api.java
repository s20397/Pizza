import java.util.ArrayList;
import java.util.List;

public class Api {

    public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        products.add("Pizza");
        products.add("Burger");

        return products;
    }
}
