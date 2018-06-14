public abstract class Figura{
	int x;
	int y;

	Figura(){
		this(0,0);
	}
	
	Figura(int x, int y){
		this.x = x;
		this.y = y;
	}
	
    String desenhar(){
    	return this.toString();
    }

    void mover(float dx, float dy){
		this.x += dx;
		this.y += dy;    	
    }

    abstract double calcularArea(Figura figura);
}