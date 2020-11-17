package xt2;

import xt2.controller.BookAction;

public class XT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookAction sql =new BookAction();
//		sql.showall();
//		sql.insert(19, "恶意", "东野圭吾", 125.2f, "MidExam_2019_11_9");
//		sql.insert(16, "for_del", "af", 200f, "deletetest");
//		sql.update(15, "老人与海", "海明威", 1000f, "update");
//		sql.delete(16);
		sql.findbyId(1);
//		sql.findbyName("test");
	}

}
