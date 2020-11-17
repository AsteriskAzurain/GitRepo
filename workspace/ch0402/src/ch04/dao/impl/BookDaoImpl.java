package ch04.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ch04.dao.BookDao;
import ch04.entity.BookBean;
import ch04.utils.BookUtils;

public class BookDaoImpl implements BookDao {

	public Connection conn = null;
	public ResultSet rs = null;
	public PreparedStatement pstmt = null;

	@Override
	public int save(BookBean t) {
		// TODO Auto-generated method stub
		int n = 0;
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("insert into book(bid,bname,bauthor,bprice,bnote) values(?,?,?,?,?)");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, t.getBookid());
			pstmt.setString(2, t.getBookname());
			pstmt.setString(3, t.getAuthor());
			pstmt.setFloat(4, t.getPrice());
			pstmt.setString(5, t.getNotes());
			n = pstmt.executeUpdate();// ���n>0��˵������˼�¼
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public int update(BookBean t) {
		// TODO Auto-generated method stub
		int n = 0;
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("update book set bname=?,bauthor=?,bprice=?,bnote=? where bid=?");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(5, t.getBookid());
			pstmt.setString(1, t.getBookname());
			pstmt.setString(2, t.getAuthor());
			pstmt.setFloat(3, t.getPrice());
			pstmt.setString(4, t.getNotes());
			n = pstmt.executeUpdate(); // ���n>0��˵���޸��˼�¼
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
			sbSql.append("delete from book where bid=?");
			pstmt = conn.prepareStatement(sbSql.toString());
			pstmt.setInt(1, id);
			n = pstmt.executeUpdate(); // ���n=1��˵��ɾ���˼�¼
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public List<BookBean> findByAll() {
		// TODO Auto-generated method stub
		List<BookBean> list = new ArrayList<>();
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from book");
			pstmt = conn.prepareStatement(sbSql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("find sth");
				BookBean book = new BookBean();
				book.setBookid(rs.getInt("bid"));
				book.setBookname(rs.getString("bname"));
				book.setAuthor(rs.getString("bauthor"));
				book.setPrice(rs.getFloat("bprice"));
				book.setNotes(rs.getString("bnote"));
				list.add(book);
			}
		} catch (Exception e) {
			System.out.println("findall failed");
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return list;
	}

	@Override
	public BookBean findById(int id) {
		// TODO Auto-generated method stub

		BookBean book = new BookBean();

		conn = BookUtils.getConnection();
		try {
			System.out.println("findbyid start");
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from book where bid=? ");// ͨ��id�����Ҽ�¼
			System.out.println(sbSql.toString());
			PreparedStatement pstmt1 = conn.prepareStatement(sbSql.toString());
			pstmt1.setInt(1, id);
			ResultSet rs1 = pstmt1.executeQuery();
			System.out.println(rs);
			while(rs1.next()) {
				book.setBookid(rs1.getInt("bid"));
				book.setBookname(rs1.getString("bname"));
				book.setAuthor(rs1.getString("bauthor"));
				book.setPrice(rs1.getFloat("bprice"));
				book.setNotes(rs1.getString("bnote"));
			}
			BookUtils.Close(rs1, pstmt, conn);
		} catch (Exception e) {
			System.out.println("get rst exception");
			e.printStackTrace();
		} finally {
			System.out.println("close");
			
		}
		return book;
	}

	@Override
	public List<BookBean> findByEntity(BookBean t) {
		// TODO Auto-generated method stub
		List<BookBean> list = new ArrayList<>();
		conn = BookUtils.getConnection();
		try {
			StringBuffer sbSql = new StringBuffer();
			sbSql.append("select * from book where 0=1 "); // ��֮���if�������㣬�򷵻�ȫ����¼

			if (t.getBookid() > 0) {// ͨ��id��ѯ
				sbSql.append(" or bid =").append(t.getBookid());
			}
			if (t.getBookname() != null && !t.getBookname().equals("")) {// ͨ��������ѯ
				sbSql.append(" or bname like '%" + t.getBookname() + "%'");
			}
			if (t.getAuthor() != null && !t.getAuthor().equals("")) {// ͨ�����߲�ѯ
				sbSql.append(" or bauthor like '%" + t.getAuthor() + "%'");
			}

			pstmt = conn.prepareStatement(sbSql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BookBean book = new BookBean();
				book.setBookid(rs.getInt("bid"));
				book.setBookname(rs.getString("bname"));
				book.setAuthor(rs.getString(3));
				book.setPrice(rs.getFloat("bprice"));
				book.setNotes(rs.getString("bnote"));
				list.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return list;
	}

}
