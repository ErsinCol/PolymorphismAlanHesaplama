public abstract class Sekil { //abstract class base class
    private double konumX;
    private double konumY;
    private String renk;

    public Sekil(double konumX,double konumY,String renk){
        this.konumX=konumX;
        this.setKonumY(konumY);
        this.setRenk(renk);
    }

    public double getKonumX(){
        return konumX;
    }

    public void setKonumX(double konumX){
        this.konumX=konumX;
    }


    public double getKonumY() {
        return konumY;
    }

    public void setKonumY(double konumY) {
        this.konumY = konumY;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void konumDegistir(double konumX,double konumY){
        this.setKonumX(konumX);
        this.setKonumY(konumY);
    }

    public abstract double alanHesapla();

    public String position(){
        return "Konumu: ("+this.getKonumX()+","+this.getKonumY()+") -Rengi: "+this.getRenk();
    }
}

