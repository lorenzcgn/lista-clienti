/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienti;
import java.io.*;
import java.util.*;

/**
 *
 * @author 75844087
 */
public class listaClienti {
    
    private Vector elenco;
    public listaClienti()
    {
        elenco=new Vector(1,1);
    }
    
    
    public void aggiungiCliente(datiCliente v)
    {
        elenco.addElement(v);
    }
    
    public void eliminaCliente(int indice)
    {
        try
        {
            elenco.removeElementAt(indice);
        }
        catch(Exception e)
        {
            System.out.println("Eliminazione impossibile");
        }
    System.out.println("Eliminazione fatta");
    }
    
    public void visualizza() throws IOException
    {
        FileWriter w;
        w=new FileWriter("Clienti.txt");
        BufferedWriter b;
        b=new BufferedWriter (w);
        b.write("- Clienti Studio Denstistico -");
        
        datiCliente v;
        System.out.print("\n- Clienti Studio Denstistico -\n");
        for(int i=0; i<elenco.size();i++)
        {
            
            b=new BufferedWriter (w);
            b.write("- Clienti Studio Denstistico -");
            b.write("\n");
            System.out.print("Cliente "+i+" ==> ");
            b.write("Cliente "+i+" ==> ");
            v=(datiCliente)elenco.elementAt(i);
            v.stampa();
            b.write(v.scrivi()+"\n");
            System.out.println("");
            b.flush();
           
        }
        
        System.out.println("Ho salvato la lista dei tuoi clienti sul file Clienti.txt");
    }

}
