/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lduboeuf.example.observerpattern;

/**
 *
 * @author lionel
 */
public class Formation {
    
    private int idFormation;
    private String nomFormation;
    

    public Formation(String nomFormation) {
        this.nomFormation = nomFormation;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }
    

    public String getNomFormation() {
        return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
        this.nomFormation = nomFormation;
    }
    
    
    
}
