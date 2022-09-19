import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, acilis = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafe (KM) : ");
        km = input.nextInt();
        total = (km * perKm);
        total += acilis;

        total = (total <20) ? 20 : total;
        System.out.println("Toplam Tutar (TL) : " + total);
    }
}
