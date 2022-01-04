
package black_jack;

import java.util.ArrayList;
import java.util.Random;


public class Baralho implements Movimentos {
    String Naipe[] = {"Paus", "Copas", "Espadas", "Ouro"};
    String Nome[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Dama", "Valete", "Rei"};
    ArrayList <Carta> baralho = new ArrayList();

    public Baralho() {
        
            for(int nai = 0; nai < Naipe.length; nai++){
                for (int nom = 0; nom < Nome.length; nom++){
                    
                    Carta carta = new Carta( Nome[nom], Naipe[nai]);
                    baralho.add(carta);
                }
            }
    }
    
    void embaralhar(){
    
        ArrayList listatemp = new ArrayList();
        Random aleat = new Random ();
        
        while(baralho.size() > 1){
            int posicao = aleat.nextInt(baralho.size());
            listatemp.add(baralho.get(posicao));
            baralho.remove(posicao);
        }
        listatemp.add(baralho.get(0));
        baralho.clear();
        
        for(int i = 0; i < listatemp.size(); i++){
            baralho.add((Carta) listatemp.get(i));
        }
            
    }

    @Override
    public Carta top() {
        return baralho.get(baralho.size() - 1);
    }

    @Override
    public void pop() {
        baralho.remove(baralho.size() - 1);
    }
    
    


}
     

    


