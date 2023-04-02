import java.util.Scanner;

public class ikininKuvvetleriniBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz:");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i *=2){
            System.out.println("Girdiğiniz sayıya kadar olan 2'nin kuvvetleri:"+i);
        }
    }
}
