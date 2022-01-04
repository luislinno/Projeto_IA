/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package black_jack;


public class Carta {
    private String Nome;
    private String Naipe;
    
    public boolean getStatus() {
        return status;
    }

    //Status da Carta
    //True: carta virada para cima
    public void setStatus(boolean status) {
        this.status = status;
    }
    //False: carta virada para baixo
    boolean status;

    public Carta(String Nome, String Naipe) {
        this.Nome = Nome;
        this.Naipe = Naipe;
        this.status = false;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNaipe() {
        return Naipe;
    }

    public void setNaipe(String Naipe) {
        this.Naipe = Naipe;
    }
    
    
    @Override
    public String toString() {
        return "Carta " + "[" +Nome + "|" + Naipe +"]";
    }
    
    void virarCarta(){
        this.status = true;
    }
    
}
