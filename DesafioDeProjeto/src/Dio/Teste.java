
package Dio;

import one.digitaInnovation.gof.facade.Facade;
import one.digitalInnovation.gof.Singleton.SingletonEager;
import one.digitalInnovation.gof.Singleton.SingletonLazy;
import one.digitalInnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalInnovation.gof.Strategy.Comportamento;
import one.digitalInnovation.gof.Strategy.ComportamentoAgressivo;
import one.digitalInnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalInnovation.gof.Strategy.ComportamentoNornal;
import one.digitalInnovation.gof.Strategy.Robo;

public class Teste {
    //Teste relacionadas ao Design Pattern Singleton;
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        
    //Strategy
    
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento normal = new ComportamentoNornal();
    Comportamento agressivo = new ComportamentoAgressivo();
    
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        
        robo.setComportamento(defensivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        
        
        //facade
        
        Facade facade = new  Facade();
        facade.migrarCliente("Leticia", "18605-541");
    }
}
