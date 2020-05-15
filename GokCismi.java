
public class GokCismi {
    int sicaklik;
    int cap;
    String isim;
    String tip;
    // uydu ve gezegen icin constructor
    public GokCismi(int sicaklik,int cap,String isim) {
        this.sicaklik = sicaklik;
        this.cap = cap;
        this.isim = isim;
    }
    // yildiz icin constructor
    public  GokCismi(int sicaklik,int cap, String isim, String tip){
        this.sicaklik = sicaklik;
        this.cap = cap;
        this.isim = isim;
        this.tip = tip;

    }
    //default constructor mainde olusturulan parametresiz gunes ,dunya ve ay objeleri kendilerine uygun constructor bulsun diye yapildi.
    public GokCismi(){

    }
    public void sesVer(){
        //Bu method sub-classinin alacagi parametreler farkli oldugundan sub-classlar icinde override edilecektir.
        System.out.println("Burasi "+isim+ ". Sicaklik "+sicaklik+"C, Cap "+cap);
    }
}
