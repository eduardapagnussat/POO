/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.awt.Color;


/**
 *
 * @author 1128127
 */
public class Porta {
    //<static><modificador de acesso><tipo><nome><inicialização>
    public boolean aberta;
    public Color color;
    public float dimensaoX;
    public float dimensaoY;
    public float dimensaoZ;
    
    //<satatic><modificador de acesso><retorno><identificador><parametro>
    public void abre(){
    aberta = true;
    }
    
    public void fecha(){
    aberta = false;
    }
    
    public void pinta(Color novaCor){
    color = novaCor;
    }
    
    public boolean estaAberta(){
    return aberta;
    
    }
}
