package Ex2;


import java.util.ArrayList;
import java.util.List;

public class AcaoBroker {
    private List<Observador> investidores = new ArrayList<>();

    private Acao acao;
    private double preco;

    public AcaoBroker(Acao acao) {
        this.acao = acao;
    }

    public void AdicionaObsevador(Observador novo){
        investidores.add(novo);
    }

    public void RemoveObservador(Observador novo){
        investidores.remove(novo);
    }

    public void notificarInvestidores(){
        for (Observador observer : investidores) {
            observer.AtualizaAcao(acao,preco);
        }
    }

    public void Atualizavalor(double valor){
        if (valor != preco) {
            this.preco = valor;
            acao.setPreco(preco);
            notificarInvestidores();
        }
    }
}
