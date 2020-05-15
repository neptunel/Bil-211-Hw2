# Bil-211-Hw2
Lab 2
Bu labta basit bir güneş sistemi modellemesi yapacaksınız. Aşağıdaki sınıfları yazmanız gerekiyor.
GokCismi, Gezegen, Uydu, Yildiz, GunesSistemi, Gunes, Dunya, Ay
Bu sınıfların bazılarının arasında kalıtım ilişkisi bulunmakta, bazılarında bulunmamaktadır. Bunları
siz bulmalısınız.
Aşağıdaki main metodun çalışması gerekiyor. Main metodun bulunduğu classın adı "Test" olmalı.
Main metod üzerinde sadece yapamadığınız metodları yorum satırına alabilirsiniz. Onun dışında hiç
bir değişiklik yapamazsınız.



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


Dunyanın sıcaklık degeri 25, çapı 12700 olmalı. Ismi "Dunya" olmalı.
Ayın sıcaklığı -23 , çapı 3400 Ismi "Ay" olmalı.
Güneşin sıcaklığı 5500, çapı 130000 olmalı, Ismi "Gunes", tipi "SariCuce" olmalı.



Çıktı:

Sistemde yildiz bulunmaktadir. Antares eklenemez.

Burasi Dunya. Sıcaklik 25C, Cap 12700

Burasi Ay. Sıcaklik -23C, Cap 3400
Burasi Gunes. Sıcaklik 5500C, Cap 130000, tipi SariCuce
Burasi Neptun. Sıcaklik -210C, Cap 49200
Burasi Triton. Sıcaklik -235C, Cap 2700
Burasi Phobos. Sıcaklik -40C, Cap 11
Burasi Antares. Sıcaklik 6000C, Cap 150000, tipi NotronYildizi
1
SariCuce
Neptun Mars Dunya
Triton, Proteus, Phobos, Ay
3
4



Yolladığınız kodlarda türkçe karakter bulunamaz, aksi halde değerlendirilmeyecektir.
Yolladığınız kodlarda package bilgisi bulunamaz. package lab2; benzeri tüm satırlar tüm java
dosyalarından silinmelidir. Yukarıda da belirtildiği üzere Test classında değişiklik yapamazsınız
(yorum satırına almak haricinde). Gerekli(doğru) kalıtım ilişkisini kuramayanlardan puan
kırılacaktır. Başarılar.
