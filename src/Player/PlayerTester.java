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
public class PlayerTester {
    public static void main(String[] args){
        Player[] a = new Player[3];
        a[0] = new VideoPlayer();
        a[1] = new CDPlayer();
        a[2] = new DVDPlayer();
        
        for(Player p:a){
            p.play();
            p.stop();
            System.out.println();
        }
    }
}
