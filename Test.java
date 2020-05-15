

public class Test {
    public static void main(String[] args){
        Gezegen g1 = new Gezegen(-210,49200,"Neptun"); // degiskenler sicaklik-cap-isim
        Gezegen g2 = new Gezegen(60,6700,"Mars"); // degiskenler sicaklik-cap-isim
        Gunes gunes = new Gunes();
        Dunya dunya = new Dunya();
        Ay ay = new Ay();
        Uydu u1 = new Uydu(-235,2700,"Triton");
        Uydu u2= new Uydu(-40,11,"Phobos");
        Uydu u3= new Uydu(-60,400,"Proteus");
        GunesSistemi sistem = new GunesSistemi();
        dunya.ekle(ay); // Dunyanin uydu listesine ay eklendi.
        g1.ekle(u1);
        g2.ekle(u2);
        g1.ekle(u3);
        sistem.ekle (g1); // GunesSisteminin gezegen listesine g1 eklendi.
        sistem.ekle (g2);
        sistem.ekle (dunya);
        sistem.yildizEkle(gunes); // GunesSisteminin yildiz degiskenine gunes eklendi.
        Yildiz antares = new Yildiz(6000,150000,"antares","NotronYildizi");
        sistem.yildizEkle(antares); // sisteme onceden yildiz eklendigi icin hata mesaji verir.
        dunya.sesVer();
        ay.sesVer();
        gunes.sesVer();
        g1.sesVer();
        u1.sesVer();
        u2.sesVer();
        antares.sesVer();
        System.out.println(dunya.uyduSayisi);
        System.out.println(gunes.tip);
        sistem.gezegenleriYazdir(); // sistemdeki gezegenleri yazdirir.
        sistem.uydulariYazdir(); // sistemdeki uydulari yazdirir.
        sistem.gezegenSayisiniYazdir(); // sistemdeki gezegen sayisini yazdirir.
        sistem.uyduSayisiniYazdir(); // sistemdeki uydu sayisini yazdirir.
    }
}
