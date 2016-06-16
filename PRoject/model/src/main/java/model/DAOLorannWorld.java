package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.lorannWorld.LorannWorld;
import model.lorannWorld.element.FactoryElement;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOLorannWorld extends DAOEntity<LorannWorld> {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOLorannWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public LorannWorld find(final int level) {
		final LorannWorld lorannWorld = new LorannWorld();

		try {
			final String sql = "{call LorannMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, level);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			while (resultSet.next()) {
				if(FactoryElement.getFromFileSymbolMotionless(resultSet.getString("NameElement").toCharArray()[0]) != null) {
					lorannWorld.addElement(FactoryElement.getFromFileSymbolMotionless(resultSet.getString("NameElement").toCharArray()[0]), resultSet.getInt("PosX"), resultSet.getInt("PosY"));
				}
				else if(FactoryElement.getFromFileSymbolMotion(resultSet.getString("NameElement").toCharArray()[0]) != null) {
					lorannWorld.addElement(FactoryElement.getFromFileSymbolMotion(resultSet.getString("NameElement").toCharArray()[0]), resultSet.getInt("PosX"), resultSet.getInt("PosY"));
				}
			}
			return lorannWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final LorannWorld entity) {
		// Not implemented
		return false;
	}

}
