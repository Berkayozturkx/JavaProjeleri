import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
         */
        int matematik, fizik, kimya, turkce, tarih, muzik;
        float ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Not ortalamanız:" + ortalama);

        String sonuc = ortalama > 60 ? "\nGeçti" : "\nKaldı";
        System.out.println(sonuc);
    }
}