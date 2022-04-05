/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dto;

/**
 *
 * @author Junior S. De Los Santos V.
 */
public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar) {
       this.cantidadDeAzucar = cantidadDeAzucar;
    }
    
    public void setCantidadDeAzucar(int param1){}
    
    public int getCantidadDeAzucar(){
        return this.cantidadDeAzucar;
    }
    
    public boolean hasAzucar(int cantidadDeAzucar){
        return this.cantidadDeAzucar >= cantidadDeAzucar;
    }
    
    public void giveAzucar(int cantidadDeAzucar){
        this.cantidadDeAzucar -= cantidadDeAzucar;
    }
}
