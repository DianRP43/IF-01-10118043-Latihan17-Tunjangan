
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static double tunjangan;
    public static void main(String[] args) {
        // TODO code application logic herE
        double GajiPokok;
        System.out.println("========== Program Tunjangan =========");
        System.out.print("Berapa Gaji pokok anda perbulan ?\t: Rp. ");
        Scanner scanner = new Scanner(System.in);
        GajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda ? (Menikah/Belum)\t\t: ");
        scanner = new Scanner(System.in);
        
        if (scanner.next().toUpperCase().equals("MENIKAH")) {
            tunjangan = 35 * GajiPokok / 100;
        }
        System.out.println("=============== Hasil ===============");
        System.out.println("Gaji Pokok\t\t : Rp. "+ GajiPokok);
        System.out.println("Tunjangan\t\t : Rp. "+ tunjangan);
        System.out.println("Total Gaji\t\t : Rp. "+(GajiPokok + tunjangan));
                
        
    }
    
}
