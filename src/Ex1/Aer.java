package Ex1;

public class Aer implements Observer{
    @Override
    public void atualizar(double temp, double hum, double veloc_vento) {
        System.out.println("Atualização da Aeroporto: Velocidade do Ar passou para " +veloc_vento+ " Km/h");
    }
}
