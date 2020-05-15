

public class Gezegen extends GokCismi{
    //GunesSistemi Gezegen objesinden olusturulmus bir array ile gezegen listesini tutmaktadir.
    //Ayni sekilde Gezegen sinifi da Uydu sinifinin bir objesini her gezegenin uydulari icin olacak sekilde bir arrayde tutmaktadir.
    public  int uyduSayisi=1;
    public  Uydu[] uyduListesi=new Uydu [uyduSayisi];
    public Gezegen(int sicaklik,int cap, String isim){
        super( sicaklik, cap, isim);
    }
    public void sesVer(){

        System.out.println("Burasi "+isim+ ". Sicaklik "+sicaklik+"C, Cap "+cap);
    }
    //GunesSistemi icindeki uydulariYazdir ve uyduSayisiniYazdir metodu icin bir Uydu objesini parametre olarak alan ekle metodu olusturuldu.
    //aldigi objeyi yukarida tuttugu ayni turden objeler icin olan arraye eleman olarak eklemektedir.
    public void ekle(Uydu u){
        uyduListesi[uyduListesi.length-1]=u;
        uyduListesi= doubleArray(uyduListesi);


    }
    // uyduListesi arrayinin boyutunu dynamic olarak buyuten ve elemanlarini da olusturdugu yeni arraye ekleyen metod.
    public Uydu[] doubleArray( Uydu [] uyduListesi){
        Uydu [] doubleArr= new Uydu[uyduListesi.length*2];
        for (int i=0;i<uyduListesi.length;i++){
            doubleArr[i]=uyduListesi[i];
        }
        return doubleArr;
    }
}
