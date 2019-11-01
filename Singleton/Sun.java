/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public class Sun {
    
    private static Sun sun;
    
    private Sun() {};
    
    public static Sun getSun() {
        if(sun == null) {
            sun = new Sun();
        }
        return sun;
    }
    
    public void spellIt() { System.out.println("Sun"); }
}
