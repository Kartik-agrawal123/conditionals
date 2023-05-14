import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalPrice = sc.nextInt();
        int discount = sc.nextInt();
        int discountPrice = originalPrice-(originalPrice*discount/100);
        System.out.println(discountPrice);
    }
}
