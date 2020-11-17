package sy1;

public class SY1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonClient a=new CommonClient();
		a.showClientType();
		a.showBuy("옵있", 3, 6);
		System.out.println("#########");
		AssociatorClient b= new AssociatorClient();
		b.showClientType();
		b.showBuy("옵있", 3, 6);
	}

}
