public class Problem4 {
    private static final int min = 100 * 100; //Smallest number that is a product of two 3 digit numbers.
    private static final int max = 999 * 999; //Largest number that is a product of two 3 digit numbers.

    /*
    Checks whether a number is a palindrome.
     */
    private static boolean isPalindrome(int num){
        String number = String.valueOf(num);
        return number.equals(new StringBuilder(number).reverse().toString());
    }

    /*
    Checks whether a number is the product of two three digit numbers.
     */
    private static boolean isThreeByThree(int num){
        for(int i = 100; i < 1000; i++){
            if(num % i == 0 && String.valueOf(num / i).length() == 3)
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        for(int i = max; i >= min; i--){
            if(isPalindrome(i) && isThreeByThree(i)){
                System.out.println(i);
                return;
            }
        }
    }
}
