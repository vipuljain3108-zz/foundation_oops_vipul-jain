package secondQuestionSrc;

import java.util.ArrayList;
import java.util.HashMap;

public class Checkout {
    public String getTotal(ArrayList<HashMap<String, String>> cart, int paymentOption) {
        int x = 0;
        for (HashMap<String, String> hashMap : cart) {
            x += (Integer.parseInt(hashMap.get("Price")) * Integer.parseInt(hashMap.get("Qty")));
        }

        if(paymentOption == 1){
            return Integer.toString(x);
        } else {
            return Integer.toString(x * 2);
        }

    }

    public ArrayList<HashMap<String, String>> checkout(ArrayList<HashMap<String, String>> cart){
        ArrayList<HashMap<String, String>> a = new ArrayList<>();
        return a;
    }
}
