import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplam= 0;

        do{
            System.out.print("Sayı giriniz:");
            sayi = input.nextInt();
            if (sayi%2 != 0){
                toplam += sayi;
            }

        }while (sayi > 0);
        System.out.println("Girilen tek sayıların toplamı:"+toplam);
    }
}
