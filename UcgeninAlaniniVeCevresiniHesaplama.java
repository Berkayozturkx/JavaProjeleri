import java.util.Scanner;

public class UcgeninAlaniniVeCevresiniHesaplama {
    public static void main(String[] args) {
        double birinciKenar, ikinciKenar, ucuncuKenar,alan,cevre, a;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin birinci kenarını giriniz:");
        birinciKenar = input.nextDouble();

        System.out.print("Üçgenin birinci kenarını giriniz:");
        ikinciKenar = input.nextDouble();

        System.out.print("Üçgenin birinci kenarını giriniz:");
        ucuncuKenar = input.nextDouble();

        cevre = birinciKenar + ikinciKenar+ ucuncuKenar;
        a = (birinciKenar + ikinciKenar+ ucuncuKenar)/2;
        alan = Math.sqrt((a*(a-birinciKenar)*(a-ikinciKenar)*(a-ucuncuKenar)));

        System.out.println("Üçgenin çevresi:" + cevre);
        System.out.println("Üçgenin Alanı:" + alan);

    }
}
