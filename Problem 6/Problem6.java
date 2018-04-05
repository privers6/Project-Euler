public class Problem6 {
    private static final int ceiling = 100;

    /*
        The difference can be made simple by the following equation.
        (a + b + ... + n)^2 - (a^2 + b^2 + ... + n^2) = 2(ab + ac + ... + mn)
     */
    public static void main(String[] args){
        int result = 0;
        for(int i = 1; i <= ceiling; i++){
            for(int j = 1; j <= ceiling; j++){
                if(i != j)
                   result += (i * j);
            }
        }
        System.out.println(result);
    }
}
