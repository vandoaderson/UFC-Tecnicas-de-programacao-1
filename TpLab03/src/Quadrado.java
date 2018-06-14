class Quadrado extends FiguraColorida{
	int lado;
	Quadrado(int lado, String cor){
		this(0,0,lado, cor);
	}
	
	Quadrado(int x, int y, int lado, String cor){
		super(x, y, cor);
		this.lado = lado;
	}

    double calcularArea(Figura f){
    	return lado*lado;
    }
    
    public String toString() {
    	// TODO Auto-generated method stub
    	return "Quadrado";
    }
}