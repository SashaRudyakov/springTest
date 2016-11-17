/**
 * This class is generated by jOOQ
 */
package com.thirdchannel.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class People2 implements Serializable {

	private static final long serialVersionUID = 1902751211;

	private final Integer id;
	private final String  firstName;
	private final String  lastName;
	private final Integer age;

	public People2(People2 value) {
		this.id = value.id;
		this.firstName = value.firstName;
		this.lastName = value.lastName;
		this.age = value.age;
	}

	public People2(
		Integer id,
		String  firstName,
		String  lastName,
		Integer age
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Integer getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Integer getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("People2 (");

		sb.append(id);
		sb.append(", ").append(firstName);
		sb.append(", ").append(lastName);
		sb.append(", ").append(age);

		sb.append(")");
		return sb.toString();
	}
}