package xt2.controller;

import java.util.ArrayList;
import java.util.List;

import xt2.entity.BookBean;
import xt2.service.impl.BookServiceImpl;

public class BookAction {
	
	BookServiceImpl service =new BookServiceImpl();
	
	public void showall() {
		List<BookBean> list =new ArrayList<>();
		list=service.showall();
		for(BookBean rst:list) {
			System.out.println(rst.toString());
		}
	}
	
	public void insert(int code,String name,String author, float price, String memo) {
		BookBean in =new BookBean();
		in.setCode(code);
		in.setName(name);
		in.setAuthor(author);
		in.setPrice(price);
		in.setMemo(memo);
		if(service.insert(in)) {
			System.out.println("insert succeed.");
			showall();
			}
		else {System.out.println("insert failed.");}
	}
	
	public void delete(int id) {
		if(service.delete(id)) {
			System.out.println("delete succeed.");
			showall();
		}
		else {System.out.println("delete failed.");}
	}
	
	public void update(int code,String name,String author, float price, String memo) {
		BookBean upd =new BookBean();
		upd.setCode(code);
		upd.setName(name);
		upd.setAuthor(author);
		upd.setPrice(price);
		upd.setMemo(memo);
		if(service.update(upd)) {
			System.out.println("update succeed");
			showall();
		}
		else {
			System.out.println("update failed");
		}
	}
	
	
	public void findbyId(int id) {
		BookBean rst =service.findbyId(id);
		System.out.println(rst.toString());
	}
	
	public void findbyName(String name) {
		BookBean in = new BookBean();
		in.setName(name);
		List<BookBean> rst= new ArrayList<>();
		rst=service.findbyEntity(in);
		for(BookBean out : rst) {
			System.out.println(out.toString());
		}
	}
}
