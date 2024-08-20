/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_banco;

/**
 *
 * @author Jorge Mozo 
 */
public abstract class Nomina extends Tarjeta {
    private String DescuentoPlatino;
    
    public Nomina (String DescuentoPlatino, String numeroDeCuenta, double valorApertura, String mes){
        super (numeroDeCuenta, valorApertura, mes);
        this.DescuentoPlatino = DescuentoPlatino;
    }
    @Override
    public double cuotaDeManejo() {
        double valorApertura = 50000;
        double valorDescuento = Descuento.DescuentoPlatino.getValorDescontado(getValorApertura());
        return valorApertura - valorDescuento;
    }
}
