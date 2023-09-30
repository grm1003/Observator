package Ex2;

public class MainAcao {
    public static void main(String[] args) {
        Acao acao = new Acao("Blizzard", 150.0);
        AcaoBroker acaoBroker = new AcaoBroker(acao);
        Investidor investidor1 = new Investidor("Gabriel",  200.0);
        Investidor investidor2 = new Investidor("Pedro",  180.0);

        acaoBroker.AdicionaObsevador(investidor1);
        acaoBroker.AdicionaObsevador(investidor2);

        acaoBroker.Atualizavalor(160.0);
        acaoBroker.Atualizavalor(210.0);
    }
}
