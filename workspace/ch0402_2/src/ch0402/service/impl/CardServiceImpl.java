package ch0402.service.impl;

import java.util.List;

import ch0402.dao.impl.CardDaoImpl;
import ch0402.entity.CardBean;
import ch0402.service.CardService;

public class CardServiceImpl implements CardService {
	CardDaoImpl dao= new CardDaoImpl();
	@Override
	public boolean save(CardBean t) {
		// TODO Auto-generated method stub
		if(dao.save(t)>0) {
			System.out.println("insert succeed");
			return true;
		}
		else{
			System.out.println("insert failed");
			return false;
		}
	}

	@Override
	public boolean update(CardBean t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
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
