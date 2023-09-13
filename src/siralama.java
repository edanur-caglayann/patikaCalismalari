import java.util.Scanner;

public class siralama {
    /*
    Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
     */

    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sayıyı giriniz:");
        sayi1 = scanner.nextInt();
        System.out.println("2.Sayıyı giriniz:");
        sayi2 = scanner.nextInt();
        System.out.println("3.Sayıyı giriniz:");
        sayi3 = scanner.nextInt();

        if (sayi2 < sayi1 && sayi2 < sayi3) {
            if(sayi1<sayi3){
                System.out.println("Sonuc:"+sayi2+"<"+sayi1+"<"+sayi3);
            }
            else {
                System.out.println("Sonuc:"+sayi2+"<"+sayi3+"<"+sayi1);
            }
        }

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            if(sayi2<sayi3){
                System.out.println("Sonuc:"+sayi1+"<"+sayi2+"<"+sayi3);
            }
            else {
                System.out.println("Sonuc:"+sayi1+"<"+sayi3+"<"+sayi2);
            }
        }

        if (sayi3 < sayi1 && sayi3 < sayi2) {
            if(sayi1<sayi2){
                System.out.println("Sonuc:"+sayi3+"<"+sayi1+"<"+sayi2);
            }
            else {
                System.out.println("Sonuc:"+sayi3+"<"+sayi2+"<"+sayi1);
            }
        }




    }
}
