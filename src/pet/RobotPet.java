/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;
/**
 *
 * @author c16311
 */
public class RobotPet extends Pet implements Skinnable{
    public RobotPet(String name,String masterName){
        super(name,masterName);
    }
    
    @Override public void introduce(){
        System.out.println("◆私はロボット。名前は"+GetName()+"です。");
        System.out.println("◆ご主人様は"+GetMasterName()+"です。");
    }
    public void work(int sw){
        switch(sw){
            case 0:System.out.println("掃除します。");
            break;
            case 1:System.out.println("選択します。");
            break;
            case 2:System.out.println("炊事します。");
            break;
        }
    }
    @Override
    public void changeSkin(int skin){
         System.out.print("スキンを");
         switch(skin){
            case RIGHTBLACK:    System.out.print("ライトブラック");
            break;
            case GARNET:        System.out.print("ガーネット");
            break;
            case EMERALD:       System.out.print("エメラルド");
            break;
            case MARINEBLUE:    System.out.print("マリンブルー");
            break;
            case GOLD:          System.out.print("ゴールド");
            break;
            default:            System.out.print("フォーマット");
            break;    
        }
         System.out.println("に変更しました。");
     }
}