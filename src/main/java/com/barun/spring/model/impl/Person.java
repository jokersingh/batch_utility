/**
 * 
 */
package com.barun.spring.model.impl;

import com.barun.spring.model.Model;

/**
 * @author bibhu
 *
 */
public class Person implements Model {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1853355651832301663L;
	private String lastName;
    private String firstName;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", lastName: " + lastName;
    }

}
