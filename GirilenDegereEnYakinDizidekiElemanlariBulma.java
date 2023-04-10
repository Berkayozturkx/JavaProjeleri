import java.util.Arrays;

public class GirilenDegereEnYakinDizidekiElemanlariBulma {

    static void elemanBulma(int[] list,int value){
        int min = 0;
        int max = 0;

        Arrays.sort(list);


        for (int i = 0 ; i < list.length ; i++){
            if (list[i] > value){
                min = list[i-1];
                max = list[i];
                break;
            }
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Girilen sayı: "+value);
        System.out.println("Bu sayıdan küçük en yakın sayı: " + min);
        System.out.println("Bu sayıdan büyük en büyük sayı: "+ max);
    }



    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        elemanBulma(list,13);
    }
}
