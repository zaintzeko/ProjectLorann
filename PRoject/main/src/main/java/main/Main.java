package main;


import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

	/**
	 * The main method    .
	 *
	 * @param args
	 *          the arguments
	 * @throws SQLException
	 */
	public static void main(final  String[] args) throws SQLException {
		final Model model = new Model();
		final View view = new View(model);
		final Controller controller = new Controller(view, model);
		view.setController(controller);


		/*try {
			new LoadTextFile().loadFile("level/lvl1.txt");
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}