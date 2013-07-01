package com.nacrtstudio.pages;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.nacrtstudio.entities.Address;

public class Contact
{
@Inject
private Session session;
@Property
private Address address;
@CommitAfter
public Object onSuccess(){
	session.persist(address);
	return Index.class;
}
}
