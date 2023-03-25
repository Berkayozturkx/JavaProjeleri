import java.util.Scanner;

public class TaksimetreUcretHesaplama {
    public static void main(String[] args) {
        /*
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        double km,ucret,acilis = 10,tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km = input.nextDouble();

        ucret = acilis + (km*2.20);

        tutar = (ucret < 20) ? 20 : ucret;

        System.out.println("Ödenecek Tutar:" + tutar);
    }
}
