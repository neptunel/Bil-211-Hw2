


public class GunesSistemi {
    //GunesSistemi Gezegen objesinden olusturulmus bir array ile gezegen listesini tutmaktadir.

    public  int gezegenSayisi = 1;
    public Gezegen[] gezegenListesi = new Gezegen[gezegenSayisi];
    //Yildiz objesi ile yildizEkle metodu extend islemine gerek kalmadan yazilabiliyor.
    Yildiz yildiz = null;
    public void yildizEkle(Yildiz y) {
        if (yildiz == null)
            yildiz = y;
        else
            System.out.println("Sistemde yildiz bulunmaktadir."+y.isim+" eklenemez.");
    }
   // GunesSistemi icindeki gezegenleriYazdir ve gezegenSayisiniYazdir metodu icin bir Gezegen objesini parametre olarak alan ekle metodu olusturuldu.
    //aldigi objeyi yukarida tuttugu ayni turden objeler icin olan arraye eleman olarak eklemektedir.
    public void ekle(Gezegen g) {

        gezegenListesi[gezegenSayisi - 1] = g;
        gezegenListesi = doubleArray(gezegenListesi);
        gezegenSayisi++;
    }

    // gezegenListesi arrayinin boyutunu dynamic olarak buyuten ve elemanlarini da olusturdugu yeni arraye ekleyen metod.
    public Gezegen[] doubleArray(Gezegen[] liste) {
        Gezegen[] doubleArr = new Gezegen[(liste.length) * 2];
        for (int i = 0; i < liste.length; i++) {
            doubleArr[i] = liste[i];

        }
        return doubleArr;
    }

    public void gezegenleriYazdir() {
        for (int i = 0; i < gezegenListesi.length - 1; i++) {
            if (gezegenListesi[i] == null)

                continue;
            System.out.print(gezegenListesi[i].isim + " ");
        }
        System.out.println();
    }

    public void uydulariYazdir() {
        for (int i = 0; i < gezegenListesi.length; i++) {
            if (gezegenListesi[i] == null)
                continue;

            for (int j = 0; j < gezegenListesi[i].uyduListesi.length; j++) {
                if (gezegenListesi[i].uyduListesi[j] == null || gezegenListesi[i] == null)
                    continue;

                System.out.print(gezegenListesi[i].uyduListesi[j].isim + " ");
            }
        }
        System.out.println();
    }

    public void gezegenSayisiniYazdir() {
        System.out.println(gezegenSayisi - 1);
    }

    public void uyduSayisiniYazdir() {

        int count = 0;
        for (int i = 0; i < gezegenListesi.length; i++) {
            if (gezegenListesi[i] == null)
                //System.out.println("bos");
                continue;

            for (int j = 0; j < gezegenListesi[i].uyduListesi.length; j++) {
                if (gezegenListesi[i].uyduListesi[j] == null || gezegenListesi[i] == null)
                    //System.out.println("bos");
                    continue;
                    count+=gezegenListesi[i].uyduSayisi;
            }

        }
        System.out.print(count);
    }

}
