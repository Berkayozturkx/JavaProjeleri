import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        int ebob = 0;
        int ekok;

        System.out.print("1.Sayıyı giriniz:");
        sayi1 = input.nextInt();

        System.out.print("2.Sayıyı giriniz:");
        sayi2 = input.nextInt();

        //ebob
        if (sayi2 < sayi1) {
            for (int i = 1; i <= sayi2; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("En büyük ortak bölen:"+ebob);
        } else {
            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("En büyük ortak bölen:"+ebob);
        }

        //ekok
        // EKOK = (sayı1*sayı2)/EBOB
        ekok = (sayi1*sayi2)/ebob;
        System.out.println("En küçük ortak kat:"+ekok);

    }
}
