/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.myproject;

/**
 *
 * @author Expert Info
 */

public class Tv {
    int channel=1; //channel by default is 1
    int volume=1;
    boolean on=false;
    
    public Tv(){}
    public void turnOn(){
        on=true;
    }
    
    public void turnOff(){
    on=false;
    }
    
    public void setChanel(int nCh){
        if(on && nCh >= 1 && nCh <= 120)
            channel=nCh;
    }
     public void setVolume(int nVol){
        if(on && nVol >= 1 && nVol <= 7)
            volume=nVol;
    }
    public void chanSup()
    {
        if(on && channel <120)
            channel++;
    }
     
      public void chanInf()
    {
        if(on && channel >1)
            channel--;
    }
     
    public void volumeSup()
    {
        if(on && volume < 7)
            volume++;
    } 
     
    public void volumeInf()
    {
        if(on && volume >1)
            volume--;
    } 
    
    
    
    
    
    
}
