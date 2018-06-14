package observer;

public class ObserverPositivo implements Observer{
	public void imprimir(Expressao e){
		if (e.calcular() > 0){
			System.out.println("Resultado positivo!");	
		}
	}
}