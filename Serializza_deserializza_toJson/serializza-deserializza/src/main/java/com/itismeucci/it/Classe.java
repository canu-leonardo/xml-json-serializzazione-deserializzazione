package com.itismeucci.it;

import java.util.ArrayList;

public class Classe {
    private int anno;
    private String sezione;
    private String aula;
    private ArrayList<Alunno> alunni = new ArrayList<>();


    public Classe() {  }

    
    public Classe(int anno, String sezione, String aula, ArrayList<Alunno> alunni) {
        this.anno = anno;
        this.sezione = sezione;
        this.aula = aula;
        this.alunni = alunni;
    }  
    
    
    public int getAnno() {  return anno;  }
    
    public void setAnno(final int anno) {  this.anno = anno;  }

    public String getSezione() {  return sezione;  }

    public void setSezione(final String sezione) {  this.sezione = sezione;  }

    public String getAula() {  return aula;  }

    public void setAula(final String aula) {  this.aula = aula;  }

    public ArrayList<Alunno> getAlunni() {  return alunni;  }

    public void setAlunni(final ArrayList<Alunno> alunni) {  this.alunni = alunni;  }



    public String toString(){
        String s;

        s = this.anno + " " + this.sezione + ", nell'aula " + this.aula + "; alunni: \n";

        for (int i = 0 ; i< alunni.size(); i++){
            s = s + alunni.get(i).toString();
        }

        return s;
    }
    
}