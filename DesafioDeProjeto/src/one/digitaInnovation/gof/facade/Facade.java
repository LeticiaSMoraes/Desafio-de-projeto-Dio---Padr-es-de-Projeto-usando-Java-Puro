
package one.digitaInnovation.gof.facade;

import subsistema1.crmService;
import subsistema2.cepAPI;

public class Facade {
    
    public void migrarCliente (String nome, String cep){
        
       String cidade =  cepAPI.getInstancia().recuperarCidade(cep);
       String estado =  cepAPI.getInstancia().recuperarEstado(cep);

        crmService.gravarCliente(nome, cep, cidade, estado);
    }
}
