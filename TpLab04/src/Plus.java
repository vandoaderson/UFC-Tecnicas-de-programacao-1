//Polimorfismo de inclusão
public class Plus extends Conta{

	//Sobrecarga do construtor
	Plus(int conta_corrente){
		this(conta_corrente, 0.0);
	}
	
	//Sobrecarga do construtor
	Plus(int conta_corrente, double saldo){
		super(conta_corrente, saldo);
	}

	void creditar(double valor){
		this.saldo += valor +(0.005*valor);
	}

	void debitar(double valor){
		this.saldo -=valor;
	}

	@Override
	public String toString(){
		return "Conta Plus\nId:"+this.conta_corrente+"\nSaldo da Conta:"+this.saldo;
	}
}