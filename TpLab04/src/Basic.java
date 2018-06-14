//Polimorfismo de inclusão
public class Basic extends Conta{

	//Sobrecarga do construtor
	Basic(int conta_corrente){
		this(conta_corrente, 0.0);
	}
	Basic(int conta_corrente, double valor){
		super(conta_corrente, valor);
	}

	//Polimorfismo de Coerção
	void creditar(double valor){
		this.saldo += valor;
	}

	//Polimorfismo de Coerção
	void debitar(double valor){
		this.saldo -=valor;
	}

	@Override
	public String toString(){
		return "Conta Basic\nId:"+this.conta_corrente+"\nSaldo da Conta:"+this.saldo;
	}

}