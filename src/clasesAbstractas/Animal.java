/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAbstractas;

/**
 *
 * @author edyblau
 */
public abstract class Animal extends SerVivo{

    @Override
    public abstract void alimentarse();

    @Override
    public void respirar() {
        System.out.println("Respiramos por medio de un sistema de pulmones o de branquias");
    }
    
    public void cazar(){
        System.out.println("Cazamos o recolectamos nuestra comida");
    }
}
