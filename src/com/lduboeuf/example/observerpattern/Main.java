/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lduboeuf.example.observerpattern;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lionel
 */
public class Main implements FormationForm.FormationEventListener {

    FormationForm dialog;

    public Main() {
        dialog = new FormationForm(new javax.swing.JFrame(), true);
        //on s'abonne aux évènements générés par le formulaire
        dialog.addEventListener(this);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main();

            }
        });
    }

    @Override
    public void onCreatedFormation(Formation newForm) {
       Logger.getLogger(Main.class.getName()).log(Level.INFO, "Nouvel évènement reçu:" + newForm.getNomFormation());
    }

    @Override
    public void onUpdatedFormation(Formation updatedForm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
