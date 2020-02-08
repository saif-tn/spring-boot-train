package com.sip.ams.entities;

public class Person {
	private int id;
    private String firstName;
    private String lastName;

    public Person() {
 
    }
 
  public Person(int id, String firstName, String lastName) {
        this.id = id;
	  	this.firstName = firstName;
        this.lastName = lastName;
    }
 
    public String getFirstName() {
        return firstName;
   }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// cette fonction par default permet de cherche l'objet person a supprimer par la liste dejà des personnes
	@Override
    public boolean equals(Object o)
    {
    	Person temp = (Person)o;
    	
    	return this.id == temp.id && this.firstName.equals(temp.firstName) && this.lastName.equals(temp.lastName);
    }
	
}
