package nomehilo;
import java.util.Scanner;


class NomeHilo extends Thread{
    Scanner t = new Scanner(System.in); 
    public NomeHilo(String nom){
        super(nom);
    }
    public void run(){
        
        System.out.println("Numero de veces a repetir");
        int n = t.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.println("Este es el thread "+getName());
        }
    }
}

