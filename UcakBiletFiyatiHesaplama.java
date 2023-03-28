import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        int yas,mesafe,tip;
        double tutar = 0,indirim = 0,toplam = 0;
        boolean hata = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe(KM) bilgisini giriniz:");
        mesafe = input.nextInt();
        System.out.print("Yaş bilginizi giriniz:");
        yas = input.nextInt();
        System.out.print("1 => Tek Yön\n2 => Gidiş-Dönüş\nYolculuk tipini giriniz:");
        tip = input.nextInt();

        if (yas < 0){
            hata = true;
        }else if (yas < 12){
            indirim = 0.5;
        } else if (yas >= 12 && yas <= 24) {
            indirim = 0.1;
        } else if (yas >= 65) {
            indirim = 0.3;
        } else {
            indirim = 0;
        }


        if (mesafe < 0){
            hata = true;
        }else {
            tutar = mesafe * 0.10;
        }

        if (tip == 1){
            toplam = tutar -(tutar * indirim);
        } else if (tip == 2) {
            toplam = 2*((tutar -(tutar * indirim)) - ((tutar -(tutar * indirim))*0.2));
        } else {
            hata = true;
        }


        if (hata) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Toplam tutar "+toplam+"TL");
        }
    }
}
