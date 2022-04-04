/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

/**
 *
 * @author 1128127
 */
public class Construtora {
    public static void main(String[] args){
        //quantas classe? 3
        //quantos objetos? 
        Porta portaEntrada = new Porta();
        portaEntrada.abre();
        
        Porta portaLavanderia = new Porta();
        
        Casa casa = new Casa();
        casa.porta1 = portaEntrada;
        casa.porta2 = portaLavanderia;
        
        int qtd = casa.quantasPortasEstaoAbertas();
        System.out.println(qtd);
        
    }
}
