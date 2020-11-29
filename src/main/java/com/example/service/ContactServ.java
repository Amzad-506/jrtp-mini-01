package com.example.service;

import java.util.List;

import com.example.beans.ContactBean;

public interface ContactServ {

	public String addContact(ContactBean acb);
	public String deleteContact(String name);
	public String updateContact(ContactBean ucb);
	public List<ContactBean> allContacts();
	public ContactBean searchContact(String name);
	
}
