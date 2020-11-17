package com.ishang.entity;

public class BookBean {
	private int bookid; // 书号
	private String bookname; // 书名
	private String author; // 作�??
	private float price; // 价格
	private String publisher; // 出版�?

	public BookBean() {
		bookid = 1000;
		bookname = "Java Web�?�?";
		author = "Abc";
		price = 50;
		publisher = "机械工业出版�?";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
