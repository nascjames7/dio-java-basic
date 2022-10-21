package subsistema.crm2;


public class CepApi {

    private static CepApi instance = new CepApi();

    //Construtor privado.
    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Recife";
    }

    public String recuperarEstado(String cep){
        return "Pernambuco";
    }

}
