/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vladimir
 */
public abstract class ContaPoupanca extends Conta implements FechamentoMensal{
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
    
    
    
}
