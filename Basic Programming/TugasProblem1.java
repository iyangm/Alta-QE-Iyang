import java.util.Scanner;

public class TugasProblem1 {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("selamat datang di perhitungn uas segitiga tugas1");
        System.out.println("masukan alas : ");
        float alas = input.nextFloat();
        System.out.println("masukan tinggi :" );
        float tinggi = input.nextFloat();
        float LuasSegitiga = (alas * tinggi) / 2 ;

        System.out.println("Luas Segitiga adalah : " + LuasSegitiga);
        System.out.println("nuhunnnn");
    }



}
