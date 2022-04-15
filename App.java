package com.Bank.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.Service.*;
import Bank.model.*;
import com.Bank.util.*;

public class App {
	public static void main(String[] args) throws InterruptedException, SQLException{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(HibernateUtil.class);
		IService sr = context.getBean(IService.class);
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your choice : ");
		System.out.println("1)Insert 2)Delete 3)Update 4)Select 5)Exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
    		System.out.println("Enter details ");
    		System.out.println("Enter Id: ");
    		int c1 = sc.nextInt();
    		System.out.println("Enter Name: ");
    		String c2 = sc.next();
    		System.out.println("Enter Aadhar: ");
    		String c3 = sc.next();
    		System.out.println("Enter mobile Number: ");
    		String c4 = sc.next();
    		System.out.println("Enter Amount: ");
    		String c5 = sc.next();
            sr.add(new Bank(c1,c2,c3,c4,c5));
            break;

    	case 2:  
    		sr.update(new Bank(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next()));
            break;
        
    	case 3: 
    		System.out.println("Enter id to delete");
    		Bank bk = new Bank();
    		bk.setId(sc.nextInt());
    		sr.delete(bk);
    		break;
    		
    	case 4:
    		List<Bank> cr4 = sr.selection();
    		for(Bank i:cr4) {
    			System.out.println(i.getId()+"    "+i.getName()+"     "+i.getAadhar()+"     "+i.getMobile_num()+"      "+i.getAmount());
    		}
    		break;
        
    	case 5: 
    		System.exit(0);
    		break;
		}
		}while(true);
		
	}
}