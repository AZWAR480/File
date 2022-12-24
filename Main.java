import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        PC p = new PC ();
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    int mau;
    while (true){

        System.out.println("==Selamat Datang di Warnet kami ===");
        System.out.println("Username :" +p.usernameU);
        System.out.println("Password "+p.passwordU);
       User u = new User ();
        u.TimeSet();

    }


        boolean bError = true;

        do {
            in.reset();
            System.out.println("==== MENU =====");
            System.out.println("1. Pilih Ruang ");
            System.out.println("2. Pilih Billing");
            System.out.print("masukkan pilihan: ");
            int pilih = input.nextInt();
            if (pilih == 1){
                try {

                    File file = new File("Ruang.txt");
                    PrintWriter output = new PrintWriter(file);
                    try {
                        System.out.println("2.Ruang REGULER ");
                        System.out.println("2.Ruang VIP ");
                        System.out.print("masukkan pilihan: ");
                        int u = input.nextInt();
                        output.close();
                        bError = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Inputan salah!");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("File mu gaada bro!");
                }

            }else if(pilih == 2){
                try {
                    File file = new File("PC.txt");
                    PrintWriter output = new PrintWriter(file);
                    try {
                        System.out.println("2.PC VIP ");
                        System.out.println("2.PC REGULER ");
                        System.out.print("masukkan pilihan: ");
                        int p = input.nextInt();
                        output.close();

                    } catch (InputMismatchException e) {
                        System.out.println("Inputan salah!");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("File mu gaada bro!");
                }
            }
        }while (bError) ;



    }
}