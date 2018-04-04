import java.lang.Math;

public class Problem3 {
    private static long target = 600851475143L; //The value to be factored into primes.

    public static void main(String[] args){
        int factor = 2;
        while(target > 1){
            if(target % factor == 0)
                target = target / factor; //Remove the prime factor from the target.
            else
                factor++;
        }
        System.out.println(factor);
    }
}
