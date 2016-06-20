package saveInBDDByMapText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import contract.IElement;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.FactoryElement;
import model.lorannWorld.element.motionless.MotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class LoadTextFile.
 */
public class LoadTextFile {
	
	/** The dao. */
	private final DAO dao;
	
	/** The elements. */
	IElement[][] elements;
	
	/** The level. */
	private final int level;

	/**
	 * Instantiates a new load text file.
	 *
	 * @param level the level
	 */
	public LoadTextFile(final int level)
	{
		this.dao = new DAO();
		this.elements = new Element[12][20];
		this.level = level;
	}
	
	/**
	 * Gets the elements.
	 *
	 * @return the elements
	 */
	public IElement[][] getElements() {
		return this.elements;
	}

	/**
	 * Load file.
	 *
	 * @param fileName the file name
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int numLine = 0;
		while ((line = buffer.readLine()) != null) {
			for (int x = 0; (x < line.toCharArray().length) && (x<20); x++) {
				if(FactoryElement.getFromFileSymbolMotion(line.toCharArray()[x], null)!=null) {
					this.elements[numLine][x] = FactoryElement.getFromFileSymbolMotion(line.toCharArray()[x], null);
				}
				else if(FactoryElement.getFromFileSymbolMotionless(line.toCharArray()[x])!=null) {
					this.elements[numLine][x] = FactoryElement.getFromFileSymbolMotionless(line.toCharArray()[x]);
				}
				else if(FactoryElement.getfromFileSymbolLorann(line.toCharArray()[x], null)!=null) {
					this.elements[numLine][x] = FactoryElement.getfromFileSymbolLorann(line.toCharArray()[x], null);
				}
				if(this.elements[numLine][x]!= null) {
					System.out.print(this.elements[numLine][x].getSymbole());
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			numLine++;
		}
		buffer.close();
		this.save();
	}

	/**
	 * Save.
	 */
	public void save() {
		this.dao.open();
		this.dao.insertNettleWorld(this.elements, this.level);
		this.dao.close();
	}
	
	/**
	 * Sets the elements.
	 *
	 * @param elements the new elements
	 */
	public void setElements(final MotionlessElement[][] elements) {
		this.elements = elements;
	}
}
