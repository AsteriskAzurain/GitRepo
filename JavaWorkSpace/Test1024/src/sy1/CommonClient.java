package sy1;

public class CommonClient extends Client {

	@Override
	public void showClientType() {
		// TODO Auto-generated method stub
		System.out.println("��ͨ�û�");
	}

	@Override
	public void showBuy(String name, float price, int num) {
		// TODO Auto-generated method stub
		Goods g= new Goods();
		g.setAll(name, price, num);
		float total=num*price;
		
		System.out.println("����\t"+name);
		System.out.println("�۸�\t"+price);
		System.out.println("����\t"+num);
		System.out.println("�ܼ�\t"+total);

	}

}
