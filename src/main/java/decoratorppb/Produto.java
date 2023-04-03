package decoratorppb;

public abstract class Produto {
    public String nome;
    public float preco;

    public Produto(String nome, float preco) {
        this.nome=nome;
        this.preco=preco;
    }

    public String getNomeProduto() {
        return nome;
    }

    public void setNomeProduto(String nome) {
        this.nome = nome;
    }
    public float getPrecoProduto() {
        return preco;
    }

    public void setPrecoProduto(float preco) {
        this.preco = preco;
    }
}
