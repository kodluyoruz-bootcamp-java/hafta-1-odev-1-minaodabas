package Araba;

public class Araba {

    public String renk;
    public Integer model_yili;
    public String marka;

    public Araba(){
        System.out.println("Parametresiz araba nesnesi olusturuldu");
    }
    public Araba(String marka, String renk, Integer model_yili){
        System.out.println("Parametreli araba nesnesi olusturuldu");
        this.marka = marka;
        this.renk = renk;
        this.model_yili = model_yili;
    }
    void print(){
        System.out.println("Marka:" + marka);
        System.out.println("Renk:" + renk);
        System.out.println("Model yili:" + model_yili);
    }


}
