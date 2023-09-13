import java.util.Scanner;

public class havaSicakligi {
    /*
    Koşullar :
    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
     */

    public static void main(String[] args) {
        int sicaklik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz-->");
        sicaklik = scanner.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (5<=sicaklik && sicaklik<=15) {
            System.out.println("Sinema etkinliğini değerlendirebilirsiniz.");
        } else if (15<=sicaklik && sicaklik<=25) {
            System.out.println("Piknik etkinliğini değerlendirebilirsiniz.");
        }
        else{
            System.out.println("Yüzme etkinliğini değerlendirebilirsiniz.");
        }

    }
}
