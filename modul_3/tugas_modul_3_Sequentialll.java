/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3_algoritma_pencarian;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class tugas_modul_3_Sequentialll {
    public static void main(String[]args){
        System.out.println("***** SEQUENTIAL SEARCH *****"+"\n");
        String data[] = {"Galileo "," Archimedes "," Alkhawarizmi "," Aljabar "," Habibie "," Tesla "};
        String key;

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang akan dicari:");
        key = scan.nextLine();

        System.out.print("Isi data adalah:");
        for(int i=0; i < data.length;i++) {

            System.out.print(data[i] + "");
        }
        System.out.println("");

        for(int i=0; i <= data.length; i++) {
            if (key.equalsIgnoreCase(data[i])) {
                System.out.print("Data" + key + " berada pada indeks ke -" + i);
                break;
            }
        }
            System.out.println("\n");
            System.out.println();
            System.out.println("***** TERIMA KASIH *****");

            }
        }

