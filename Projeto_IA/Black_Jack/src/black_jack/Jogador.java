/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black_jack;

import java.util.ArrayList;

/**
 *
 * @author Nando
 */
public class Jogador {
    
    private int pontos = 0;
    private ArrayList<Carta> mao = new ArrayList();
    private ArrayList<Carta> mesa = new ArrayList();

    public ArrayList<Carta> getMesa() {
        return mesa;
        
    }

    public void setMesa(ArrayList mesa) {
        this.mesa = mesa;
        
    }

    public ArrayList getMao() {
        return mao;
    }

    public void setMao(ArrayList mao) {
        this.mao = mao;
        
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
       
    }
    
    
    void setCartajogador(Carta carta){
        mao.add(carta);
        
    }
    void setCartaMesa(Carta carta){
        mesa.add(carta);
    }
    
        public void calculapontos(){
       
        String Nome[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Rei"};
        
        
        for(int i = 0; i < mesa.size(); i++){
                
                String temp = mesa.get(i).getNome();
                boolean tempstatus = mesa.get(i).getStatus();
            
            if(temp == "As" && tempstatus){
            
                this.setPontos(this.getPontos() + 1);
                
            }
            if(temp == "2" || temp == "3" || temp == "4" || temp == "5" || temp == "6" || temp == "7" || temp == "8" || temp == "9" && tempstatus){
                
                this.setPontos(this.getPontos() + Integer.parseInt(temp));
                
                
            }
            if(temp == "10" || temp == "Dama" || temp == "Valete" || temp == "Rei" && tempstatus){
               this.setPontos(this.getPontos() + 10);
            }
        }
        
        
        for(int i = 0; i < mao.size(); i++){
            
                String temp = mao.get(i).getNome();
               
            
            if(temp == "As"){
            
                this.setPontos(this.getPontos() + 1);
                
            }
            if(temp == "2" || temp == "3" || temp == "4" || temp == "5" || temp == "6" || temp == "7" || temp == "8" || temp == "9"){
                
                this.setPontos(this.getPontos() + Integer.parseInt(temp));
                
                
            }
            if(temp == "10" || temp == "Dama" || temp == "Valete" || temp == "Rei" ){
                this.setPontos(this.getPontos() + 10);
            }
        }
        
        
    }
}
