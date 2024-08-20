/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_banco;

/**
 *
 * @author Jorge Mozo
 */
public enum Descuento {
     DescuentoBasico(0.11), 
    DescuentoPlatino(0.15), 
    DescuentoDiamante(0.18);

    private double porcentaje;

    // Constructor 
    Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }
        public double getPorcentaje(){
        return porcentaje;
    }
   public double getValorDescontado(double monto) {
        return monto - (monto * porcentaje);
    }
}
