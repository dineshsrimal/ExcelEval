import org.boris.expr.BasicEngineProvider;
import org.boris.expr.engine.DependencyEngine;
import org.boris.expr.engine.Range;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        DependencyEngine e = new DependencyEngine();
        e.set("B1", "=A1*2");
        e.set("A1", "=12*2");
        e.set("C1", "=B1*A1");
        System.out.println(e.getValue(Range.valueOf("B1")));
        System.out.println(e.getValue(Range.valueOf("C1")));
        e.set("A1", "2");
        System.out.println(e.getValue(Range.valueOf("B1")));
        System.out.println(e.getValue(Range.valueOf("C1")));


    }
}
