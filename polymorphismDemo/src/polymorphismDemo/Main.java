package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//BaseLogger baseLogger=new BaseLogger();
		 
		BaseLogger[] logger=new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger() };
	
	
	}

}
