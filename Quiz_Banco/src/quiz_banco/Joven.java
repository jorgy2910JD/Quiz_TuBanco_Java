/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_banco;

/**
 *
 * @author Jorge Mozo 
 */
public abstract class Joven extends Tarjeta {
    private String DescuentoBasico;
    
    public Joven (String DescuentoBasico, String numeroDeCuenta, double valorApertura, String mes){
        super(numeroDeCuenta, valorApertura, mes);
       this.DescuentoBasico = DescuentoBasico; 
    }
    @Override
    public double cuotaDeManejo() {
        double valorApertura = 50000;
        double valorDescuento = Descuento.DescuentoBasico.getValorDescontado(getValorApertura());
        return valorApertura - valorDescuento;
    }
}
