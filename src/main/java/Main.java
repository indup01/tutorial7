
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Good Morning Universe !");
        for(int i = 1;i<= 10;i = i+1){
            System.out.println(i);
        }
        for(int x = 30;x <= 40;x = x+1){
            sum = sum + x;
        }
        System.out.println(sum);

        //The program must print 1.4 to the power n for integer n from 1 to 5.

        for(int i = 1; i < 6; i++){
            double power = Math.pow(1.4,i);
            System.out.println(power);
        }
        System.out.println("Goodbye, Universe !");
    }
}
