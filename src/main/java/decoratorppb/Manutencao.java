package decoratorppb;

public class Venda implements Peca{
    public float total;

    public Venda() {}
    @Override
    public float getPreco() {
        return total;
    }

    @Override
    public String getnome() {
        return "lista de compras";
    }
}
