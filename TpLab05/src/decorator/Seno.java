package decorator;

public class Seno extends OperadorUnario{
	Seno(Expressao e){
		super(e);
	}

	@Override
	public double calcular(){
		return Math.sin(this.e.calcular());
	}
}
