import java.util.Scanner;

public class havaSicakligiHesaplama {
    /*
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz-->");
        int sicaklik = scanner.nextInt();

        String result = (sicaklik < 5) ? "Kayak" :
                (((sicaklik >= 5) && (sicaklik <= 15)) ? "Sinema" :
                        (((sicaklik >= 10) && (sicaklik <= 25)) ? "Piknik" :
                                ((sicaklik > 25) ? "Yüzme" : "Be safe")));
        System.out.println(result);
    }
}
