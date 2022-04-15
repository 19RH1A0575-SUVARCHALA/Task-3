package com.Service;

import java.util.List;

import Bank.model.*;

public interface IService {
	void add(Bank bk);
	void delete(Bank bk);
	void update(Bank bk);
	List<Bank> selection();
}
