package secondQuestionSrc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner val = new Scanner(System.in)) {
            int options = -1;

            Products p = new Products();
            Cart c = new Cart();
            Checkout out = new Checkout();

            while (options != 0) {

                System.out
                        .println(
                                "1 - Add product, 2 - Get all products, 3 - Add to cart, 4 - Get cart, 5 - Get Total, 6 - Check Out");
                options = val.nextInt();

                switch (options) {
                    case 1:
                        HashMap<String, String> map = new HashMap<>();
                        System.out.println("add name of product");
                        map.put("Name", val.next());

                        System.out.println("add price of product");
                        map.put("Price", val.next());

                        System.out.println("add id of product");
                        map.put("Id", val.next());

                        System.out.println(p.addProduct(map));
                        break;
                    case 2:
                        for (HashMap<String, String> values : p.productList()) {
                            System.out.println(values);
                        }
                        break;
                    case 3:
                        System.out.println("enter name of product");
                        System.out.println(c.addToCart(val.next(), p.productList()));
                        break;
                    case 4:
                        if (c.allCart().size() < 1)
                            System.out.println("cart is empty");
                        for (HashMap<String, String> values : c.allCart()) {
                            System.out.println(values);
                        }
                        break;
                    case 5:
                        System.out.println("Please enter the payment type");
                        System.out.println("1 - Cash , 2 - Card (If you select this, amount will be double");
                        System.out.println(out.getTotal(c.allCart(), val.nextInt()));

                        break;
                    case 6:
                        out.checkout(c.allCart());
                        c.clearCart();
                        break;

                    default:
                        break;
                }
            }
        }
    }
}
