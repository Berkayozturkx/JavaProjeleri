import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        float sayi;
        float toplam = 0.0f;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi = input.nextFloat();

        for (float i = 1F; i <= sayi;i +=1){
            toplam += 1/i;
        }
        System.out.println("Girdiğiniz Sayıya Kadar Olan Harmonik Serinin Toplamı:"+ toplam);
    }
}
