import java.util.Scanner;

public class burcBulanProgram {
    /*
    Koç Burcu : 21 Mart - 20 Nisan          | 21 Mart(3) <= KoçBurcu <= 20 Nisan(4)
    Boğa Burcu : 21 Nisan - 21 Mayıs        22 (4) <= Boğa Burcu <= 21(5)
    İkizler Burcu : 22 Mayıs - 22 Haziran
    Yengeç Burcu : 23 Haziran - 22 Temmuz
    Aslan Burcu : 23 Temmuz - 22 Ağustos
    Başak Burcu : 23 Ağustos - 22 Eylül
    Terazi Burcu : 23 Eylül - 22 Ekim
    Akrep Burcu : 23 Ekim - 21 Kasım
    Yay Burcu : 22 Kasım - 21 Aralık
    Oğlak Burcu : 22 Aralık - 21 Ocak
    Kova Burcu : 22 Ocak - 19 Şubat
    Balık Burcu : 20 Şubat - 20 Mart
     */

    public static void main(String[] args) {
        int gun, ay;

        Scanner sc = new Scanner(System.in);
        System.out.println("Doğduğunuz gün:");
        gun = sc.nextInt();

        System.out.println("Doğduğunuz ay:");
        ay = sc.nextInt();

        if(21<=gun && 3==ay || ay<=4 && gun==20){
            System.out.println("Koç burcu");
        }
        if(22<=gun && 4==ay || ay==5 && gun<=21){
            System.out.println("Boğa burcu");
        }
        if(22<=gun && 5==ay || ay==6 && gun<=22){
            System.out.println("İkizler burcu");
        }
        if(23<=gun && 6==ay || ay==7 && gun<=22){
            System.out.println("Yengeç burcu");
        }
        if(23<=gun && 7==ay || ay==8 && gun<=22){
            System.out.println("Aslan burcu");
        }
        if(23<=gun && 8==ay || ay==9 && gun<=22){
            System.out.println("Başak burcu");
        }
        if(23<=gun && 9==ay || ay==10 && gun<=22){
            System.out.println("Terazi burcu");
        }
        if(23<=gun && 10==ay || ay==11 && gun<=21){
            System.out.println("Akrep burcu");
        }
        if(22<=gun && 11==ay || ay==12 && gun<=21){
            System.out.println("Yay burcu");
        }
        if(22<=gun && 12==ay || ay==1 && gun<=21){
            System.out.println("Oğlak burcu");
        }
        if(22<=gun && 1==ay || ay==2 && gun<=19){
            System.out.println("Kova burcu");
        }
        if(20<=gun && 2==ay || ay==3 && gun<=20){
            System.out.println("Balık burcu");
        }









        }

    }

