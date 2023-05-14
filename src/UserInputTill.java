import java.util.Scanner;

public class UserInputTill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Take integer inputs till the user enters 0 and print the sum of all numbers
//        int sum = 0;
//        while(true){
//            int n = sc.nextInt();
//            if(n == 0){
//                System.out.println(sum);
//                return;
//            }
//            else{
//                sum = sum + n;
//            }
//        }

//        Take integer inputs till the user enters 0 and print the largest number from all
        int max = 0;
        while(true){
            int n =sc.nextInt();
            if(n == 0){
                System.out.println(max);
                return;
            }
            else{
                if(max<=n){
                    max= n;
                }
            }
        }
    }
}
