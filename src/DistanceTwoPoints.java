import java.awt.*;
import java.util.Scanner;

public class DistanceTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextInt();
        double x2 = sc.nextInt();
        double y1 = sc.nextInt();
        double y2 = sc.nextInt();
        double d1 = Math.pow((x2-x1),2);
        double d2 = Math.pow((y2-y1),2);
        double dist = d1+d2;
        double distance = Math.sqrt(dist);
        System.out.println(distance);

    }
}
