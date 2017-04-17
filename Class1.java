package _java;

public class Class1 {
	
	static int count = 10;

	public static void main(String[] args) {
		Class2 ob_ = new Class2();
		ob_.fun();
	    Class1 ob = new Class1();
	    System.out.println(ob.count);
		if(count<10){
			System.out.println("true");
		} else{
			System.out.println(false);
		}
		
	

	}

}
