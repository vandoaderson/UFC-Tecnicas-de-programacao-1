public abstract class Conta{
	int conta_corrente;
	double saldo;

	//Sobrecarga do construtor
	Conta(int conta_corrente){
		this(conta_corrente,0.0);
	}

	//Sobrecarga do construtor
	Conta(int conta_corrente, double saldo){
		this.conta_corrente = conta_corrente;
		this.saldo = saldo;
	}

	//Polimorfismo de Coerção
	abstract void creditar(double valor);
	//Polimorfismo de Coerção
	abstract void debitar(double valor);

	double consultarSaldo(){
		return this.saldo;
	}
	
	public int getContaCorrente(){
		return this.conta_corrente;
	}
}