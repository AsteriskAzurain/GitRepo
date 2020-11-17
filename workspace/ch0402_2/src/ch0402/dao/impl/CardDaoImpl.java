package ch0402.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import ch04.utils.BookUtils;
import ch0402.dao.CardDao;
import ch0402.entity.CardBean;

public class CardDaoImpl implements CardDao {

	public Connection conn = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	
	@Override
	public int save(CardBean t) {
		// TODO Auto-generated method stub
		int n=0;
		conn= BookUtils.getConnection();
		try {
			StringBuffer sql =new StringBuffer();
			sql.append("insert into card_info"
					+ "(cname,ccompany,cposition,cphone,,ctel,cwechat,cmail,caddress,cnotes,cowner)"
					+ " values(?,?,?,?,?,?,?,?,?,?)");
			pstmt=conn.prepareStatement(sql.toString());
			pstmt.setString(1, t.getCname());
			pstmt.setString(2, t.getCcompany());
			pstmt.setString(3, t.getCposition());
			pstmt.setString(4, t.getCphone());
			pstmt.setString(5,t.getCtel());
			pstmt.setString(6,t.getCwechat());
			pstmt.setString(7,t.getCmail());
			pstmt.setString(8,t.getCaddress());
			pstmt.setString(9,t.getCnotes());
			pstmt.setInt(10, t.getCowner());
			n=pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("insert exception");
			e.printStackTrace();
		}finally {
			BookUtils.Close(rs, pstmt, conn);
		}
		return n;
	}

	@Override
	public int update(CardBean t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CardBean> findByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardBean findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CardBean> findByEntity(CardBean t) {
		// TODO Auto-generated method stub
		return null;
	}

}
