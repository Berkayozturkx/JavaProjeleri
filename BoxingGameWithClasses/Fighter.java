package BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodgeRatio;
    int startRatio;

    Fighter(String name, int damage, int health,int weight,int dodgeRatio){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodgeRatio >= 0 && dodgeRatio <= 100){
            this.dodgeRatio = dodgeRatio;
        }else{
            this.dodgeRatio = 0;
        }
        this.startRatio = 50;
    }

    int hit(Fighter foe){
        System.out.println(this.name + "=> "+ foe.name + " "+this.damage+ " hasar vurdu.");
        if (foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }

        if (foe.health - this.damage < 0){
            return 0;
        }
        return foe.health-this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodgeRatio;
    }

    boolean isStart(){
        double randomNumber = Math.random() * 100;
        return randomNumber < this.startRatio;
    }
}
