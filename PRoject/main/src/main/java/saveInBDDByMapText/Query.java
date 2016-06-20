package saveInBDDByMapText;

import contract.IElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Query.
 */
public abstract class Query {
	
	/**
	 * Gets the query insert 1.
	 *
	 * @param level the level
	 * @param elements the elements
	 * @param x the x
	 * @param y the y
	 * @return the query insert 1
	 */
	public static String getQueryInsert1(final int level, final IElement elements, final int x, final int y) {
		String a = "";
		System.out.println(elements);
		a += "INSERT INTO mapbyelement (PosX, PosY, IDMap, IDElement) SELECT " + x + ", " + y
				+ ", IDMap, IDElement FROM element, map WHERE numberlevel = "
				+ level + " AND NameElement = \"" + elements.getSymbole() + "\";\n";
		System.out.println(a);
		return a;
	}

	/**
	 * Gets the query insert 2.
	 *
	 * @param level the level
	 * @return the query insert 2
	 */
	public static String getQueryInsert2(final int level) {
		System.out.println(level);
		return "INSERT INTO Map(numberlevel) VALUES (" + level + ")";
	}
}
