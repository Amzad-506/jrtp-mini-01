package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.beans.ContactBean;
import com.example.repo.ContactRepo;

public class ContactServImpl implements ContactServ{
	
	@Autowired
	private ContactRepo cr;

	@SuppressWarnings("unused")
	@Override
	public String addContact(ContactBean acb) {
		String msg;
		ContactBean save = cr.save(acb);
		if(save!=null) {
			return msg="s";
		}else {
			return msg="n";
		}
		
	}

}
