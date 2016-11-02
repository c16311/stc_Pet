/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
   https://github.com/c16311/stc_Pet.git
 */
package pet;
import java.util.Random;
/**
 *
 * @author c16311
 */
public class TestPet {
    static void intro(Pet p){
        p.introduce();
    }
    public static void main(String[] args){
        Random rand = new Random();
        Pet[] a = {
            new Pet("Kurt","ライン"),
            new RobotPet("DES","AES"),
            new RobotPet("ダース","ベイダー"),
        };
        for(Pet p:a){
            intro(p);
            if(p instanceof RobotPet)
                ((RobotPet)p).changeSkin(rand.nextInt(Skinnable.GOLD+2));
            System.out.println();
        }
    }
}
