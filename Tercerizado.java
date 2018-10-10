public class Tercerizado extends Funcionario{
	private int horasTrab;
	private boolean insalubre;
	
	public Tercerizado(String nome,int horas, boolean insalubre){
	super("Ter "+nome,0);
	this.horasTrab = horas;
	this.insalubre = insalubre;
	}
	public int getHorasTrab(){
		return this.horasTrab;
	}
	public void setHorasTrab(int horas){
		this.horasTrab = horas;
	}
	public boolean inInsalubre(){
		return this.insalubre;
	}
	public void inInsalubre(boolean insalubre){
		this.insalubre = insalubre;
	}
	public double calcSalario(){
		double salario = 4*this.horasTrab+((this.insalubre)?500:0)+getBonus();
		return salario;
	}
	public String toString(){
		String st = "";
		st += super.toString()+" "+this.horasTrab+" "+((this.insalubre)?"insalubre":null)+"\n";
		st += "salario "+calcSalario();
		return st;
	}
}
