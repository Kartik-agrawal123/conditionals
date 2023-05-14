import java.util.Scanner;

public class ComissionPer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        double commper = sc.nextInt();
        double commission = (commper/100)*amount;
        System.out.println(commission);
    }
}
