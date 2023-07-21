package streams.desafios;

public class Produto {

    final String nome;

    final double preco;
    final double desconto;

    boolean freteGratis;

    public Produto(String nome, double preco, double desconto, boolean freteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.freteGratis = freteGratis;
    }
}
