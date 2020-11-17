package xt2.entity;

public class BookBean {
	private int code;
	private String name;
	private String author;
	private float price;
	private String memo;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		return "BookBean [code=" + code + ", name=" + name + ", author=" + author + ", price=" + price + ", memo="
				+ memo + "]";
	}
	
	
}
