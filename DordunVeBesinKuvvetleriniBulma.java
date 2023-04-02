import java.util.Scanner;

public class DordunVeBesinKuvvetleriniBulma {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        sayi = scan.nextInt();

        for (int i = 1, j = 1; i <= sayi && j <= sayi; i *=4,j *= 5){
            System.out.println(i + "\t" + j);
        }
    }
}
