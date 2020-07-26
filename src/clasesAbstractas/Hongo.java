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
public class Hongo extends SerVivo{

    @Override
    public void alimentarse() {
        System.out.println("Nos alimentamos como parásitos o con materia de desecho orgánica");
    }

    @Override
    public void respirar() {
        System.out.println("Respiramos de manera anaerobia, pero también aerobia.");
    }
    
    public void vivir(){
        System.out.println("Puedo existir en diferentes tamanos y formas");
    }
    
}
