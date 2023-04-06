import java.util.Scanner;

public class RecursiveFonksiyonlaDesenMetotOlusturma {
    static void desen(int sayi){
        System.out.print(sayi + " ");
        if (sayi <=0){
            return;
        }
        desen(sayi - 5);
        System.out.print(sayi + " ");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");

        desen(n);
    }
}
