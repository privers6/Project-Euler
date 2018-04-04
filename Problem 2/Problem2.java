public class Problem2 {
    private static final int ceiling = 4000000; //Defines the upper limit, or ceiling, to the problem.

    public static void main(String[] args){
        int first = 1, second = 1; //The n and n+1 terms of the Fibonacci sequence, starting from 1 and 1.

        int result = 0;
        while(second < ceiling){
            if(second % 2 == 0)
                result+= second;
            int sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println(result);
    }
}
