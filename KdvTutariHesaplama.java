import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        /*
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
        KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        double kdvliTutar, kdvsizTutar, kdvOrani;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz:");
        kdvsizTutar = input.nextDouble();

        kdvOrani = (kdvsizTutar > 0) && (kdvsizTutar <= 1000) ? 0.18 : 0.08;

        kdvliTutar = kdvsizTutar + (kdvsizTutar * kdvOrani);

        System.out.println("Girdiğiniz KDV'siz Tutar:" + kdvsizTutar);
        System.out.println("Girdiğiniz Tutarın KDV Oranı:" + kdvOrani);
        System.out.println("Girdiğiniz Tutarın KDV'li Hali:" + kdvliTutar);
    }
}
