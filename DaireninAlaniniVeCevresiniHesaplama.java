import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplama {
    public static void main(String[] args) {
        double yariCap, cevre, alan, pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Alanını ve çevresini bulmak istediğiniz dairenin yarı çapını giriniz:");
        yariCap = input.nextDouble();

        cevre = 2*pi*yariCap;
        alan = pi*yariCap*yariCap;

        System.out.println("Dairenin Çevresi:" + cevre);
        System.out.println("Dairenin Alanı:" + alan);



    }
}
