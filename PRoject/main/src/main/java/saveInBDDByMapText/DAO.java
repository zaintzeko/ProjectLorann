package saveInBDDByMapText;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import contract.IElement;


// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	
	/** The login. */
	private static String LOGIN = "root";
	
	/** The password. */
	private static String PASSWORD = "root";
	
	/** The url. */
	private static String URL = "jdbc:mysql://localhost:8889/lorann?autoReconnect=true&useSSL=false";
	
	/** The connection. */
	private Connection connection;
	
	/** The statement. */
	private Statement statement;

	/**
	 * Instantiates a new dao.
	 */
	public DAO() {
		this.connection = null;
		this.statement = null;
	}

	/**
	 * Close.
	 *
	 * @return true, if successful
	 */
	public boolean close() {
		return true;
	}

	/**
	 * Execute update.
	 *
	 * @param query the query
	 * @return the int
	 * @throws SQLException the SQL exception
	 */
	private int executeUpdate(final String query) throws SQLException {
		return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
	}

	/**
	 * Gets the last id.
	 *
	 * @return the last id
	 */
	public int getLastId() {
		try {
			final ResultSet resultSet = this.statement.getGeneratedKeys();
			if (resultSet.next()) {
				return resultSet.getInt(2);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * Gets the statement.
	 *
	 * @return the statement
	 */
	public Statement getStatement() {
		return this.statement;
	}

	/**
	 * Insert nettle world.
	 *
	 * @param elements the elements
	 * @param level the level
	 */
	public void insertNettleWorld(final IElement elements[][], final int level) {
		try {
			this.executeUpdate(Query.getQueryInsert2(level));
			for (int y = 0; y < 12; y++) {
				for (int x = 0; x < 20; x++) {
					if(elements[y][x]!=null) {
						this.executeUpdate(Query.getQueryInsert1(level, elements[y][x], x, y));
					}

				}
			}
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// this.saveElements(nettleWorld);

	}

	/**
	 * Open.
	 *
	 * @return true, if successful
	 */
	public boolean open() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(DAO.URL, DAO.LOGIN, DAO.PASSWORD);
			this.statement = this.connection.createStatement();
			System.out.println("lrflflf");
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
