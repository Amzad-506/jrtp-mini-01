package com.example.service;

import com.example.beans.ContactBean;

public interface ContactServ {
//save fot 
	public String addContact(ContactBean acb);
	public ContactBean getItByOne(int id);
	
}
