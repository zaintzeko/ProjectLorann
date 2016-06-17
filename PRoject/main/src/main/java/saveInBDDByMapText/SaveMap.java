package saveInBDDByMapText;

import java.io.IOException;

public abstract class SaveMap {
	public static void saveAllMap()
	{
		for(int i = 1; i<=5; i++) {
			System.out.println(i);
			try {
				new LoadTextFile(i).loadFile("level/lvl" + i +".txt");
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
