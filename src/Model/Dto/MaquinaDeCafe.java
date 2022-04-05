/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dto;

/**
 *
 * @author Junior S. De Los Santos V.
 */

public class MaquinaDeCafe {

    private Cafetera cafe;
    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;
    private Azucarero azucar;

    public Vaso getTipoVaso(String vasoTipo) {
        switch (vasoTipo) {
            case "pequeno":
                return this.getVasoPequeno();
            case "mediano":
                return this.getVasoMediano();
            case "grande":
                return this.getVasoGrande();
        }
        return null;
    }

    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        
        if(!this.azucar.hasAzucar(cantidadDeAzucar)) return "No hay Azucar";
        
        if(!this.cafe.hasCafe(tipoDeVaso.getContenido())) return "No hay Cafe";
        
        if(!tipoDeVaso.hasVasos(cantidadDeVasos)) return "No hay Vasos";
        
        this.azucar.giveAzucar(cantidadDeAzucar);
        this.cafe.giveCafe(tipoDeVaso.getContenido());
        tipoDeVaso.giveVasos(cantidadDeVasos);
        
        return "Felicitaciones";
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafe = cafetera;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequenos = vasosPequeno;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMedianos = vasosMediano;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrandes = vasosGrande;
    }

    public void setAzucarero(Azucarero azucarero) {
        this.azucar = azucarero;
    }

    public Cafetera getCafetera() {
        return this.cafe;
    }

    public Vaso getVasoPequeno() {
        return this.vasosPequenos;
    }

    public Vaso getVasoMediano() {
        return this.vasosMedianos;
    }

    public Vaso getVasoGrande() {
        return this.vasosGrandes;
    }

    public Azucarero getAzucarero() {
        return this.azucar;
    }
}
