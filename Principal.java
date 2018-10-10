import java.util.Scanner;

public class Principal{
	public static Funcionario[] fun = new Funcionario[10];
	public static double bonus = 0;
	public static boolean add(Funcionario funcionario){
		for (int i = 0;i<fun.length;i++){
			if(fun[i]!=null&&fun[i].getNome().equals(funcionario.getNome())){
				return false;
			}
		}
		for (int i = 0;i<fun.length;i++){
			if(fun[i]==null){
				fun[i] = funcionario;
				return true;
			}
		}
		Funcionario[] fun1 = new Funcionario[fun.length+5];
		fun1[fun.length] = funcionario;
		for (int i = 0;i<fun.length;i++){
			fun1[i] = fun[i];
			fun = fun1;
			return true;
		}
		fun1 = null;
		return true;
	}
	public static String show(String nome){
		int len = 0;
		for (int i = 0;i<fun.length;i++){
			if(fun[i]!=null){
				len++;
			}
		}
		for (int i = 0;i<fun.length;i++){
			if(fun[i]!=null&&fun[i].getNome()[1].equals(nome)){
				fun[i].setBonus(bonus/len);
				return fun[i].toString();
			}
		}
		return "funcionario "+nome+" nao existe";
	}
	public static void rm(String nome){
		for (int i = 0;i<fun.length;i++){
			if(fun[i]!=null&&fun[i].getNome()[1].equals(nome)){
				fun[i] = null;
				System.out.println("  done");
				return;
			}
			
		}
	System.out.println("funcionario "+nome+" nao existe");
	}
	public static void addDiaria(String nome){
		for (int i = 0;i<fun.length;i++){
			if(fun[i]!=null&&fun[i].getNome()[1].equals(nome)){
				if (fun[i].getNome()[0].equals("Ter")){
					System.out.println("ter nao pode receber diaria");
					return;
				}
				if (fun[i].getNome()[0].equals("Prof")){
					if(fun[i].getQtdDiarias()<fun[i].getMaxDiarias()){
						fun[i].addDiaria();
						System.out.println(" done");
						return;
					}
					else{
						System.out.println("fail: limite de diarias atingido");
						return;
					}
				}
				if (fun[i].getNome()[0].equals("Sta")){
					if(fun[i].getQtdDiarias()<fun[i].getMaxDiarias()){
						fun[i].addDiaria();
						System.out.println(" done");
						return;
					}
					else{
						System.out.println("fail: limite de diarias atingido");
						return;
					}
				}
			}
		}
	}
	public static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		String help = "\tCadastrar funcionários\n"+
					  "addProf nome classe\n"+
					  "addSta nome nível\n"+
					  "addTer nome horas sim/não\n"+
					  "\tMostrar funcionário\n"+
					  "show nome\n"+
					  "\tRemover funcionário\n"+
					  "rm nome\n"+
					  "\tAdicionar diárias\n"+
					  "addDiaria nome\n"+
					  "\tAdicionar bônus\n"+
					  "setBonus bônus\n";
		while(true){
			System.out.print("Digite o comando: ");
			String comando = sc.nextLine();
			if (comando.equals("help")){
				System.out.println(help);
				continue;
			}
			if (comando.equals("sair")){
				break;
			}
			
			String v[] = comando.split(" ");
			switch(v[0]){
				case "addProf":
				char b = v[2].charAt(0);
				Professor prof = new Professor(v[1],b);
				//add(prof);
				if (add(prof)){
					System.out.println("  done");
				}
				else{
					System.out.println("O funcionário já existe.");
				}
				break;
				
				case "addSta":
				Sta sta = new Sta(v[1], Integer.parseInt(v[2]));
				//add(sta);
				if (add(sta)){
					System.out.println("  done");
					break;
				}
				else{
					System.out.println("O funcionário já existe.");
				}
				break;
				
				case "addTer":
				boolean c = (v[3].equals("sim"))?true:false;
				Tercerizado ter = new Tercerizado(v[1],Integer.parseInt(v[2]),c);
				//add(ter);
				if (add(ter)){
					System.out.println("  done");
					break;
				}
				System.out.println("O funcionário já existe.");
				break;
				
				case "show":
				System.out.println(show(v[1]));
				break;
				
				case "rm":
				rm(v[1]);
				break;
				
				case "setBonus":
					bonus = Double.parseDouble(v[1]);
					System.out.println(" done");
					break;
				
				case"addDiaria":
					addDiaria(v[1]);
					break;
				
				case"qtd":
					System.out.println(fun.length);
					break;
				
				default:
					System.out.println("Comando invalido.");
			}
		}
	}
}
