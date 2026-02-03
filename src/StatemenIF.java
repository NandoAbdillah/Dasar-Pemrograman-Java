import java.util.Scanner;

public class StatemenIF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan umur: ");
        int umur = input.nextInt();
        if (umur > 0 && umur < 5) {
            System.out.println("Kamu masih Balita, Masa untuk Bermain!");
        } else if (umur >= 5 && umur < 7) {
            System.out.println("Kamu mulai aktif, Sekolah Taman Kanak-Kanak!");
        } else if (umur > 6 && umur < 13) {
            System.out.println("Anak-anak");
            System.out.println("Sudah waktunya Sekolah Dasar!");
        } else if (umur > 12 && umur < 16) {
            System.out.println("Remaja");
            System.out.println("Sudah waktunya Sekolah Mnengah Pertama!");
        } else if (umur >= 16 && umur < 19) {
            System.out.println("Remaja");
            System.out.println("Sekolah Menengah Atas/Kejuruan Sudah waktunya memikirkan pendidikan lanjut ");
        } else if (umur > 18 && umur < 30) {
            System.out.println("Dewasa");
            if (umur > 25 && umur < 30) {
                System.out.println("Berkeluarga");
            }
        }

        else {
            System.out.println("Lansia");
        }

    }

}
