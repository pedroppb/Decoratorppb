package decoratorppb;

public class PlacaMae extends VendaDecorator {
    public PlacaMae(Servico servico, String nome, float preco){
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
