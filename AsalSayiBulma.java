import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();

        int sayac = 0;

        for (int i = 2;i<= (sayi-1);i++){
            if (sayi % i == 0){
                sayac +=1;
            }
        }

        if (sayac == 0){
            System.out.println(sayi +" Asal sayıdır.");
        }else{
            System.out.println(sayi +" Asal sayı değildir.");
        }








    }
}
