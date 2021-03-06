/**
 * This class is generated by jOOQ
 */
package com.pokemon.db.tables.records;


import com.pokemon.db.tables.Trains;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TrainsRecord extends UpdatableRecordImpl<TrainsRecord> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = -1509394694;

	/**
	 * Setter for <code>public.trains.pokedex_num</code>.
	 */
	public TrainsRecord setPokedexNum(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.trains.pokedex_num</code>.
	 */
	public Integer getPokedexNum() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.trains.tid</code>.
	 */
	public TrainsRecord setTid(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.trains.tid</code>.
	 */
	public Integer getTid() {
		return (Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record2<Integer, Integer> key() {
		return (Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Trains.TRAINS.POKEDEX_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Trains.TRAINS.TID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPokedexNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getTid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrainsRecord value1(Integer value) {
		setPokedexNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrainsRecord value2(Integer value) {
		setTid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TrainsRecord values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TrainsRecord
	 */
	public TrainsRecord() {
		super(Trains.TRAINS);
	}

	/**
	 * Create a detached, initialised TrainsRecord
	 */
	public TrainsRecord(Integer pokedexNum, Integer tid) {
		super(Trains.TRAINS);

		setValue(0, pokedexNum);
		setValue(1, tid);
	}
}
