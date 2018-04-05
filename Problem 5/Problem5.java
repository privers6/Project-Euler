import java.util.*;

public class Problem5 {
    private static final int ceiling = 20; //Upper limit on the divisors.
    
    public static void main(String[] args){
        List<Integer> factors = new ArrayList<>();
        factors.add(2);
        int result = 2;

        /*
            Filters out the prime factors from the divisors.
         */
        for(int i = 2; i <= ceiling; i++){
            int factor = i;

            for(Integer j: factors){
                if(factor % j == 0)
                    factor /= j;
            }

            if(factor != 1) {
                factors.add(factor);
                result *= factor;
            }
        }

        System.out.println(result);
    }
}
