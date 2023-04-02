import java.util.Scanner;

public class UcveDordeBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        /*
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
        tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */


        Scanner input = new Scanner(System.in);
        int sayi,toplam = 0,bolunenSayiSayisi = 0;
        double sonuc= 0;
        System.out.print("Bir sayı giriniz:");
        sayi = input.nextInt();

        for (int i = 0;i <= sayi; i++){
            if (i%3 == 0 && i%4 == 0){
                toplam += i;
                bolunenSayiSayisi +=1;
            }

        }
        sonuc = toplam/bolunenSayiSayisi;
        System.out.println("0'dan "+sayi+"'ya kadar 3 ve 4'e bölünen sayıların toplamı:"+sonuc);
    }
}
