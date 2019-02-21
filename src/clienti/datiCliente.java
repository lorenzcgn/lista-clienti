package clienti;
import java.io.*;
import java.util.*;

    public class datiCliente {
        private String nome= new String();
        private String telefono=new String();
        private String progetto=new String();
        private String cognome=new String();
        private int costoPreventivato;
        Scanner s=new Scanner(System.in);

 
    public datiCliente()
    {
        System.out.println("Nome: ");
        do{
            nome=s.nextLine();
        }while(nome.length()<3);
        
        System.out.println("Cognome: ");
        do{
            cognome=s.nextLine();
        }while(cognome.length()<3);
        
        System.out.println("Telefono: ");
        do{
        telefono=s.nextLine();
        }while(telefono.length()!=10);
        
        System.out.println("Progetto: ");
        do{
        progetto=s.nextLine();
        }while(progetto.length()<3);
        
        System.out.println("Costo preventivato: ");
        do{
        costoPreventivato=s.nextInt();
        }while(costoPreventivato<100);
    }
    
    public void stampa()
    {
        System.out.println("Nome:"+nome+ " | cognome:"+cognome+ " | telefono:"+telefono+ " | progetto:"+progetto+ " | costo preventivato:"+costoPreventivato);
    }
    
    public String scrivi() {
        return "Nome:"+nome+ " | cognome:"+cognome+ " | telefono:"+telefono+ " | progetto:"+progetto+ " | costo preventivato:"+costoPreventivato;
    }
    
    
    
    
}
