/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dto;

/**
 *
 * @author Junior S. De Los Santos V.
 */
enum vasoTipo {
    PEQUENO, MEDIANO, GRANDE
}

public class MaquinaDeCafe {

    private Cafetera cafe;
    private Vaso vasosPequenos;
    private Vaso vasosMedianos;
    private Vaso vasosGrandes;
    private Azucarero azucar;

    Vaso getTipoVaso(String vasoTipo) {
        switch (vasoTipo) {
            case "pequeno":
                return vasosPequenos;
            case "mediano":
                return vasosMedianos;
            case "grande":
                return vasosGrandes;
        }
        return null;
    }

    public Object getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (tipoDeVaso.equals(vasosPequenos)) {
            if (vasosPequenos.hasVasos(cantidadDeVasos)) {
                if (this.cafe.hasCafe(cantidadDeVasos)) {
                    if (this.azucar.hasAzucar(cantidadDeAzucar)) {
                        this.vasosPequenos.giveVasos(cantidadDeVasos);
                        this.azucar.giveAzucar(cantidadDeAzucar);
                        this.cafe.giveCafe(cantidadDeVasos);
                        return "Felicitaciones";
                    } else {
                        return "No hay Azucar";
                    }
                } else {
                    return "No hay Cafe";
                }
            } else {
                return "No hay Vasos";
            }
        }

        return null;
    }

    void setCafetera(Cafetera cafetera) {
        this.cafe = cafetera;
    }

    void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequenos = vasosPequeno;
    }

    void setVasosMediano(Vaso vasosMediano) {
        this.vasosMedianos = vasosMediano;
    }

    void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrandes = vasosGrande;
    }

    void setAzucarero(Azucarero azucarero) {
        this.azucar = azucarero;
    }

    Cafetera getCafetera() {
        return this.cafe;
    }

    Vaso getVasoPequeno() {
        return this.vasosPequenos;
    }

    Vaso getVasoMediano() {
        return this.vasosMedianos;
    }

    Vaso getVasoGrande() {
        return this.vasosGrandes;
    }

    Azucarero getAzucarero() {
        return this.azucar;
    }
}
