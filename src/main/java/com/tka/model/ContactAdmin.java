package com.tka.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contactadmin") 
public class ContactAdmin {
	
	    @Id
	
	    private String name;
	    private String email;
	    private String mcontact;
	    private String subject;
	    private String message;

	    // Default Constructor
	    public ContactAdmin() {
	    }

	    // Parameterized Constructor
	    public ContactAdmin(String name, String email, String mcontact, String subject, String message) {
	        this.name = name;
	        this.email = email;
	        this.mcontact = mcontact;
	        this.subject = subject;
	        this.message = message;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMcontact() {
	        return mcontact;
	    }

	    public void setMcontact(String mcontact) {
	        this.mcontact = mcontact;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    @Override
	    public String toString() {
	        return "ContactAdmin [name=" + name + ", email=" + email + ", mcontact=" + mcontact
	                + ", subject=" + subject + ", message=" + message + "]";
	    }
	}



