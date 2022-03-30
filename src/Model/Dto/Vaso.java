/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dto;

/**
 *
 * @author Junior S. De Los Santos V.
 */
public class Vaso {
    private int cantidadVasos;
    private int contenido;
    
    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }    

    public boolean hasVasos(int cantidadVasos) {
        return this.cantidadVasos >= cantidadVasos;
    }

    public void giveVasos(int cantidadVasos) {
        this.cantidadVasos -= cantidadVasos;
    }

    public int getCantidadVasos() {
       return this.cantidadVasos;
    }
    
    public int getContenido(){
        return this.contenido;
    }
}
