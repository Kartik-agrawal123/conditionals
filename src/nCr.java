import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(result);
    }
    static int factorial(int value){
        int product = 1;
        for(int i = value;i>0;i--){
            product = product*i;
        }
        return product;
    }
}
