package decoratorppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void deveRetornarPrecoManutencaoPreventiva() {
        Servico servico = new Manutencao(500.0f);

        assertEquals(500.0f, servico.getPreco());
    }

    @Test
    void deveRetornarPrecoManutencaoPreventivaComCpu() {
        Servico servico = new Cpu(new Manutencao(500.0f),"i7",1500.0f);

        assertEquals(2000.0f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComCpuEPlacaMae() {
        Servico servico = new Placamae(new Cpu(new Manutencao(500.0f),"i7",1500.0f),"asus z490",1000);

        assertEquals(3000.0f, servico.getPreco());
    }
    @Test
    void deveRetornarlistaManutencaoPreventiva() {
        Servico servico = new Manutencao(500.0f);
        assertEquals("manutenção preventiva R$ 500.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComCpu() {
        Servico servico = new Cpu(new Manutencao(500.0f),"i7",1500.0f);
        assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: i7 R$ 1500.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComCpuEPlacamae() {
        Servico servico = new Placamae(new Cpu(new Manutencao(500.0f),"i7",1500.0f),"asus z490",1000);
        assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: i7 R$ 1500.0\n"+
                "peca: asus z490 R$ 1000.0\n", servico.getNome());
    }
}
