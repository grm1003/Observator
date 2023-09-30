package Ex2;



public class Investidor implements Observador {

    private String nome;
    private double precoMax;

    public Investidor(String nome, double precoMaximo) {
        this.nome = nome;
        this.precoMax = precoMaximo;
    }

    @Override
    public void AtualizaAcao(Acao acao, double valor) {
        System.out.println("Investidor " + nome + " notificado. Preço da ação " + acao.getNome() + " agora é " + valor);
        if (valor >= precoMax) {
            System.out.println("Investidor " + nome + " vendeu suas ações de " + acao.getNome() + " a " + valor);
        }

    }
}
