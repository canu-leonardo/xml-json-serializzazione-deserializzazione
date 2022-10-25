package com.itismeucci.it;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{ 
    private static void serializza(Classe c){
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writeValue(new File ("miaclasse.xml"), c);
        } catch (Exception e) {
            System.out.println("errore nel file");
        }
    }

    private static Classe deserializza(String nomeFile){
        Classe miaClasse = new Classe();
        XmlMapper mapper = new XmlMapper();
        try {
            miaClasse = mapper.readValue(new File(nomeFile), Classe.class);
        } catch (Exception e) {
            System.out.println("errore nel leggere il file");
        }

        return miaClasse;
    }
    
    
    public static void main( String[] args )
    {
        Date data = new Date(2004, 1, 2);
        Date data1 = new Date(2004, 2, 3);
        Date data2 = new Date(2004, 3, 4);
        Date data3 = new Date(2004, 4, 5);
        Date data4 = new Date(2004, 5, 6);
        Alunno alunno1 = new Alunno("marco", "marco", data );
        Alunno alunno2 = new Alunno("gianni", "gianni", data1 );
        Alunno alunno3 = new Alunno("franco", "franco", data2 );
        Alunno alunno4 = new Alunno("mario", "mario", data3 );
        Alunno alunno5 = new Alunno("luigi", "luigi", data4 );

        ArrayList <Alunno> alunni = new ArrayList<>();
        alunni.add(alunno1);
        alunni.add(alunno2);
        alunni.add(alunno3);
        alunni.add(alunno4);
        alunni.add(alunno5);

        Classe classe = new Classe(5, "DIA", "10-TW", alunni);

        serializza(classe);

        Classe classe_ritornata = deserializza("miaclasse.xml");
        
        System.out.println(classe_ritornata.toString());

        
    }
}
