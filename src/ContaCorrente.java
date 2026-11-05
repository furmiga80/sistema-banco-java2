/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vladimir
 */
public class ContaCorrente extends Conta implements FechamentoMensal{

    private double taxaManutencao;
    
    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }
public void cobrarManutencao(){
    
    @Override
    public void fecharMes() {
        
    }
    
}
