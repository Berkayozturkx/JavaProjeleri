import java.util.Scanner;

public class PalindromikKelimeleriBulma {

    static boolean isPalindrome(String str){
        int i = 0;
        int j = (str.length()-1);
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String reverse = "";
        for (int i = (str.length() -1) ; i >= 0 ; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }
    return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin lütfen:");
        String kelime = input.nextLine();

        /*if (isPalindrome(kelime)){
            System.out.println("Palindom bir kelime.");
        }else {
            System.out.println("Palindrom olmayan bir kelime.");
        }*/

        if (isPalindrome2(kelime)){
            System.out.println("Palindom bir kelime.");
        }else {
            System.out.println("Palindrom olmayan bir kelime.");
        }
    }
}
