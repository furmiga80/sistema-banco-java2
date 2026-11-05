/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vladimir
 */
public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor){
        if (saldo>0){
            saldo = 0 + valor;
        }
        else{
            System.out.println("Valor invalido");
        } 
    }
    public boolean sacar(double valor){
        if(saldo>0=){
            
        }
        
    }
    public void exibirSaldo(){
        System.out.println("Conta numero: " + numero);
        System.out.print("Nome do titular: " + titular);
        System.out.print("Saldo da Conta: " + saldo);
    }
}
