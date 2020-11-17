package xt2.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import xt2.dao.BookDao;
import xt2.entity.BookBean;
import xt2.utils.BookUtils;

public class BookDaoImpl implements BookDao {

	public Connection conn = null;
	public ResultSet rs = null;
	public PreparedStatement pstmt = null;
	
	@Override
	public List<BookBean> showall() {
		// TODO Auto-generated method stub
		List<BookBean> list = new ArrayList<>();
		conn=BookUtils.getConnection();
		try {
			StringBuffer sql= new StringBuffer();
			sql.append("select * from book");
			pstmt=conn.prepareStatement(sql.toString());
			rs=pstmt.executeQuery();
			while(rs.next()){
				BookBean book= new BookBean();
				book.setCode(rs.getInt("code"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setMemo(rs.getString("memo"));
				list.add(book);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return list;
	}

	@Override
	public int insert(BookBean book) {
		// TODO Auto-generated method stub
		int n = 0;
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into book(code,name,author,price,memo) values(?,?,?,?,?)");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, book.getCode());
			pstmt.setString(2, book.getName());
			pstmt.setString(3, book.getAuthor());
			pstmt.setFloat(4, book.getPrice());
			pstmt.setString(5, book.getMemo());
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int n = 0;
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("delete from book where code=?");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, id);
			n = pstmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public int update(BookBean book) {
		// TODO Auto-generated method stub
		int n = 0;
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("update book set name=?,author=?,price=?,memo=? where code=?");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(5, book.getCode());
			pstmt.setString(1, book.getName());
			pstmt.setString(2, book.getAuthor());
			pstmt.setFloat(3,book.getPrice());
			pstmt.setString(4, book.getMemo());
			n = pstmt.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public BookBean findbyId(int id) {
		// TODO Auto-generated method stub
		BookBean book = new BookBean();

		conn = BookUtils.getConnection();
		try {
			System.out.println("findbyid start");
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from ch04_book where id=? ");
//			sbSql.append(id);
//			System.out.println(sbSql.toString());
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			System.out.println(rs);
			while(rs.next()) {
				book.setCode(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getFloat("price"));
				book.setMemo(rs.getString("memo"));
			}
			BookUtils.Close(rs, pstmt, conn);
		} catch (Exception e) {
			System.out.println("get rst exception");
			e.printStackTrace();
		} finally {
			System.out.println("close");
			
		}
		return book;
	}

	@Override
	public List<BookBean> findbyEntity(BookBean book) {
		// TODO Auto-generated method stub
		List<BookBean> list = new ArrayList<>();
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from book where 0=1 "); 

			if (book.getCode() > 0) {// 通锟斤拷id锟斤拷询
				sbSql.append(" or code =").append(book.getCode());
			}
			if (book.getName() != null && !book.getName().equals("")) {
				sbSql.append(" or name like '%" + book.getName() + "%'");
			}
			if (book.getAuthor() != null && !book.getAuthor().equals("")) {
				sbSql.append(" or author like '%" + book.getAuthor() + "%'");
			}

			pstmt = conn.prepareStatement(sbSql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BookBean rsbook = new BookBean();
				rsbook.setCode(rs.getInt("code"));
				rsbook.setName(rs.getString("name"));
				rsbook.setAuthor(rs.getString("author"));
				rsbook.setPrice(rs.getFloat("price"));
				rsbook.setMemo(rs.getString("memo"));
				list.add(rsbook);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return list;
	}


}
