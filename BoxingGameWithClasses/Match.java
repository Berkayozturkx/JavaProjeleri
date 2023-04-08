package BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeigth;
    int maxWeight;


    Match(Fighter f1,Fighter f2, int minWeigth, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeigth = minWeigth;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (f1.isStart()){
            System.out.println("Dövüşe ilk "+this.f1.name+" başladı.");
            this.f2.health = this.f1.hit(this.f2);
            System.out.println(this.f1.name + " Sağlık:"+this.f1.health);
            System.out.println(this.f2.name + " Sağlık:"+this.f2.health);
        }

        if (f2.isStart()){
            System.out.println("Dövüşe ilk "+this.f2.name+" başladı.");
            this.f1.health = this.f2.hit(this.f1);
            System.out.println(this.f1.name + " Sağlık:"+this.f1.health);
            System.out.println(this.f2.name + " Sağlık:"+this.f2.health);
        }

        if (isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("===YENİ ROUND===");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık:"+this.f1.health);
                System.out.println(this.f2.name + " Sağlık:"+this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeigth && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeigth && this.f2.weight <= maxWeight);

    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name+" Boks müsabakasını kazandı.");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name + " Boks Müsabakasını kazandı.");
            return true;
        }
        return false;
    }
}
