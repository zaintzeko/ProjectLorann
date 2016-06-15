package saveInBDDByMapText;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import contract.ILorannWorld;
import contract.IMotionlessElement;
import model.lorannWorld.element.motionless.MotionlessElement;


public class DAO {
	private static String LOGIN = "root";
	private static String PASSWORD = "root";
	private static String URL = "jdbc:mysql://localhost:8889/lorann?autoReconnect=true&useSSL=false";
	private Connection connection;
	private Statement statement;

	public DAO() {
		this.connection = null;
		this.statement = null;
	}

	public boolean close() {
		return true;
	}

	private int executeUpdate(final String query) throws SQLException {
		return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
	}

	public int getLastId() {
		try {
			final ResultSet resultSet = this.statement.getGeneratedKeys();
			if (resultSet.next()) {
				return resultSet.getInt(1);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public Statement getStatement() {
		return this.statement;
	}

	public void insertNettleWorld(MotionlessElement elements[][], int level) {
		try {
			this.executeUpdate(Query.getQueryInsert(level));
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 20; j++) {
					this.executeUpdate(Query.getQueryInsert(elements[12][20], j, i));

				}
			}
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// this.saveElements(nettleWorld);

	}

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
