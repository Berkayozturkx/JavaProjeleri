import java.util.Scanner;

public class SayilariBuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı:");
        a = input.nextInt();

        System.out.print("2.Sayı:");
        b = input.nextInt();

        System.out.print("3.Sayı:");
        c = input.nextInt();

        if (a>b && b>c){
            System.out.println(a+">"+b+">"+c);
        } else if (b>a && a>c) {
            System.out.println(b+">"+a+">"+c);
        } else if (a>c && c>b) {
            System.out.println(a+">"+c+">"+b);
        } else if (c>a && a>b) {
            System.out.println(c+">"+a+">"+b);
        } else if (c>b && b>a) {
            System.out.println(c+">"+b+">"+a);
        } else {
            System.out.println(b+">"+c+">"+a);
        }


    }
}