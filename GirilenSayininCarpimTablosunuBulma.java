import java.util.Scanner;

public class GirilenSayininCarpimTablosunuBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int N = input.nextInt();
        int result;

        for(int i = 1; i <= 10;i++){
            result = (N*i);
            System.out.println(N + " x "+ i +" = " + result);
        }
    }
}
