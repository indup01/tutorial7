
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int factorial = 1;
        System.out.println("Good Morning Universe !");
        for(int i = 1;i<= 10;i = i+1){
            System.out.println(i);
        }
        for(int x = 30;x <= 40;x = x+1){
            sum = sum + x;
        }
        System.out.println(sum);
        for(int i = 1;i<= 5;i = i+1){
            factorial = 1;
            for(int n = i;n>= 1;n = n-1){
                factorial = factorial*n;
            }
            System.out.println(factorial);
        }



    }
}
