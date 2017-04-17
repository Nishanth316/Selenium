
public class Java_Day1 {

	public static void main(String[] args) {
		System.out.println("This is my firsst project");
		System.out.println("this is my second line in java project ");
        int a = 5220;
        
        int b = 647662987;
        int c = a+b;
        System.out.println(c);
        
        System.out.println("navigated to home page");
        Reusable_code RC = new Reusable_code();
       System.out.println( RC.ValidateHeader());
        
        Footer_Validator FV = new Footer_Validator();
        FV.footervalidation();
        FV.imagevalidation();
	}

}
