class Product{
		
	String pcode="";
	String pname="";
	double price;
	
	Product(String p,String n,double d){
		this.pcode=p;
		this.pname=n;
		this.price=d;
	}

	static Product price(Product p1,Product p2,Product p3){

		if(p1.price<p2.price && p1.price<p3.price )	
			return p1;
		else if(p2.price<p1.price && p2.price<p3.price)
			return p2;
		else return p3;

	}

	

	public static void main(String[] args){

		Product p1=new Product("1","Product 1",100);
		Product p2=new Product("2","Product 2",200);
		Product p3=new Product("3","Product 3",80);

		Product l= price(p1,p2,p3);
		
		System.out.println("Lowest is "+l.price);

	}

	
}


