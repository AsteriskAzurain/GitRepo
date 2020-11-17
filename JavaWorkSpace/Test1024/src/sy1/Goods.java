package sy1;

public class Goods {
	
	private String name;
	private float price;
	private int num;
	
	public void setName(String nm) {this.name=nm;}
	public String getNmae() {return name;}
	
	public void setPrice(float p) {this.price=p;}
	public float getPrice() {return price;}
	
	public void setNum(int n) {this.num=n;}
	public int getNum() {return num;}

	public void setAll(String name, float price, int num) {
		this.setName(name);
		this.setPrice(price);
		this.setNum(num);
	}
}
