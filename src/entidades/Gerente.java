/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jsouza
 */
public class Gerente {
    String nome;
    String ID;

    public Gerente(String nome, String ID) {
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public String getID() {
        return ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}

