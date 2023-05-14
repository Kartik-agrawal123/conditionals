import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] ch = new char[s.length()];
        for(int i = 0;i<=ch.length-1;i++){
            ch[i] = s.charAt(i);
        }
        int start = 0;
        int end = ch.length-1;
        while(start<=end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        String name = new String(ch);
        if(name.equals(s)){
            System.out.println(name+" it is a reverse");
        }
        else{
            System.out.println(name+" it is not a revrse");
        }
    }
}
