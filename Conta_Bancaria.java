/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author 1128127
 */
public class Conta_Bancaria{
    public String CPF;
    public String nome;
    public float saldo;
    
    public void saque(float valor){
        //usamos a palavra-chave this para mostrar que esse é um atributo, e não uma simples variável
        if (saldo >= valor){
            saldo = saldo - valor;
        }
    }
    
    public float obtemsaldo(){
        return saldo;
    }
    
    public void deposito(float valor){
        saldo = saldo + valor;
        
    }
}
