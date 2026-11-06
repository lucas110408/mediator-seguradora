package mediator;

public class Pessoa {

    public String elogiarCentralSinistros(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioCentralSinistros(mensagem);
    }

    public String reclamarCentralSinistros(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoCentralSinistros(mensagem);
    }

    public String sugerirCentralSinistros(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoCentralSinistros(mensagem);
    }

}
