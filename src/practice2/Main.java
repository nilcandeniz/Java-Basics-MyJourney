package practice2;

abstract class Emeklilik{
    int SGK_GirisYili;
     abstract boolean sorgula(String meslek,int calismaSuresi);

}

class erkek extends Emeklilik{

    @Override
     boolean sorgula(String meslek,int calismaSuresi) {
        int girisYil = 2025-SGK_GirisYili;
        if(meslek.equals("4A")) {
            calismaSuresi += (calismaSuresi *20)/100;
        }else {
            calismaSuresi += (calismaSuresi * 7)/100;
        }

        if(calismaSuresi > 5500 && girisYil > 25) {
            return true;
        }else {
            return false;
        }
    }
}

class kadın extends Emeklilik{


    @Override
    public boolean sorgula(String meslek,int calismaSuresi) {

        int girisyil = 2025-SGK_GirisYili;

        if(meslek.equals("4A")) {
            calismaSuresi += (calismaSuresi *15)/100;
        }

        if(calismaSuresi> 5000 && girisyil > 20) {
            return true;
        }else {
            return false;
        }

    }


}

abstract class Ucret{

    public abstract int setMaas(int primGunu,int primTl);

}

class ISCI extends Ucret {



    @Override
    public int setMaas(int primGunu, int primTl) {

        if (primGunu > 5000 && primTl <= 20) {
            return 5500 + (primTl * 11) / 100;

        } else if (primGunu > 5000) {
            return 6750 + (primTl * 13) / 100;

        }
        return 0;
    }
}



class MEMUR extends Ucret {

    @Override
    public int setMaas(int primGunu, int primTl) {

        if (primGunu > 5200 && primTl >= 11 && primTl <= 20) {
            return 7500 - (primTl * 3) / 100;

        } else if (primGunu > 5200 && primTl >= 21 && primTl <= 50) {
            return 8300 - (primTl * 6) / 100;

        } else {
            return 0; // şartlar sağlanmıyorsa maaş yok
        }
    }
}

class EYT{
    int yas;
    int sgk_girisYili;
    Emeklilik emeklilikRolu;
    Ucret ucretRol;

    public EYT(int yas,int sgk_girisYili) {           // c sorusu
        this.yas = yas;
        this.sgk_girisYili = sgk_girisYili;
    }

    public EYT(int sgk_girisYili) {
        this.sgk_girisYili = sgk_girisYili;
    }

}

public class Main {

    public static void main(String[] args) {

        EYT eyt1 = new EYT(1950);
        

        eyt1.emeklilikRolu = new erkek();
        eyt1.emeklilikRolu.SGK_GirisYili = 1950;
        boolean sonuc = eyt1.emeklilikRolu.sorgula("4A", 5500);

        if(sonuc) {
            System.out.println("bu erkek emekli olabilir");
        }else {
            System.out.println("bu erkek emekli olamaz");
        }

        eyt1.emeklilikRolu = new kadın();
        eyt1.emeklilikRolu.SGK_GirisYili = 1960;
        boolean sonuc2 = eyt1.emeklilikRolu.sorgula("4B", 5200);

        if(sonuc2) {
            System.out.println("bu kadın emekli olabilir");
        }else {
            System.out.println("bu kadın emekli olamaz");
        }

        eyt1.ucretRol = new ISCI();

        int sonuc1 = eyt1.ucretRol.setMaas(6000, 100);
        System.out.println("işciye yapılan emeklilik maaş tutarı  : "+sonuc1);

        eyt1.ucretRol = new MEMUR();
        int sonuc3 = eyt1.ucretRol.setMaas(5000, 100);
        System.out.println("memura yapılan emeklilik maaş tutarı :  "+sonuc3);






    }

}