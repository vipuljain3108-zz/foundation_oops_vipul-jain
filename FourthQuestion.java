// Question 4:
// Write a program to find the power X over N in O(logn) time complexity. 


public class FourthQuestion {

    static int power(int n, int x){
        if(x <= 0) return 1;

        int result = n;
        for (int i = 0; i < x - 1; i++) {
            result *= n;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(3, 0));
    }
}
