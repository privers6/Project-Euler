public class Problem7 {
    private static final int target = 10001; // The index of the prime we are trying to find.

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
        int count = 1; // Current prime count
        int candidate = 3; // Start checking primes at 3.

        while(count < target){
            if(isPrime(candidate))
                count++;
            candidate++;
        }
        System.out.println(candidate - 1); // Undo the last increment to candidate.
    }
}
