package decoratorppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {
    @Test
    void deveRetornarPrecoManutencaoPreventiva() {
        Servico servico = new Manutencao(500f);
        assertEquals(500f, servico.getPreco());
    }

    @Test
    void deveRetornarPrecoManutencaoPreventivaComCpu() {
        Servico servico = new Cpu(new Manutencao(500f),"i7",1500f);
        assertEquals(2000f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComPlacaMae() {
        Servico servico = new PlacaMae(new Manutencao(500f),"asus z490",1000f);
        assertEquals(1500f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComRam() {
        Servico servico = new Ram(new Manutencao(500f),"1x8 corsair",200f);
        assertEquals(700f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComCpuEPlacaMae() {
        Servico servico = new PlacaMae(new Cpu(new Manutencao(500f),"i7",1500f),"asus z490",1000f);
        assertEquals(3000f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComCpuERam() {
        Servico servico = new Ram(new Cpu(new Manutencao(500f),"i7",1500f),"1x8 corsair",200f);
        assertEquals(2200f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComPlacaMaeERam() {
        Servico servico = new Ram(new PlacaMae(new Manutencao(500.0f),"asus z490",1000f),"1x8 corsair",200f);
        assertEquals(1700f, servico.getPreco());
    }
    @Test
    void deveRetornarPrecoManutencaoPreventivaComPlacaMaeERamECpu() {
        Servico servico = new Cpu(new Ram(new PlacaMae(new Manutencao(500f),"asus z490",1000f),"1x8 corsair",200f),"i7",1500f);
        assertEquals(3200f, servico.getPreco());
    }
    @Test
    void deveRetornarlistaManutencaoPreventiva() {
        Servico servico = new Manutencao(500f);
        assertEquals("manutenção preventiva R$ 500.0\n", servico.getNome());
    }

    @Test
    void deveRetornarlistaManutencaoPreventivaComCpu() {
        Servico servico = new Cpu(new Manutencao(500.0f),"i7",1500f);
        assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: i7 R$ 1500.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComPlacaMae() {
        Servico servico = new PlacaMae(new Manutencao(500f),"asus z490",1000f);
        assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: asus z490 R$ 1000.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComRam() {
        Servico servico = new Ram(new Manutencao(500f),"1x8 corsair",200f);
        assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: 1x8 corsair R$ 200.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComCpuEPlacaMae() {
        Servico servico = new PlacaMae(new Cpu(new Manutencao(500f),"i7",1500f),"asus z490",1000f);
             assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: i7 R$ 1500.0\n"+
                "peca: asus z490 R$ 1000.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComCpuERam() {
        Servico servico = new Ram(new Cpu(new Manutencao(500f),"i7",1500f),"1x8 corsair",200f);
         assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: i7 R$ 1500.0\n"+
                "peca: 1x8 corsair R$ 200.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComPlacaMaeERam() {
        Servico servico = new Ram(new PlacaMae(new Manutencao(500.0f),"asus z490",1000f),"1x8 corsair",200f);
        assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: asus z490 R$ 1000.0\n"+
                "peca: 1x8 corsair R$ 200.0\n", servico.getNome());
    }
    @Test
    void deveRetornarlistaManutencaoPreventivaComPlacaMaeERamECpu() {
        Servico servico = new Cpu(new Ram(new PlacaMae(new Manutencao(500f),"asus z490",1000f),"1x8 corsair",200f),"i7",1500f);
          assertEquals("manutenção preventiva R$ 500.0\n" +
                "peca: asus z490 R$ 1000.0\n"+
                "peca: 1x8 corsair R$ 200.0\n"+
                "peca: i7 R$ 1500.0\n", servico.getNome());
    }

}
