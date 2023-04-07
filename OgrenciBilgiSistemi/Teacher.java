package OgrenciBilgiSistemi;

public class Teacher {

    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı \t:"+this.name);
        System.out.println("Telefon No \t:"+this.phoneNumber);
        System.out.println("Branşı \t:"+this.branch);
    }

}
