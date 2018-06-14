import composite.CompositePrincipal;
import decorator.DecoratorPrincipal;
import observer.ObserverPrincipal;

public class TpLab05 {

public static void main(String[] args) {
	
	CompositePrincipal Cp = new CompositePrincipal();
	DecoratorPrincipal Dp = new DecoratorPrincipal();
	ObserverPrincipal Op = new ObserverPrincipal();
	
	System.out.println("==========Composite==========");
	Cp.run();
	System.out.println("\n==========Decorator==========");
	Dp.run();
	System.out.println("\n==========Observer==========");
	Op.run();
}
}
