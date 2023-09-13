import java.util.Scanner;

public class ucakBiletiFiyatiHesaplama {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
    yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
    İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */

    public static void main(String[] args) {
        int yas, secim,indirim = 0, odenecekTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi km cinsinden belirtiniz.");
        double mesafe;
        mesafe = scanner.nextInt();
        double biletFiyati = mesafe*(0.10);

        if(mesafe<=0){
            System.out.println("Hatalı veri girdiniz. Tekrar deneyiniz.");
            mesafe = scanner.nextInt();
        }
        else {
            System.out.println("Sonraki ..");
        }


        System.out.println("Yolculuk Tipinizi seçiniz:");
        System.out.println("1)Tek Yön");
        System.out.println("2)Gidiş-Dönüş Yön");
        secim = scanner.nextInt();
        if(secim>2 || secim<1){
            System.out.println("Hatalı veri girdiniz. Tekrar deneyiniz.");
            secim = scanner.nextInt();
        }
        if(secim==2){
            indirim += (int) ((biletFiyati * (20)) / 100);
            odenecekTutar = (int) (biletFiyati - indirim);

        }
        else {
            System.out.println("Sonraki ..");
        }

        System.out.println("Yaşınızı giriniz.");
        yas = scanner.nextInt();
        if(yas<=0){
            System.out.println("Hatalı veri girdiniz. Tekrar deneyiniz.");
            yas = scanner.nextInt();
        }
        if(yas<=12){
            indirim += (int) ((biletFiyati*(50))/100);
            odenecekTutar = (int) (biletFiyati-indirim);
            System.out.println("Bilet Fiyatı:" + odenecekTutar);

        }

        if(12<yas && yas<=24){
            indirim += (int)((biletFiyati*(10))/100);
            odenecekTutar = (int) (biletFiyati-indirim);
            System.out.println("Bilet Fiyatı:" + odenecekTutar);
        }


        if(yas>=65) {
            indirim += (int) ((biletFiyati * (30)) / 100);
            odenecekTutar = (int) (biletFiyati - indirim);
            System.out.println("Bilet Fiyatı:" + odenecekTutar);
        }
    }
}
