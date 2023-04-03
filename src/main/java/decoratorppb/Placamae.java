package decoratorppb;

public class Placamae extends VendaDecorator {
    public Placamae(Servico servico, String nome, float preco){
        super(servico,nome,preco);
    }

    @Override
    public float getValorPeca() {
        return this.getPrecoProduto();
    }

    @Override
    public String getNomePeca() {
        return getNomeProduto();
    }
}
