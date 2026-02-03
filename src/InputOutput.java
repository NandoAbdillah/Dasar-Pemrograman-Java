import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        
            Scanner inputUser= new Scanner(System.in);

            System.out.print("Masukkan nama kamu: ");
            String nama =inputUser.nextLine();
            System.out.print("Masukkan umur: ");
            int umur = inputUser.nextInt();


            
            System.out.println("Nama kamu adalah: "+nama);
            System.out.println("Umur Kamu adalah: "+umur);
    }
    
}
