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
public class Pet {
    private String name;
    private String masterName;
    
    public Pet(String name,String masterName){
        this.name = name;
        this.masterName = masterName;
    }
    public String GetName(){ return name;};
    public String GetMasterName(){ return masterName;};
    
    public void introduce(){
        System.out.println("▪僕の名前は"+name+"です。");
        System.out.println("▪ご主人様の名前は"+masterName+"です。");
    }
}
