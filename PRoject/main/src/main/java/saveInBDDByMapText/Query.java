package saveInBDDByMapText;

import contract.IMotionlessElement;

public abstract class Query {
	public static String getQueryInsert(int level, IMotionlessElement element, final int i, final int j) {
		String a = "";

		a += "INSERT INTO mapbyelement (x, y, IDMap, IDElement) SELECT " + j + ", " + i
				+ ", IDNettleMap, IDElement FROM element, map WHERE level = "
				+ level + "\" AND Object = \"" + element.toString() + "\";\n";
		System.out.println(a);
		return a;
	}
	
	public static String getQueryInsert(final String level) {
		return "INSERT INTO Map(level) VALUES (" + level + ")";
	}
}
