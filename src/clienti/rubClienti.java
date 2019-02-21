package clienti;
import java.io.*;
import java.util.*;


public class rubClienti {

    public static void main(String[] args) throws IOException {
        listaClienti Clienti=new listaClienti();
        menu Scelta= new menu();
        
        int scelta;
        
        scelta=Scelta.scelta();
        
        while (scelta !=4)
        {
            if (scelta==1) 
            {
                datiCliente v=new datiCliente();
                Clienti.aggiungiCliente(v);
            }
            else if (scelta==2)
            {
                int indice=Scelta.leggiIndice();
                Clienti.eliminaCliente(indice);
            }
            else if (scelta==3)
            {
                Clienti.visualizza();
            }
            scelta=Scelta.scelta();
        }

        
        System.out.println("Fine programma");
    }
    
}
