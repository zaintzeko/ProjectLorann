package saveInBDDByMapText;

import model.lorannWorld.element.Element;

public abstract class Query {
	public static String getQueryInsert1(final int level, final Element element, final int x, final int y) {
		String a = "";
		System.out.println(element);
		a += "INSERT INTO mapbyelement (PosX, PosY, IDMap, IDElement) SELECT " + x + ", " + y
				+ ", IDMap, IDElement FROM element, map WHERE numberlevel = "
				+ level + " AND NameElement = \"" + element.getSymbole() + "\";\n";
		System.out.println(a);
		return a;
	}

	public static String getQueryInsert2(final int level) {
		return "INSERT INTO Map(numberlevel) VALUES (" + level + ")";
	}
}
