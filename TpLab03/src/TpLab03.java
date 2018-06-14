class TpLab03{
    public static void main(String[] args) {
    	Figura[] figuras = new Figura[10];

    	figuras[0] = new Quadrado(9,"azul");
        figuras[1] = new Circulo(7,7,7);
        figuras[2] = new Quadrado(2,"preto");
        figuras[3] = new Circulo(2,2,2);
    	figuras[4] = new Quadrado(2,"branco");
        figuras[5] = new Circulo(4,4,4);
        figuras[6] = new Quadrado(10,"verde");
        figuras[7] = new Circulo(9,9,9);
        figuras[8] = new Circulo(11,11,11);
        figuras[9] = new Quadrado(5,"vermelho");
        
        //Imprime todos objetos
        System.out.println("========== Todos objetos ==========\n");
        for(int i = 0;i<10;i++) {
        	System.out.println(figuras[i].desenhar().toString());
        }
        System.out.println("\n========== Somente objetos coloridos==========\n");
        //Imprime só os coloridos
        for (Figura figura: figuras){
        	if(figura instanceof FiguraColorida){
        		System.out.println(figura.desenhar());
        	}
        }

        
    }
}