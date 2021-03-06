/**
 * This class is generated by jOOQ
 */
package com.pokemon.db;


import com.pokemon.db.tables.Move;
import com.pokemon.db.tables.Pokemon;
import com.pokemon.db.tables.StrongAgainst;
import com.pokemon.db.tables.Trainer;
import com.pokemon.db.tables.Trains;
import com.pokemon.db.tables.Type;
import com.pokemon.db.tables.records.MoveRecord;
import com.pokemon.db.tables.records.PokemonRecord;
import com.pokemon.db.tables.records.StrongAgainstRecord;
import com.pokemon.db.tables.records.TrainerRecord;
import com.pokemon.db.tables.records.TrainsRecord;
import com.pokemon.db.tables.records.TypeRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<TrainerRecord, Integer> IDENTITY_TRAINER = Identities0.IDENTITY_TRAINER;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<MoveRecord> MOVE_PKEY = UniqueKeys0.MOVE_PKEY;
	public static final UniqueKey<PokemonRecord> POKEMON_PKEY = UniqueKeys0.POKEMON_PKEY;
	public static final UniqueKey<StrongAgainstRecord> STRONG_AGAINST_PKEY = UniqueKeys0.STRONG_AGAINST_PKEY;
	public static final UniqueKey<TrainerRecord> TRAINER_PKEY = UniqueKeys0.TRAINER_PKEY;
	public static final UniqueKey<TrainerRecord> UNIQUE_USERNAME = UniqueKeys0.UNIQUE_USERNAME;
	public static final UniqueKey<TrainsRecord> TRAINS_PKEY = UniqueKeys0.TRAINS_PKEY;
	public static final UniqueKey<TypeRecord> TYPE_PKEY = UniqueKeys0.TYPE_PKEY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<MoveRecord, TypeRecord> MOVE__MOVE_TYPE_FKEY = ForeignKeys0.MOVE__MOVE_TYPE_FKEY;
	public static final ForeignKey<PokemonRecord, PokemonRecord> POKEMON__POKEMON_EVOLVES_TO_FKEY = ForeignKeys0.POKEMON__POKEMON_EVOLVES_TO_FKEY;
	public static final ForeignKey<PokemonRecord, TypeRecord> POKEMON__POKEMON_TYPE1_FKEY = ForeignKeys0.POKEMON__POKEMON_TYPE1_FKEY;
	public static final ForeignKey<PokemonRecord, TypeRecord> POKEMON__POKEMON_TYPE2_FKEY = ForeignKeys0.POKEMON__POKEMON_TYPE2_FKEY;
	public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE1_FKEY = ForeignKeys0.POKEMON__POKEMON_MOVE1_FKEY;
	public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE2_FKEY = ForeignKeys0.POKEMON__POKEMON_MOVE2_FKEY;
	public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE3_FKEY = ForeignKeys0.POKEMON__POKEMON_MOVE3_FKEY;
	public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE4_FKEY = ForeignKeys0.POKEMON__POKEMON_MOVE4_FKEY;
	public static final ForeignKey<StrongAgainstRecord, TypeRecord> STRONG_AGAINST__STRONG_AGAINST_WEAK_TYPE_FKEY = ForeignKeys0.STRONG_AGAINST__STRONG_AGAINST_WEAK_TYPE_FKEY;
	public static final ForeignKey<StrongAgainstRecord, TypeRecord> STRONG_AGAINST__STRONG_AGAINST_STRONG_TYPE_FKEY = ForeignKeys0.STRONG_AGAINST__STRONG_AGAINST_STRONG_TYPE_FKEY;
	public static final ForeignKey<TrainsRecord, PokemonRecord> TRAINS__TRAINS_POKEDEX_NUM_FKEY = ForeignKeys0.TRAINS__TRAINS_POKEDEX_NUM_FKEY;
	public static final ForeignKey<TrainsRecord, TrainerRecord> TRAINS__TRAINS_TID_FKEY = ForeignKeys0.TRAINS__TRAINS_TID_FKEY;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<TrainerRecord, Integer> IDENTITY_TRAINER = createIdentity(Trainer.TRAINER, Trainer.TRAINER.TID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<MoveRecord> MOVE_PKEY = createUniqueKey(Move.MOVE, Move.MOVE.NAME);
		public static final UniqueKey<PokemonRecord> POKEMON_PKEY = createUniqueKey(Pokemon.POKEMON, Pokemon.POKEMON.POKEDEX_NUM);
		public static final UniqueKey<StrongAgainstRecord> STRONG_AGAINST_PKEY = createUniqueKey(StrongAgainst.STRONG_AGAINST, StrongAgainst.STRONG_AGAINST.WEAK_TYPE, StrongAgainst.STRONG_AGAINST.STRONG_TYPE);
		public static final UniqueKey<TrainerRecord> TRAINER_PKEY = createUniqueKey(Trainer.TRAINER, Trainer.TRAINER.TID);
		public static final UniqueKey<TrainerRecord> UNIQUE_USERNAME = createUniqueKey(Trainer.TRAINER, Trainer.TRAINER.USERNAME);
		public static final UniqueKey<TrainsRecord> TRAINS_PKEY = createUniqueKey(Trains.TRAINS, Trains.TRAINS.POKEDEX_NUM, Trains.TRAINS.TID);
		public static final UniqueKey<TypeRecord> TYPE_PKEY = createUniqueKey(Type.TYPE, Type.TYPE.NAME);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<MoveRecord, TypeRecord> MOVE__MOVE_TYPE_FKEY = createForeignKey(com.pokemon.db.Keys.TYPE_PKEY, Move.MOVE, Move.MOVE.TYPE);
		public static final ForeignKey<PokemonRecord, PokemonRecord> POKEMON__POKEMON_EVOLVES_TO_FKEY = createForeignKey(com.pokemon.db.Keys.POKEMON_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.EVOLVES_FROM);
		public static final ForeignKey<PokemonRecord, TypeRecord> POKEMON__POKEMON_TYPE1_FKEY = createForeignKey(com.pokemon.db.Keys.TYPE_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.TYPE1);
		public static final ForeignKey<PokemonRecord, TypeRecord> POKEMON__POKEMON_TYPE2_FKEY = createForeignKey(com.pokemon.db.Keys.TYPE_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.TYPE2);
		public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE1_FKEY = createForeignKey(com.pokemon.db.Keys.MOVE_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.MOVE1);
		public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE2_FKEY = createForeignKey(com.pokemon.db.Keys.MOVE_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.MOVE2);
		public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE3_FKEY = createForeignKey(com.pokemon.db.Keys.MOVE_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.MOVE3);
		public static final ForeignKey<PokemonRecord, MoveRecord> POKEMON__POKEMON_MOVE4_FKEY = createForeignKey(com.pokemon.db.Keys.MOVE_PKEY, Pokemon.POKEMON, Pokemon.POKEMON.MOVE4);
		public static final ForeignKey<StrongAgainstRecord, TypeRecord> STRONG_AGAINST__STRONG_AGAINST_WEAK_TYPE_FKEY = createForeignKey(com.pokemon.db.Keys.TYPE_PKEY, StrongAgainst.STRONG_AGAINST, StrongAgainst.STRONG_AGAINST.WEAK_TYPE);
		public static final ForeignKey<StrongAgainstRecord, TypeRecord> STRONG_AGAINST__STRONG_AGAINST_STRONG_TYPE_FKEY = createForeignKey(com.pokemon.db.Keys.TYPE_PKEY, StrongAgainst.STRONG_AGAINST, StrongAgainst.STRONG_AGAINST.STRONG_TYPE);
		public static final ForeignKey<TrainsRecord, PokemonRecord> TRAINS__TRAINS_POKEDEX_NUM_FKEY = createForeignKey(com.pokemon.db.Keys.POKEMON_PKEY, Trains.TRAINS, Trains.TRAINS.POKEDEX_NUM);
		public static final ForeignKey<TrainsRecord, TrainerRecord> TRAINS__TRAINS_TID_FKEY = createForeignKey(com.pokemon.db.Keys.TRAINER_PKEY, Trains.TRAINS, Trains.TRAINS.TID);
	}
}
