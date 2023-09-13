import java.util.Scanner;

public class artikYil {
    /*
    Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
    Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

    1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
    100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

    Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
    Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
     */

    public static void main(String[] args) {
         int yil;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        yil = scanner.nextInt();

        if(yil%400==0){
            System.out.println("Artık yıl.");
        } else if (yil%400!=0) {
            System.out.println("Artık yıl değil.");
        }
     else {
            System.out.println("Yanlış bilgi girdiniz.");
        }
    }
}
