/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dto;

/**
 *
 * @author Junior S. De Los Santos V.
 */
public class Cafetera {
    private int cantidadCafe;

    Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }
    
    public void setCantidadDeCafe(int cantidadCafe){
        this.cantidadCafe = cantidadCafe;
    }
    
    public int getCantidadDeCafe(){
       return this.cantidadCafe;
    }
    
    public boolean hasCafe(int cantidadCafe){
        return this.cantidadCafe >= cantidadCafe;
    }
    
    public void giveCafe(int cantidadCafe){
        this.cantidadCafe -= cantidadCafe;
    }
}
