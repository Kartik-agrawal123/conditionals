import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ques = (n1>n2)?n2:n1;
        int hcf = 0;
        for(int i = 1;i<=ques;i++){
            if(n1%i == 0 && n2%i == 0){
                hcf = i;
            }
        }
        System.out.println(hcf);
    }
}
