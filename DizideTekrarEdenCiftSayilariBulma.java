import java.util.Arrays;

public class DizideTekrarEdenCiftSayilariBulma {

    static boolean isHas(int[] list,int value){
        for (int i: list){
            if (i == value){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        int[] array = {21,4,2,19,18,16,12,22,33,6,12,15,6,21,22,4,2};
        int[] tekrarEdenCiftSayilar = new int[array.length];
        int index = 0;

        for (int i = 0 ; i < array.length ; i++){
            for (int k = 0 ; k < array.length ; k++){
                if ((i != k) && (array[i] == array[k]) && (array[i] % 2 == 0)){
                    if (!isHas(tekrarEdenCiftSayilar,array[i])){
                        tekrarEdenCiftSayilar[index] = array[i];
                        index++;

                    }
                    break;
                }
            }
        }
        for (int i: tekrarEdenCiftSayilar){
            if (i != 0){
                System.out.println(i);
            }
        }
    }
}
