package decoratorppb;

public class Manutencao implements Servico {
    private float total;

    public Manutencao(float valor) {
        this.total=valor;
    }
    @Override
    public float getPreco() {
        return total;
    }

    @Override
    public String getNome() {
        return "manutenção preventiva R$ "+total+"\n";
    }
}
