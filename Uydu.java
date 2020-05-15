
public class Uydu extends GokCismi {
    public Uydu(int sicaklik,int cap, String isim){
        super( sicaklik, cap, isim);
    }
    public void sesVer(){

        System.out.println("Burasi "+isim+ ". Sicaklik "+sicaklik+"C, Cap "+cap);
    }
}
