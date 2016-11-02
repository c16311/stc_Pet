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
public class CDPlayer implements Player {
    
    @Override
     public void play(){
        System.out.println("CD再生開始！");
    }
    @Override
    public void stop(){
        System.out.println("CD再生終了！");
    }
    public void cleaning(){
        System.out.println("ヘッドをクリーニングしました。");
    }
}
