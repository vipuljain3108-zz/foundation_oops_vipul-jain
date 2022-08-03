package secondQuestionSrc;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {

    ArrayList<HashMap<String, String>> cart = new ArrayList<>();

    public String addToCart(String productName, ArrayList<HashMap<String, String>> products) {

        int index = -1;

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).containsValue(productName)) {
                index = i;
            }
        }

        System.out.println(index);

        if (index > -1) {
            HashMap<String, String> element = cart.get(index);
            element.put("Qty", Integer.toString(Integer.parseInt(cart.get(index).get("Qty")) + 1));
            cart.set(index, element);
            return "Cart Updated Successfully !";

        } else {
            System.out.println(products.size());
            for (int j = 0; j < products.size(); j++) {
                System.out.println("yyy" + products.get(j).containsValue(productName));
                if (products.get(j).containsValue(productName)) {
                    products.get(j).put("Qty", "1");
                    cart.add(products.get(j));
                }
            }

            return "Cart Updated Successfully !";
        }
    }

    public ArrayList<HashMap<String, String>> allCart() {
        return cart;
    }

    public String clearCart() {
        ArrayList<HashMap<String, String>> clear = new ArrayList<>();
        cart = clear;
        return "Cart Empty !";
    }
}
