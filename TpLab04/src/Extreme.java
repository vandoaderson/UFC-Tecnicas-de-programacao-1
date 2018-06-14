//Polimorfismo de inclusão
public class Extreme extends Conta{

	//Sobrecarga do construtor
	Extreme(int conta_corrente){
		this(conta_corrente, 0.0);
	}

	//Sobrecarga do construtor
	Extreme(int conta_corrente, double valor){
		super(conta_corrente, valor);
	}

	void creditar(double valor){
		this.saldo += valor + (0.002*valor); //Rende 0.2%
	}

	void debitar(double valor){
		this.saldo -=valor - (0.002*valor); //Restitui 0.2%
	}

	@Override
	public String toString(){
		return "Conta Extreme\nId:"+this.conta_corrente+"\nSaldo da Conta:"+this.saldo;
	}
}