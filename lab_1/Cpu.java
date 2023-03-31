import java.util.Scanner;

public class Cpu{

	double price;
	String name;
	Cpu(int p,String j){
	
		this.price=p;
		this.name=j;	
	}
	
	class Processor{
		
		int no_of_cores;
		String manu;
		Processor(int p,String m){
	
			this.no_of_cores=p;	
			this.manu=m;
		}
	}

	class Ram{
		
		String mem_manu;
		Ram(String m){
	
			this.mem_manu=m;
		}
	}

	public static void main(String[] args){
		
	 Cpu c=new Cpu(500,"Intel I3");
	 	
	 Cpu.Processor p=c.new Processor(5,"xxxx");

	 Cpu.Ram r= c.new Ram("ooooo");

	 System.out.println("The processor "+c.name+" cost "+c.price);
	 System.out.println("The processor has "+p.no_of_cores+" cores and is manufactured by "+p.manu);
	 System.out.println("And the RAM manufacture name is "+r.mem_manu);
	
	
	}

}
