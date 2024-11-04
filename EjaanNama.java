
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class EjaanNama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter their first name
        System.out.print("Masukkan nama depan anda untuk dieja: ");
        String nama = scanner.nextLine();

        System.out.println("Ejaan untuk \"" + nama + "\" adalah:");

        // Loop through each character in the name and print it with its position
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }

        System.out.println("BUILD SUCCESSFUL");
        scanner.close();
    }
}
