
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        
        String [] nama= new String[5];
        
        Scanner input = new Scanner(System.in);

        for (int i=0; i<nama.length; i++) {
           System.out.print("Masukkan Nama Siswa: ");
           nama[i]= input.nextLine();
        }
        System.out.println("Terdapat " + nama.length+ " Siswa: ");
        for (int i=0; i<nama.length; i++) {
            System.out.println(i+1 + " " + nama[i]);
        }
    }
    
}
