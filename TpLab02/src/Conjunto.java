import java.util.ArrayList;

public class Conjunto<E> {
	public ArrayList<E> Lista = new ArrayList<E>();
	
	protected void CriaConjunto() {
		
	};
	public void InsereElemento(E elemento) {
		this.Lista.add(elemento);		
	};
	public boolean VerificarElemento(E elemento) {
		if(this.Lista.contains(elemento))
			return true;
		else return false;
	};
	public boolean VerificarSubconjunto(ArrayList<E> Lista2) {
		for (int i = 0; i < Lista2.size(); i++) {
			if(!this.Lista.contains(Lista2.get(i)));
				return false;
		}
		return true;
	};
	public void UniaoConjuntos(ArrayList<E> Lista2) {
		for (int i = 0; i < Lista2.size(); i++) {
			this.Lista.add(Lista2.get(i));
		}
	};
	public void IntersecçãoConjuntos(ArrayList<E> Lista2) {
		for (int i = 0; i < Lista2.size(); i++) {
			if(!this.Lista.contains(Lista2.get(i)));
				this.Lista.remove(i);
		}
	};
	public void DiferençaConjuntos(ArrayList<E> Lista2) {
		for (int i = 0; i < Lista2.size(); i++) {
			if(this.Lista.contains(Lista2.get(i)));
				this.Lista.remove(i);
		}
	};
}
