package com.Bank.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Bank.model.*;
@Repository
public class BankDao implements IBankDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(Bank bk) {
		sessionFactory.getCurrentSession().save(bk);
		
	}

	@Override
	public void delete(Bank bk) {
		sessionFactory.getCurrentSession().delete(bk);
		
	}

	@Override
	public void update(Bank bk) {
		sessionFactory.getCurrentSession().update(bk);
		
	}

	@Override
	public List<Bank> selection() {
		List<Bank> bk = (List<Bank>) sessionFactory.getCurrentSession()
                .createCriteria(Bank.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return bk;
	}
	
	
	
}