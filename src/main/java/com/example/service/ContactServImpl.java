package com.example.service;

import java.util.Optional;

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

	//2565- find by id
	@Override
	public ContactBean getItByOne(int id) {
		ContactBean cb=new ContactBean();
		cb.setCid(123);
		cb.setCname("Ramana");
		cb.setCnum(8956);
		cb.setCemail("raamana@gmail.com");
		Optional<ContactBean> findById = cr.findById(id);
		if(findById.isPresent()) {
			ContactBean contactBean = findById.get();
			return contactBean;
		}else {
			return cb;
		}
		
	}

}
