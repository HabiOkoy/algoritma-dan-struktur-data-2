package Tugas7;
public class No1_App {
    public static void main(String[] args){
                No1 antrian = new No1(9);
                antrian.queue(9);
                antrian.display();
                antrian.queue(8);
                antrian.display();
               
               
            
                System.out.println("yang diambil dari antrian = "+ antrian.queue());
                System.out.println("nama saya muhamad ilham nur habibie");
                antrian.display();
                
             
                antrian.queue(9);
                antrian.display();
                antrian.queue(8);
                antrian.display();
                
                System.out.println("nilai yang paling depan = "+ antrian.queue());
    }    
}

