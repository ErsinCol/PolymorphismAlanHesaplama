public class Daire extends Sekil{
    private float radius;

    public Daire(int konumX, int konumY, String renk, int radius){
        super(konumX,konumY,renk);
        this.setRadius(radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double alanHesapla(){
        return Math.pow(getRadius(),2)*Math.PI;
 }


}
