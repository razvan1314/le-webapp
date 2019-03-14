package com.ibercode.SpringBootWebApp.model;

public class Manager extends Person{

    private boolean active;

    public Manager() {
	super();
    }

    public Manager(int id, String firstName, String lastName) {
	super(id, firstName, lastName);
    }

    public Manager(boolean active) {
	super();
	this.active = active;
    }
    
    
}
