import java.util.Scanner;

public class AveargeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Calculate Average Marks
//        int n = sc.nextInt();
//        int sum = 0 , c = 0;
//        for(int i= 1;i<=n;i++){
//            int marks = sc.nextInt();
//            sum = sum + marks;
//            c++;
//        }
//        int avg = sum/c;
//        System.out.println(avg);

//        Sum Of N Numbers
        int n = sc.nextInt();
        int sum = 0;
        for(int i= 1;i<=n;i++){
            int marks = sc.nextInt();
            sum = sum + marks;
        }
        System.out.println(sum);
    }
}
