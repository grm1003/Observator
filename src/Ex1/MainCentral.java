package Ex1;

public class MainCentral {
    public static void main(String[] args) {
        CentralMetereologica CET = new CentralMetereologica();
        Pref prefeitura = new Pref();
        Aer aeroporto = new Aer();
        CET.AdicionaObsevador(prefeitura);
        CET.AdicionaObsevador(aeroporto);
        CET.AtualizaMetereologia(25.5, 70.5, 5.2);
    }
}
