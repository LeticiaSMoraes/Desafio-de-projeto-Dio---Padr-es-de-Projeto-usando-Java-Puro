
package one.digitalInnovation.gof.Singleton;

public class SingletonEager {
    
    private static SingletonEager instancia = new SingletonEager();
    
    public SingletonEager(){
        super();
    }
    
    public static SingletonEager getInstancia(){
        return instancia;
    }
}
