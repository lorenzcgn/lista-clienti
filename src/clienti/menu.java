package clienti;
import java.io.*;
import java.util.*;


    public class menu {
    Scanner s=new Scanner(System.in);
    
    private void mostraMenu()
    {
        System.out.println("Scegli che operazione eseguire inserendo il numero corrispondente");
        System.out.println("1: Aggiungi cliente");
        System.out.println("2: Elimina cliente");
        System.out.println("3: Visualizza lista clienti");
        System.out.println("4: Esci");
    }

    public int scelta()
    {
        int scelta;
        mostraMenu();
        System.out.println("\n-> ");
        
        try
        {
            String numeroLetto=s.nextLine();
            scelta=Integer.valueOf(numeroLetto).intValue();
        }
        catch(Exception e) 
        {
            scelta=0;
        }
        
        return scelta;
    }

        
    public int leggiIndice() {
            
        int indice;
        System.out.print("\nCliente da eliminare: ");
        
        try
        {
            String numeroLetto=s.nextLine();
            indice=Integer.valueOf(numeroLetto).intValue();
        }
        catch(Exception e) 
        {
            indice=-1;
        }
        
        return indice;
}
}
