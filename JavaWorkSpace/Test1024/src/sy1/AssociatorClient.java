package sy1;

public final class AssociatorClient extends CommonClient {
	public void showClientType() {
		System.out.println("VIP�û�");
	}
	public void showBuy(String name, float price, int num) {
		float total=num*price;
		
		super.showBuy(name, price, num);
		
		System.out.println("-------------");
		System.out.println("VIP�����");
		System.out.println("�ܼ�\t"+total*0.9);
	}
}
