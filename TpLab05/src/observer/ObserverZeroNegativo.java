package observer;

public class ObserverZeroNegativo implements Observer{
	//update
	public void imprimir(Expressao e){
		if (e.calcular() <= 0){
			System.out.println("Resultado zero ou negativo!");	
		}
	}
}
