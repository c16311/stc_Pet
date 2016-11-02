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
public class DVDPlayer implements ExPlayer{
    @Override
     public void play(){
        System.out.println("DVD再生開始！");
    }
    @Override
    public void stop(){
        System.out.println("DVD再生終了！");
    }
    @Override
    public void solw(){
        System.out.println("DvDスロー再生開始！");
    }
}
