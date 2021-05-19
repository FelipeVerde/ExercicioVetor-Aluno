/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividade.aula7.java;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Aluno {
    public void atividade2(){
        String disc[] = {"Português ", "Matemática ", "Física ", "História ", "Geografia "};
        double n[] = new double[5];
        String result = "";
        String m = "";
        
         for (int i = 0; i < disc.length; i++) {
            n[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + disc[i]));
            result += disc[i] + ": " + n[i] + "\n";
            m = "Média do aluno: " + (n[0] + n[1] + n[2] + n[3] + n[4]) /5 ;
            
        }
          JOptionPane.showMessageDialog(null, result);
          JOptionPane.showMessageDialog(null,m);
    }
        public void atividade3 () {
        String disc[] = {"Português ", "Matemática ", "Física ", "História ", "Geografia "};
         double n[] = new double[5];
         int num = Integer.parseInt(JOptionPane.showInputDialog("Número da disciplina" ));
         JOptionPane.showMessageDialog(null, disc[num] + " - " + n[num]);
         
                   
        }
 
        
        
       
    
    
  
}

