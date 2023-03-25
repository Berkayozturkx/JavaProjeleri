import java.util.Scanner;

public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz:");
        kilo = input.nextDouble();

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz:");
        boy = input.nextDouble();

        sonuc = kilo / (boy*boy);

        System.out.println("Vücut Kitle Endeksiniz:" + sonuc);
    }
}
