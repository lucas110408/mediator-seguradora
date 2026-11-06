package mediator;

public class CentralSinistros implements Setor {

    private static CentralSinistros instancia = new CentralSinistros();

    private CentralSinistros() {}

    public static CentralSinistros getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Central de Sinistros vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Central de Sinistros agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Central de Sinistros vai analisar a sugestão: " + mensagem;
    }
}
