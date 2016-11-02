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
public class PortablePlayer implements Player,Skinnable{
    private int skin = BLACK;
    
    public PortablePlayer(){
        
    }
    @Override
    public void play(){
        System.out.println("再生開始");
    }
    @Override
    public void stop(){
        System.out.println("再生終了");
    }
    @Override
    public void changeSkin(int skin){
        System.out.print("スキンを");
        switch(skin){
             case BLACK:     System.out.print("漆黒");break;
             case RED:       System.out.print("真紅");break;
             case GREEN:     System.out.print("柳葉");break;
             case BLUE:      System.out.print("露草");break;
             case LEOPARD:   System.out.print("豹柄");break;
             default:        System.out.print("無知");break;    
         }
        
        System.out.println("に変更しました。");
    }
}
