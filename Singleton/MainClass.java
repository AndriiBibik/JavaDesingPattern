/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy
 */
public class MainClass {
    public static void main(String[] args) {
        Sun sun1 = Sun.getSun();
        Sun sun2 = Sun.getSun();
        sun1.spellIt();
        sun2.spellIt();
        System.out.println(sun1);
        System.out.println(sun2);
    }
}
