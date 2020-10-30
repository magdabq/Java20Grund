/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 * @author magdalenabergqvist
 */
public interface TemplateEmployee {
    
    double bonusfactorManager = 0.3;
    double bonusfactorProgrammer = 0.2;
    double bonusfactorProjectlead = 0.25;
    
    public double calcBonus();
    
}