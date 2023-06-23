import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nilai : ");
        int nilai = input.nextInt();
        String hasil;

        if(nilai >= 80 && nilai <= 100) {
            hasil ="A";
            System.out.println("nilai anda adalah : " + hasil);
        } else if (nilai >= 65 && nilai <= 79) {
            hasil = "B+";
            System.out.println("nilai anda adalah : " + hasil);
        } else if (nilai >= 50 && nilai <= 4) {
            hasil = "B";
            System.out.println("nilai anda adalah : " + hasil);
        } else if (nilai >= 35 && nilai <= 49) {
            hasil = "C";
            System.out.println("nilai anda adalah : " + hasil);
        } else if (nilai >= 0 && nilai <= 34) {
            hasil = "D";
            System.out.println("nilai anda adalah : " + hasil);
        } else {
            hasil = "Invalid";
            System.out.println("nilai anda adalah : " + hasil);
        }


    }
}
