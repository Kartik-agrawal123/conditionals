import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int time= sc.nextInt();
        float rate = sc.nextFloat();
        double CI = principal*Math.pow((1+rate/100),time);
        System.out.println(CI);
    }
}
