/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz_banco;

/**
 *
 * @author jorgy
 */
public  abstract class Visa extends Tarjeta {
    private String DescuentoDiamante;
    
    public Visa (String DescuentoDiamante, double valorApertura, String mes, String numeroDeCuenta){
        super(numeroDeCuenta, valorApertura, mes);
        this.DescuentoDiamante = DescuentoDiamante;
    }
    @Override
    public double cuotaDeManejo() {
        double valorApertura = 50000;
        double valorDescuento = Descuento.DescuentoDiamante.getValorDescontado(getValorApertura());
        return valorApertura - valorDescuento;
    }
}
