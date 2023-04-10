public class DizilerdeMinVeMaxDegerBulma {

    static void minVeMaksDeger(int[] list){
        int min = list[0];
        int max = list[0];
        for (int i = 1 ; i < list.length ; i++){
            if (list[i] < min){
                min = list[i];
            }
            if (list[i]> max){
                max = list[i];
            }
        }
        System.out.println("Girilen dizinin maksimum değeri: "+max+" minimum değeri: "+ min);
    }


    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,-2,-6,13,-234,456};
        minVeMaksDeger(list);
    }
}
