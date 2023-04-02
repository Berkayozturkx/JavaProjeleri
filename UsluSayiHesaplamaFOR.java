import java.util.Scanner;

public class UsluSayiHesaplamaFOR {
    public static void main(String[] args) {
        long sayi,us,sonuc=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssünü alacağınız sayıyı giriniz:");
        sayi = input.nextLong();

        System.out.print(sayi +" sayısının kaçıncı kuvvetini almak istediğinizi giriniz:");
        us = input.nextInt();

        if (sayi > 0 && us >= 0){
            for (long i = sayi,j = 1; j <= us;j+=1){
                sonuc *= i;
            }

            System.out.println("Sonuç:"+sonuc);

        }else {
            System.out.println("Hatalı sayı girişi yaptınız.");
        }
    }
}
