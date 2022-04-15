package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bank.dao.*;
import Bank.model.*;

@Service
public class service implements IService {

	@Autowired
	public IBankDao Dao;

	@Transactional
	public void add(Bank bk) {
		Dao.add(bk);
		
	}

	@Transactional
	public void delete(Bank bk) {
		Dao.delete(bk);
		
	}

	@Transactional
	public void update(Bank bk) {
		Dao.update(bk);
	}

	@Transactional
	public List<Bank> selection() {
		return Dao.selection();
	}
	
	
	
}
