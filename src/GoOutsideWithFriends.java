import java.util.Scanner;
//count the number of days he can go out in the month of August.
public class GoOutsideWithFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=31;i++){
            if(i%2 == 0) {
                System.out.println(i + " day Go outside with friends !");
            }
        }
    }
}
