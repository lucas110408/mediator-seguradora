package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguradoTest {

    @Test
    void deveElogiarCentralSinistros() {
        Segurado segurado = new Segurado();
        assertEquals("A Ouvidoria agradece seu contato.\nA Central de Sinistros respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Central de Sinistros agradece a mensagem: Indenização paga rápido",
                segurado.elogiarCentralSinistros("Indenização paga rápido"));
    }

    @Test
    void deveReclamarCentralSinistros() {
        Segurado segurado = new Segurado();
        assertEquals("A Ouvidoria agradece seu contato.\nA Central de Sinistros respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Central de Sinistros vai procurar melhorar o serviço da reclamação: Demora na vistoria do carro",
                segurado.reclamarCentralSinistros("Demora na vistoria do carro"));
    }

    @Test
    void deveSugerirCentralSinistros() {
        Segurado segurado = new Segurado();
        assertEquals("A Ouvidoria agradece seu contato.\nA Central de Sinistros respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>A Central de Sinistros vai analisar a sugestão: Abrir sinistro pelo aplicativo",
                segurado.sugerirCentralSinistros("Abrir sinistro pelo aplicativo"));
    }

}
