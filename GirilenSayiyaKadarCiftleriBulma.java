import java.util.Scanner;

public class GirilenSayiyaKadarCiftleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz:");
        sayi = input.nextInt();

        for (int sayac = 0; sayac <= sayi; sayac+=1){
            if (sayac%2== 0){
                System.out.println("0 ile "+ sayi + " arasındaki çift sayılar:"+sayac);
            }else {
                continue;
            }

        }
    }
}
