import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();

        int s1 = 0, s2 = 1;
        int toplam = 0;

        System.out.print(sayi +" Elemanlı Fibonacci Seri:");

        for (int i = 1; i <= sayi; i++){

            System.out.print(s1+" ");
            toplam = s1+s2;
            s1 = s2;
            s2 = toplam;

        }
    }
}
