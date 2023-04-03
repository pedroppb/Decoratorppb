package decoratorppb;

public class Ram extends VendaDecorator {
    public Ram(Servico servico, String nome, float preco) {
        super(servico, nome, preco);
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
