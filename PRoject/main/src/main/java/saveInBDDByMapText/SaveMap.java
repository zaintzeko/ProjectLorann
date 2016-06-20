package saveInBDDByMapText;

import java.io.IOException;

// TODO: Auto-generated Javadoc
/**
 * The Class SaveMap.
 */
public abstract class SaveMap {
	
	/**
	 * Save all map.
	 */
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
