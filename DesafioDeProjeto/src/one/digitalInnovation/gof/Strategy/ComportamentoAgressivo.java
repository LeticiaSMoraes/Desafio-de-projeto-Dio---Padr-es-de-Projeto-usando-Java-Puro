
package one.digitalInnovation.gof.Strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se ofensivamente...");
    }
}
