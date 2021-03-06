package model;

import java.sql.Connection;
import java.sql.SQLException;

// TODO: Auto-generated Javadoc
/**
 * The Class DAOEntity.
 *
 * @param <E> the element type
 */
abstract class DAOEntity<E> {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 *
	 * @param connection the connection
	 * @throws SQLException the SQL exception
	 */
	public DAOEntity(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * Creates the.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 */
	public abstract boolean create(E entity);

	/**
	 * Delete.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 */
	public abstract boolean delete(E entity);

	/**
	 * Find.
	 *
	 * @param level the level
	 * @return the e
	 * @throws Exception the exception
	 */
	public abstract E find(int level) throws Exception;

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * Update.
	 *
	 * @param entity the entity
	 * @return true, if successful
	 */
	public abstract boolean update(E entity);

}
