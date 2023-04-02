import java.util.Scanner;

public class ArmstrongSayilariniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int sayi = input.nextInt();
        int basamakSayisi = 0;
        int geciciSayi = sayi;
        int basamakDegeri;
        int toplam = 0;
        int us;

        //Basamak sayısını bulma
        while (geciciSayi != 0) {
            geciciSayi /= 10;
            basamakSayisi++;
        }

        geciciSayi = sayi;

        //Basamak değerlerini bulma ve bu basamak değerlerinin, basamak sayısı kadar üssünü alma ve toplama.
        while (geciciSayi != 0) {
            basamakDegeri = geciciSayi % 10;

            us = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                us *= basamakDegeri;
            }
            toplam += us;
            geciciSayi /= 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}
