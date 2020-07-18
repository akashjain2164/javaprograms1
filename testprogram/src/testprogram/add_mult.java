package testprogram;

public class add_mult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		add(5); //input=5,output=15
		mult(5); //input=5,o/p=120
		
		
	}

	static void mult(int multiplication) {
		for(int i=multiplication-1;i>=1;i--)
		{
			multiplication = multiplication*i;
		}
		System.out.println(multiplication+" ");
	}
		
		
	

	 static void add(int addition) {
		
		for(int i=addition-1;i>=0;i--)
		{
			addition = addition+i;
		}
		System.out.println(addition+" ");
	}

}
