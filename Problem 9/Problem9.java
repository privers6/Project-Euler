public class Problem9 {
    private static final int sum = 1000;

    public static void main(String[] args){
        for(int a = 1; a < sum; a++){
            for(int b = a + 1; b < sum; b++){
                int c = sum - a - b;
                if(c > b && a * a + b * b == c * c) {
                    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }
}
