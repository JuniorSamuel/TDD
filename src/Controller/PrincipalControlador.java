/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Dto.Azucarero;
import Model.Dto.Cafetera;
import Model.Dto.MaquinaDeCafe;
import Model.Dto.Vaso;
import View.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Junior S. De Los Santos V.
 */
public class PrincipalControlador implements ActionListener {
    
    Principal vista;
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;
    MaquinaDeCafe maquinaDeCafe;
    
    public PrincipalControlador(Principal vista){
        this.vista = vista;
        this.vista.btnObtener.addActionListener(this);
        init();
    }
    
    private void init(){
        cafetera = new Cafetera(300);
        vasosPequeno = new Vaso(5,10);
        vasosMediano = new Vaso(5,20);
        vasosGrande = new Vaso(5,30);
        azucarero = new Azucarero(20);
        
        maquinaDeCafe = new MaquinaDeCafe();
        maquinaDeCafe.setCafetera(cafetera);
        maquinaDeCafe.setVasosPequeno(vasosPequeno);
        maquinaDeCafe.setVasosMediano(vasosMediano);
        maquinaDeCafe.setVasosGrande(vasosGrande);
        maquinaDeCafe.setAzucarero(azucarero);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == this.vista.btnObtener){
          this.btnAgregarClick();
        }else if(e.getSource() == this.vista.itemAzucar){
          this.itemAzucarClick();
        }
        
    }
    
    private void btnAgregarClick(){
          Vaso vaso = this.maquinaDeCafe.getTipoVaso((String) this.vista.tipoVasos.getSelectedItem());
            String text = this.maquinaDeCafe.getVasoDeCafe(
                    vaso, 
                    (int) this.vista.cantidadVasos.getValue(),
                    (int) this.vista.cantidadAzucar.getValue()
                );
            this.vista.label.setText(text);
    }
    
    private void itemAzucarClick(){
    
    }
}
