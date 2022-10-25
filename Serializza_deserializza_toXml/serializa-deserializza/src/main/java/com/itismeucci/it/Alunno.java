package com.itismeucci.it;

import java.util.Date;

public class Alunno {
    
    private String nome;
    private String cognome;
    private Date dataNascita;


    public Alunno() {  }
    
    
    public Alunno(String nome, String cognome, Date dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
    }
    
    
    public String getNome() {  return nome;  }

    public void setNome(String nome) {  this.nome = nome;  }

    public String getCognome() {  return cognome;  }

    public void setCognome(String cognome) {  this.cognome = cognome;  }

    public Date getDataNascita() { return dataNascita;  }

    public void setDataNascita(Date dataNascita) {  this.dataNascita = dataNascita;  }


    public String toString(){
        String s;
        s = "   -" + this.nome + " "  + this.cognome + 
            ", nato il "  + dataNascita.getDate() + "." + dataNascita.getMonth() + "." + dataNascita.getYear() + "\n";
        return s;
    }
}
