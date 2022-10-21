package subsisteme.crm1;

public class CrmService {

   private CrmService() {
       super();
    }

    public static void gravarCliente(String nome, String cidade, String cep, String estado) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);

    }
}
