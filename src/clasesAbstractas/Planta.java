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
public class Planta extends SerVivo{

    @Override
    public void alimentarse() {
        System.out.println("Me alimento mediante fotosíntesis");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro consumiendo O2 y expulsando CO2");
    }
    
}
