import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bolenToplam = 0;

        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();

        //Kendisi dışındaki pozitif bölenlerini bulma
        for (int i = 1; i < sayi;i++){
            if (sayi % i == 0){
             bolenToplam += i;
            }
        }

        if (bolenToplam == sayi){
            System.out.println(sayi + " Mükemmel sayıdır.");
        }else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
