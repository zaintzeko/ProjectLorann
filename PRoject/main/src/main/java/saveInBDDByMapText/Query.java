package saveInBDDByMapText;

import contract.IElement;

public abstract class Query {
	public static String getQueryInsert1(final int level, final IElement elements, final int x, final int y) {
		String a = "";
		System.out.println(elements);
		a += "INSERT INTO mapbyelement (PosX, PosY, IDMap, IDElement) SELECT " + x + ", " + y
				+ ", IDMap, IDElement FROM element, map WHERE numberlevel = "
				+ level + " AND NameElement = \"" + elements.getSymbole() + "\";\n";
		System.out.println(a);
		return a;
	}

	public static String getQueryInsert2(final int level) {
		System.out.println(level);
		return "INSERT INTO Map(numberlevel) VALUES (" + level + ")";
	}
}
