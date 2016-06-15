package saveInBDDByMapText;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

	public void insertNettleWorld(final MotionlessElement elements[][], final int level) {
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
