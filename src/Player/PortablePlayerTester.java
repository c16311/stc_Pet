/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *
 * @author c16311
 */
public class PortablePlayerTester {
    public static void main(String[] args){
        PortablePlayer a = new PortablePlayer();
        a.play();
        a.stop();
        a.changeSkin(Skinnable.GREEN);
    }
}
