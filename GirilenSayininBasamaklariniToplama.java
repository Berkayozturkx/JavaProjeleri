import java.util.Scanner;

public class GirilenSayininBasamaklariniToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,geciciSayi,basamakDegeri,toplam=0;
        System.out.print("Basamak sayıları toplamını bulmak istediğiniz sayıyı giriniz:");
        sayi = input.nextInt();

        geciciSayi = sayi;
        while(geciciSayi !=0){
            basamakDegeri = geciciSayi%10;
            toplam += basamakDegeri;
            geciciSayi /= 10;
        }
        System.out.println(toplam);
    }
}
