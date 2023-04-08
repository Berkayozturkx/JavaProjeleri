package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    //Kurucu metot
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Maaşa uygulanacak olan vergi miktarını hesaplayan fonksiyon
    double tax(){
        int maas = this.salary;
        double vergiMiktari;
        double vergiTutari;
        if (this.salary == 1000){
            return 0;
        }else{
            vergiMiktari = 0.03;
            vergiTutari = maas*vergiMiktari;
            return vergiTutari;
        }

    }

    // Çalışma saati üzerinden verilecek ek ücreti hesaplayan fonksiyon
    double bonus(){
        int calismaSaati = this.workHours;
        double bonusUcret;
        if (calismaSaati >= 40){
            bonusUcret = (calismaSaati-40)*30;
            return bonusUcret;
        }else{
            return 0;
        }
    }

    //İşe giriş yılına bağlı olarak yapılacak zam miktarını belirleyen fonksiyon
    double raiesSalary(){
        int baslangic = 2021;
        double zamMiktari,zamTutari;
        if ((baslangic - this.hireYear) < 10){
            zamMiktari = 0.05;
            zamTutari = this.salary*zamMiktari;
            return zamTutari;
        } else if((baslangic - this.hireYear) > 9 && (baslangic - this.hireYear) < 20){
            zamMiktari = 0.10;
            zamTutari = this.salary*zamMiktari;
            return zamTutari;
        }else{
            zamMiktari = 0.15;
            zamTutari = this.salary*zamMiktari;
            return zamTutari;
        }
    }

    //Çalışanın bilgilerini ekrana yazdıran fonksiyon
    void bilgiGoster(){
        System.out.println("Çalışanın Adı: "+this.name);
        System.out.println("Çalışanın Maaşı: "+this.salary);
        System.out.println("Çalışanın Haftalık Çalışma Saati: "+this.workHours);
        System.out.println("Çalışanın İşe Giriş Tarihi: "+this.hireYear);
        System.out.println("Çalışanın vergisi: "+ this.tax());
        System.out.println("Çalışanına verilecek olan bonus ücret: "+ this.bonus());
        System.out.println("Çalışana yapılacak olan maaş artışı: "+ this.raiesSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+((this.salary+this.raiesSalary())-(this.tax()+this.bonus())));
        System.out.println("Toplam maaş: "+ (this.salary+this.raiesSalary()));
    }
}
