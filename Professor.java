public class Professor extends Funcionario{
	private char classe;
	
	public Professor(String nome, char classe){
	super("Prof "+nome,2);
	this.classe = classe;
	}
	public char getClasse(){
		return this.classe;
	}
	public void setClasse(char classe){
		this.classe =classe;
	}
	public double calcSalario(){
		double salario = 0;
		salario += ((this.classe=='A')?3000:0);
		salario += ((this.classe=='B')?5000:0);
		salario += ((this.classe=='C')?7000:0);
		salario += ((this.classe=='D')?9000:0);
		salario += ((this.classe=='E')?11000:0);
		salario = salario+(getQtdDiarias()*100)+getBonus();
		return salario;
	}
	public String toString(){
		String res = "";
		res += super.toString()+" Classe "+this.classe+"\n";
		res += "salario "+calcSalario();
		return res;
	}
}
