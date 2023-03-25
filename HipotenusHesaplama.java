import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
         */

        double birinciKenar, ikinciKenar, hipotenus;
        Scanner input = new Scanner(System.in);

        System.out.print("Dik üçgenin birinci kenarını giriniz:");
        birinciKenar = input.nextFloat();

        System.out.print("Dik üçgenin ikinci kenarını giriniz:");
        ikinciKenar = input.nextFloat();

        hipotenus = Math.sqrt(((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar)));

        System.out.println("Bilgilerini girdiğiniz dik üçgenin hipotenüsü:" + hipotenus);
    }
}
