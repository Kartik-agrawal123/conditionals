import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%100 == 0){
            System.out.println("it is a century year");
        }
        if(year%4 ==0){
            System.out.println("it is a leap year");
        }
    }
}
