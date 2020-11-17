package sy1;

public class CommonClient extends Client {

	@Override
	public void showClientType() {
		// TODO Auto-generated method stub
		System.out.println("普通用户");
	}

	@Override
	public void showBuy(String name, float price, int num) {
		// TODO Auto-generated method stub
		Goods g= new Goods();
		g.setAll(name, price, num);
		float total=num*price;
		
		System.out.println("货物\t"+name);
		System.out.println("价格\t"+price);
		System.out.println("数量\t"+num);
		System.out.println("总价\t"+total);

	}

}
