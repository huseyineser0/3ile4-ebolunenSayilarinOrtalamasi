import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*int sayi;
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        sayi=scan.nextInt();

        for (int i=0; i<=sayi; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }*/
        /*
         Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
         3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

        int sayi;
        int adet = 0;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        sayi = scan.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }

        }
        double ortalama = toplam / adet;
        System.out.println("ortalama :" + ortalama);


    }
}
