// Check if a given string is a palindrome and return true or false based on the result, only with 
// the help of recursion. You can not use string buffer or inbuilt string features like reverse etc. 

class FirstQuestion {
    public static String reverseString(String str) {
        if (str.length() <= 1)
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "AKA";
        if (reverseString(str).equals(str))
            System.out.println(true);
        else
            System.out.println(false);
    }
}