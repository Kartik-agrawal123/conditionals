import java.util.Scanner;
//print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfNeg = 0 , sumOfPosEven = 0 , sumOfPosOdd = 0;
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                System.out.println(sumOfNeg+" "+sumOfPosEven+" "+sumOfPosOdd);
                break;
            }
            else{
                if(n<0){
                    sumOfNeg = sumOfNeg+n;
                }
                if(n>0 && n%2 == 0){
                    sumOfPosEven = sumOfPosEven+n;
                }
                if(n>0 && n%2!=0){
                    sumOfPosOdd = sumOfPosOdd+n;
                }
            }
        }
    }
}
