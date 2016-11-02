/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

//import Player.*;

/**
 *  着せ替えインターフェイス
 * @author c16311
 */
public interface Skinnable {
    //public static finalという扱い
    int RIGHTBLACK = 0;
    int GARNET   = 1;
    int EMERALD = 2;
    int MARINEBLUE  = 3;
    int GOLD=4;
    //public abstractという扱い
    void changeSkin(int skin);
}
