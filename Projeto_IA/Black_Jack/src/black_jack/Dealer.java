/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black_jack;

/**
 *
 * @author Nando
 */
public class Dealer {
    private Baralho baralho =new Baralho();
    
    boolean priCarta = false;
    

    void desvirarcarta(Jogador jogador){
        
        jogador.getMesa().get(1).virarCarta();
    }

    
    void DistribuiCarta(Jogador jogador){
        baralho.top().virarCarta();
        jogador.setCartajogador(baralho.top());
        baralho.pop();
            
    }
    
    void DistribuiCartamesa(Jogador jogador){
        
        if(priCarta == false){
            
            baralho.top().virarCarta();
            
        }
             jogador.setCartaMesa(baralho.top());
            priCarta = true;
            
               
        
    }
    
    void embaralhar(){
        this.baralho.embaralhar();
    }

    
}
