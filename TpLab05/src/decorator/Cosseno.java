package decorator;

public class Cosseno extends OperadorUnario{
	Cosseno(Expressao e){
		super(e);
	}

	@Override
	public double calcular(){
		return Math.cos(super.calcular());
	}
}
