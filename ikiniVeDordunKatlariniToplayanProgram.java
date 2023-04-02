import java.util.Scanner;

public class ikiniVeDordunKatlariniToplayanProgram {
    public static void main(String[] args) {
        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */

        int sayi,toplam = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz:");
            sayi = input.nextInt();
            if ((sayi % 4 == 0)){
                toplam += sayi;
            }
        }while (sayi % 2 == 0);
        System.out.println("Girilen çift ve dördün katı sayıların toplamı:"+toplam);
    }
}
