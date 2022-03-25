public class PolymorphismApp  { // main class
    // bir modülün duruma göre farklı biçimlerde davranabilmesi özelliğidir
    // türetilmiş sınıf aynı zamanda temel sınıf gibi ele alınabilir
    // overriding ve overloadingte bir polmorphism öreniğidir
    public static void main(String[] args) {

        Sekil[] sekiller=new Sekil[3];

        Daire daire1=new Daire(20,20,"mavi",2);
        Daire daire2=new Daire(20,20,"sarı",3);
        Dikdortgen dikdortgen=new Dikdortgen(70,55,"yeşil",3,6);

        // polymorphism sayesinde farklı tipte diziler oluşturabiliriz
        sekiller[0]=daire1;
        sekiller[1]=daire2;
        sekiller[2]=dikdortgen;

        // tek tek kod yazmak yerine toplu işlemler yapılabilir
        for(int i=0;i<3;i++){
            System.out.println(sekiller[i].alanHesapla());
        }
        System.out.println("*************************");

        sekilYazdir(daire1);
        sekilYazdir(dikdortgen);

        sekilYazdir2(daire1);
        sekilYazdir2(dikdortgen);

        //yazılımlara yeni özellikler daha kolay eklenebilir
        Sekil ucgen1=new EskenarUcgen(10,5,"yeşil",10);
        sekilYazdir(ucgen1);

    }
    // polymorphism olmasayadı programa eklenicek her şekil için istemcinin method içersinde değişiklik yapması gerekicekti
    public static void sekilYazdir2(Sekil genelSekil){
        if(genelSekil instanceof Daire){
            Daire daire=(Daire) genelSekil;
            System.out.println("Alanı(cok bicimlilik olmasaydı)="+daire.alanHesapla());
        }
        else if (genelSekil instanceof Dikdortgen) {
            Dikdortgen dikdortgen = (Dikdortgen) genelSekil;
            System.out.println(dikdortgen);
            System.out.println("Alanı(cok bicimlilik olmasaydı)=" + dikdortgen.alanHesapla());
        }

    }
    // polymorphism sayesinde istemci değişiklik yapmadan farklı şekilleri desteklemesini sağlıyor
    public static void sekilYazdir(Sekil genelSekil){
        System.out.println(genelSekil.position());
        System.out.println("Alanı: "+genelSekil.alanHesapla());
    }
}
