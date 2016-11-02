/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

/**
 *  着せ替えインターフェイス
 * @author c16311
 */
public interface Skinnable {
    //public static finalという扱い
    int BLACK = 0;
    int RED   = 1;
    int GREEN = 2;
    int BLUE  = 3;
    int LEOPARD=4;
    //public abstractという扱い
    void changeSkin(int skin);
}
