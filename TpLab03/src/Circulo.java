public class Circulo extends Figura{
	double diametro,raio;

    Circulo(double diametro){
        this(0,0, diametro);
    }

	Circulo(int x, int y, double diametro){
        super(x,y);
        this.diametro = diametro;
        this.raio = this.diametro/2;
	}
	@Override
    double calcularArea(Figura f){
		return 3.141592 * (raio * raio);       
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circulo";
	}

}