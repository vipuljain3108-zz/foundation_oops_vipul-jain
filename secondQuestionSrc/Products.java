package secondQuestionSrc;

import java.util.ArrayList;
import java.util.HashMap;

public class Products {
    ArrayList<HashMap<String, String>> products = new ArrayList<>();

    public String addProduct(HashMap<String, String> product) {
        if (products.size() > 4) {
            return "Product list is overloaded, please remove some products to add new.";
        } else {
            products.add(product);
            return "Product added successfully !";
        }
    }

    public ArrayList<HashMap<String, String>> productList() {
        return products;
    }
}
