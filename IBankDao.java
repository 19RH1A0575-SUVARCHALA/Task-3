package com.Bank.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import Bank.model.*;
@Repository
public interface IBankDao {
	
	void add(Bank bk);
	void delete(Bank bk);
	void update(Bank bk);
	List<Bank> selection();
}