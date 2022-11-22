import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner klavye=new Scanner(System.in);
        System.out.print("BİR SAYİ GİRİN: ");
        int sayi= klavye.nextInt();
        int toplam=0;
        int sayac=0;


        for (int i = 0; i <=sayi ; i++) {
            if (i%12==0){
                System.out.print(i+" ");
                sayac++;
                toplam+=i;
            }

        }
        System.out.println();
        double ortalama=toplam/(sayac-1);
        System.out.println("3 ve 4'e bölünen sayıların toplamı: " +toplam);
        System.out.println("3 ve 4'e bölünen sayıların ortalaması: " +ortalama);
}}