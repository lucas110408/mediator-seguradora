package mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioCentralSinistros(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Central de Sinistros respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentralSinistros.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCentralSinistros(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Central de Sinistros respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentralSinistros.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCentralSinistros(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n" +
                "A Central de Sinistros respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentralSinistros.getInstancia().receberSugestao(mensagem);
    }

}
