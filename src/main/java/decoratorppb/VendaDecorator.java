package decoratorppb;

public abstract class VendaDecorator extends Produto implements Servico {
    private Servico servico;
    private String lista;

    public VendaDecorator(Servico servico, String nome, float preco) {
        super(nome,preco);
        this.servico = servico;
    }
    public abstract float getValorPeca();
    @Override
    public float getPreco() {
        return this.servico.getPreco()+this.getValorPeca();
    }
    public abstract String getNomePeca();
    @Override
    public String getNome() {
    return servico.getNome()+"peca: "+this.getNomeProduto()+" R$ "+this.getPrecoProduto()+"\n";
    }
}
