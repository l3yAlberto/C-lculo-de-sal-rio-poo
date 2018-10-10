public class Sta extends Funcionario{
	private int nível;
	
	public Sta(String nome, int nível){
		super("Sta "+nome,1);
		this.nível = nível;
	}
	public int getNível(){
		return this.nível;
	}
	public void setNível(int nível){
		this.nível = nível;
	}
	public double calcSalario(){
		double salario = 3000 + (300*this.nível);
		salario = salario +getBonus()+(getQtdDiarias()*100);
		return salario;
	}
	public String toString(){
		String st = "";
		st += super.toString()+" nível "+this.nível+"\n";
		st += "salario "+calcSalario();
		return st;
	}
}
