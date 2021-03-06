/**
 * This class is generated by jOOQ
 */
package com.pokemon.db.tables.pojos;


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
public class Move implements Serializable {

	private static final long serialVersionUID = 953313954;

	private final String  name;
	private final Integer strength;
	private final String  effect;
	private final String  description;
	private final String  type;

	public Move(Move value) {
		this.name = value.name;
		this.strength = value.strength;
		this.effect = value.effect;
		this.description = value.description;
		this.type = value.type;
	}

	public Move(
			String  name,
			Integer strength,
			String  effect,
			String  description,
			String  type
	) {
		this.name = name;
		this.strength = strength;
		this.effect = effect;
		this.description = description;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public Integer getStrength() {
		return this.strength;
	}

	public String getEffect() {
		return this.effect;
	}

	public String getDescription() {
		return this.description;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Move (");

		sb.append(name);
		sb.append(", ").append(strength);
		sb.append(", ").append(effect);
		sb.append(", ").append(description);
		sb.append(", ").append(type);

		sb.append(")");
		return sb.toString();
	}
}