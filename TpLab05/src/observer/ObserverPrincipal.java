package observer;

public class ObserverPrincipal {

	Expressao e1, e2, e3, e4, e5;
	Observer positivo, negativoOuZero;
	public void run() {
	e1 = new Operando(45.0);
	positivo = new ObserverPositivo();
	negativoOuZero = new ObserverZeroNegativo();
	e1.addObserver(positivo);
	e1.addObserver(negativoOuZero);
	e1 = new Seno(e1);
	System.out.println(e1.calcular());
	}
	
}
