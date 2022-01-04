
package black_jack;


public class Black_Jack {

   
    public static void main(String[] args) {
       
        //O método Partida é chamado no main
       Partida();

    }
    
    //O jogo foi criado dentro de um método chamado "Partida"
    public static void Partida(){
            Dealer dealer = new Dealer();
            Jogador play1 = new Jogador();
       
            int cartaentregue = 3;
            boolean status = false;
            
            int rodada =1;
          
            /*Primeira rodada nunca é alterado, são entregues duas cartas ao jogador, e duas sobre a mesa, sendo uma delas com a face para baixo.
            Na primeira rodada, a carta de face para baixo não participa da contagem de ponto, apenas na segunda, caso seja necessáio.
            */
            dealer.embaralhar();
            dealer.DistribuiCarta(play1);
            dealer.DistribuiCarta(play1);
            dealer.DistribuiCartamesa(play1); 
            
          
           
            while(status != true ){
             
             play1.calculapontos();
            
            
            dealer.embaralhar();
            
            System.out.println("Rodada: " + rodada++);
            System.out.println("Soma de Pontos das Cartas: " + play1.getPontos());
            System.out.println("Mão do Jogador: " +play1.getMao());
            System.out.println("Cartas Dispostas na Mesa: " +play1.getMesa());
            System.out.println("------------------------------------------------");
           
           
            if(play1.getPontos() == 21){
               
               System.out.println("PARABÉNS, O JOGADOR GANHOU !!");
               System.out.println("Soma de Pontos das Cartas: " + play1.getPontos());
               System.out.println("Mão do Jogador: " +play1.getMao());
               System.out.println("Cartas Dispostas na Mesa: " +play1.getMao());
               System.out.println("Número de Carta entregues pelo Dealer: " + cartaentregue);
               status = true;
            }
            else if(play1.getPontos() > 21){
               
               System.out.println("O JOGADOR ESTOUROU O NÚMERO DE PONTOS:");
               System.out.println("Soma de Pontos das Cartas: " + play1.getPontos());
               System.out.println("Mão do Jogador: " + play1.getMao());
               System.out.println("Cartas Dispostas na Mesa: " + play1.getMesa());
               System.out.println("Número de Carta entregues pelo Dealer: " + cartaentregue);
               status = true;
               
               
            }
            else if(play1.getPontos() < 21){
               if(rodada == 2){
                   
                   /*
                    Estrutura de decisão que controla a segunda rodada. A Carta de face virada para baixo é introtudiza na contagem dos pontos apenas
                   na segunda rodada.
                   */
                   
                   
                   dealer.DistribuiCartamesa(play1);
                   cartaentregue++;
                   
               }
               
               else{
                   if(rodada > 2){
                       dealer.DistribuiCarta(play1);
                       cartaentregue++;
                   }
                   
               }
               
           }
           play1.setPontos(0);
            
            
    }
       }
    
}
