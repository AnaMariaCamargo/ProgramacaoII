/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

/**
 *
 * @author Aluno
 */
public class Conta {
    String agencia;
    String numeroConta;
    String nomeCorrentista;
    Double saldo;
    Boolean ativo;
    
    
    void abrir(String agencia, String vnumero, String vnome)
    {
        this.agencia = null;
        
        numeroConta = vnumero;
        nomeCorrentista = vnome;
        ativo = true;
        saldo = 0.0;
        
    }
    
    Boolean fecharConta()
    {
       
        Boolean retorno;
        if(saldo==0.0)
        { 
            ativo=false;
            retorno = true;
           
        }
        else
        {
            retorno = false;
        }
        return retorno;
    }
    
    Boolean depositar(Double valor)
    {
        if(ativo == true)
        {
            saldo = saldo + valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    Boolean sacar(Double valor)
    {
        if(ativo == true && valor<=saldo)
        {
            saldo = saldo - valor;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    Double retornarSaldo()
    {
        return saldo;
    }
}
