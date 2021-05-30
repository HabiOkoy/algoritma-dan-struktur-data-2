package Tugas6;
	public class No1_App {
	    public static void main (String[] args){
	        No1 tumpukan = new No1(5);
	        tumpukan.push(50);
	        tumpukan.baca();
	        System.out.println(" ");
	        System.out.println(" ");
	        tumpukan.push(100);
	        tumpukan.baca();
	        System.out.println(" ");
	        System.out.println(" ");
	        tumpukan.pop();
	        tumpukan.baca();
	        System.out.println(" ");
	        System.out.println(" ");
	        tumpukan.push(60);
	        tumpukan.baca();
	        System.out.println(" ");
	        System.out.println(" ");
	        tumpukan.push(80);
	        tumpukan.baca();
	        System.out.println(" ");
	        System.out.println(" ");
	        tumpukan.pop();
	        tumpukan.baca();
	        System.out.println(" ");
	        System.out.println(" ");
	        long nilaitop = tumpukan.peek();
	        System.out.println("Nilai Top = "+ nilaitop);
	        
	        System.out.println();
	        System.out.println("M ilham Nur Habibie W");
	        }
	}
