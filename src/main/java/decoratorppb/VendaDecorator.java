package decoratorppb;

public abstract class VendasDecorator implements Peca{
    private Peca peca;
    private String lista;

    public VendasDecorator(Peca peca) {
        this.peca = peca;
    }
    public abstract float getValorPeca();
    @Override
    public float getPreco() {
        return this.peca.getPreco()+this.getValorPeca();
    }
    public abstract String getNomePeca();
    @Override
    public String getnome() {
    return "peca: "+this.peca.getnome()+" R$ "+this.peca.getPreco();
    }
}
