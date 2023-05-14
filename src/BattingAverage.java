import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int run = sc.nextInt();
        int out = sc.nextInt();
        int batt = run/out;
        System.out.println(batt);
    }
}

