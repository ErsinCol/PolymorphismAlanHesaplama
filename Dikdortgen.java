public class Dikdortgen extends Sekil{
    private float genislik;
    private float uzunluk;

    public Dikdortgen(double konumX,double konumY,String renk,float genislik,float uzunluk){
        super(konumX,konumY,renk);
        this.setUzunluk(uzunluk);
        this.setGenislik(genislik);
    }


    public float getGenislik() {
        return genislik;
    }

    public void setGenislik(float genislik) {
        this.genislik = genislik;
    }

    public float getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(float uzunluk) {
        this.uzunluk = uzunluk;
    }
    @Override
    public double alanHesapla(){
        return this.uzunluk*this.genislik;
    }
}
