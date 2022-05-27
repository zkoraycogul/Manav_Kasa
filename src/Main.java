import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0,armutKg,elmaKg,domatesKg,muzKg,patlicanKg,total;

        System.out.print("Kac Kg Armut Aldın : ");
        armutKg = input.nextDouble();

        System.out.print("Kac Kg Elma Aldın : ");
        elmaKg = input.nextDouble();

        System.out.print("Kac Kg Domates Aldın : ");
        domatesKg = input.nextDouble();

        System.out.print("Kac Kg Muz Aldın : ");
        muzKg = input.nextDouble();

        System.out.print("Kac Kg Patlıcan Aldın : ");
        patlıcanKg = input.nextDouble();

        total = armutKg*armut + elmaKg*elma + domatesKg*domates + muz*muzKg + patlıcan*patlıcanKg;

        System.out.println("Toplam Odenen Ucret = " + total);


    }
}
