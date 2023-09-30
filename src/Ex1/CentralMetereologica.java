package Ex1;

import java.util.ArrayList;
import java.util.List;

public class CentralMetereologica{
    private List<Observer> observadores = new ArrayList<>();
    private double temp;
   private  double hum;

    private double veloc_vento;

   public void AdicionaObsevador(Observer novo){
        observadores.add(novo);
   }

   public void RemoveObservador(Observer novo){
       observadores.remove(novo);
   }

   public void notificaObservador(){
       for (Observer observer : observadores) {
           observer.atualizar(temp, hum, veloc_vento);
       }
   }

   public void AtualizaMetereologia(double temp, double hum, double veloc_vento){
       this.temp = temp;
       this.hum = hum;
       this.veloc_vento = veloc_vento;
       notificaObservador();
   }

}
