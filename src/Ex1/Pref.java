package Ex1;

public class Pref implements Observer{
    @Override
    public void atualizar(double temp, double hum, double veloc_vento) {
        System.out.println("Atualização da Prefeitura: Humidade do Ar passou para " +hum+"%");
    }
}
