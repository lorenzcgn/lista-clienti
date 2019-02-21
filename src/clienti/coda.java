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
 * @author barbara
 */
public class coda {
    
    private Vector elementi;
    public coda()
    {
    elementi=new Vector();
    }
    
    public void aggiungi(Object obj)
    {
     elementi.addElement(obj);
    }
    
    
    public Object togli()
    {
     Object obj=null;
     int size=elementi.size();
     
     if(size>0)
     {
      obj=elementi.elementAt(0);
      elementi.removeElementAt(0);
     }
     return obj;
    }
    
    public Object testa()
    {
     Object obj=null;
     int size=elementi.size();
     
     if(size>0)
     {
      obj=elementi.elementAt(0);
     }
     return obj;
    }
    
    public boolean vuota()
    {
     if(elementi.size()>0) return false;
     else return true;
    }        
    
    
    public int size()
    {
     return elementi.size();
    }
            
            
}
