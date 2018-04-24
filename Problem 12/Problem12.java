public class Problem12 {
    private static final int threshold = 500;

    /*
        Brute Force Method. Incredibly slow.
     */
    private static int getNumDivisors(long n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args){
        int count = 0;
        long triangle = 0;
        while(true){
            count++;
            triangle += count;

            if(count % 100 == 0)
                System.out.println("Running. Loop:" + count);
            if(getNumDivisors(triangle) > threshold){
                System.out.println(triangle);
                return;
            }
        }
    }
}
