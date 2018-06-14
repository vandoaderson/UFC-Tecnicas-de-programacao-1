package observer;

import java.lang.Math;

public class Seno extends OperadorUnario{
	Seno(Expressao e){
		super(e);
	}

	@Override
	public double calcular(){
		Operando value = new Operando(Math.sin(this.e.calcular()));
		notifyObservers(value);
		return value.getValor();
	}
}
