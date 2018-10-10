public class Funcionario{
	private String nome;
	private int maxDiarias = 0;
	private int qtdDiarias;
	private double bonus = 0;
	
	public Funcionario(String nome, int maxDiarias){
		this.nome = nome;
		this.maxDiarias = maxDiarias;
	}
	
	public String[] getNome(){
		String st[] = this.nome.split(" ");
		return st;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public int getMaxDiarias(){
		return this.maxDiarias;
	}
	public void setMaxDiarias(int maxDiarias){
		this.maxDiarias = maxDiarias;
	}
	public int getQtdDiarias(){
		return this.qtdDiarias;
	}
	public void setQtdDiarias(int qtdDiarias){
		this.qtdDiarias = qtdDiarias;
	}
	public double getBonus(){
		return this.bonus;
	}
	public void setBonus(double bonus){
		this.bonus = bonus;
	}
	public double calcSalario(){
		return 0;
	}
	public void addDiaria(){
		if(this.qtdDiarias<this.maxDiarias){
			this.qtdDiarias ++;
		}
	}
	public String toString(){
		String st = this.nome;
		return st;
	}
}
