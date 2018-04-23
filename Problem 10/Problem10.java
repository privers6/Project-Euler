public class Problem10 {
    private static final int ceiling = 2000000;

    /*
        Method borrowed from Problem 7.
     */
    private static boolean isPrime(int n){
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        long sum = 2;
        for(int i = 3; i < ceiling; i++){
            if(isPrime(i))
                sum += i;
        }
        System.out.println(sum);
    }
}
