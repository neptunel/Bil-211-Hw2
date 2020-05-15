

public class Yildiz extends  GokCismi {

    public Yildiz(int sicaklik,int cap, String isim, String tip){
        super( sicaklik, cap, isim,  tip);
    }
    public void sesVer(){
        System.out.println("Burasi "+isim+ ". Sicaklik "+sicaklik+"C, Cap "+cap+", tipi "+tip);
    }
}
