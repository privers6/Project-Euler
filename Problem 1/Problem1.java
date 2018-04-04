public class Problem1 {
    private static final int ceiling = 1000; //Defines the upper limit, or ceiling, to the problem.

    public static void main(String[] args) {
        int result = 0;
        for(int i = 1; i < ceiling; i++){
            if(i % 3 == 0 || i % 5 == 0)
                result += i;
        }
        System.out.println(result);
    }
}
