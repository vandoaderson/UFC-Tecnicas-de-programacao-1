import java.util.*;

public class Sistema{
	ArrayList <Conta> contas = new ArrayList<Conta>();

	void criarContaXPTOBasic(int conta_corrente){
		if(!contaExiste(conta_corrente)){
			 // Polimorfismo de coerção	
			contas.add(new Basic(conta_corrente));	
		}
	}
	void criarContaXPTOPlus(int conta_corrente){
		if(!contaExiste(conta_corrente) ){
			// Polimorfismo de coerção
			contas.add(new Plus(conta_corrente));
			
		}
	}
	void criarContaXPTOExtreme(int conta_corrente){
		if(!contaExiste(conta_corrente) ){
			// Polimorfismo de coerção
			contas.add(new Extreme(conta_corrente));
		}
	}
	void creditar(int conta_corrente,double valor){
		for(Conta conta : contas){
			if(conta.conta_corrente == conta_corrente) {
		    conta.creditar(valor);
			return;
			}
		}
		return;
	}
	void debitar(int conta_corrente,double valor){
		for(Conta conta : contas)
			if(conta.conta_corrente == conta_corrente) {
		    conta.debitar(valor);
			return;
			}
		
		return;
	}
	double consultarSaldo(int conta_corrente){
		for(Conta conta : contas)
			if(conta.conta_corrente == conta_corrente)
				return conta.saldo;			
		return 0;
	}
	
	boolean contaExiste(int conta_corrente){
		for(Conta conta : contas)
			if(conta.conta_corrente == conta_corrente)
				return true;
		return false;
		

}
}