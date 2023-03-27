import java.util.Scanner;

public class SinifGecmeDurumunuHesaplama {
    public static void main(String[] args) {

        double matematik,fizik,turkce,kimya,muzik,toplam = 0,ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        matematik = input.nextDouble();
        if (matematik >= 0 && matematik <= 100){
            toplam += matematik;
        }else {
            toplam += 0;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextDouble();
        if (fizik >= 0 && fizik <= 100){
            toplam += fizik;
        }else {
            toplam += 0;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextDouble();
        if (turkce >= 0 && turkce <= 100){
            toplam += turkce;
        }else {
            toplam += 0;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextDouble();
        if (kimya >= 0 && kimya <= 100){
            toplam += kimya;
        }else {
            toplam += 0;
        }

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextDouble();
        if (muzik >= 0 && muzik <= 100){
            toplam += muzik;
        }else {
            toplam += 0;
        }

        ortalama = (toplam/5);

        if (ortalama >= 55){
            System.out.println("Sınıfı başarıyla tamamladın. Not ortalaman:"+ ortalama);
        }else {
            System.out.println("Not ortalaman yüzünden sınıf tekrarına kaldın. Not Ortalaman:" + ortalama);
        }


    }
}
