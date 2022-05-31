
package subsistema2;

import one.digitalInnovation.gof.Singleton.SingletonEager;

public class cepAPI {
    private static cepAPI instancia = new cepAPI();
    
    private cepAPI(){
        super();
    }
    
    public static cepAPI getInstancia(){
        return instancia;
    }
    
    public String recuperarCidade(String cep){
        return "Botucatu";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }
}
