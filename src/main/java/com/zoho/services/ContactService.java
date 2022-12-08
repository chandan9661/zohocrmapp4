package com.zoho.services;

import java.util.List;

import com.zoho.entities.Contacts;

public interface ContactService {
	public void saveLeadInformation(Contacts contacts);
	public List<Contacts> getAllContacts();
	public Contacts findContactById(long id);
	void saveContactInformation(Contacts contact);
}
