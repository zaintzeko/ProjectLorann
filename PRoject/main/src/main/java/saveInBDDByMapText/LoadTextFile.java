package saveInBDDByMapText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import contract.IElement;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.FactoryElement;
import model.lorannWorld.element.motionless.MotionlessElement;

public class LoadTextFile {
	private final DAO dao;
	IElement[][] elements;


	public LoadTextFile()
	{
		this.dao = new DAO();
		this.elements = new Element[12][20];
	}
	public IElement[][] getElements() {
		return this.elements;
	}

	public void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int numLine = 0;
		while ((line = buffer.readLine()) != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				if(FactoryElement.getFromFileSymbolMotion(line.toCharArray()[x], null)!=null) {
					this.elements[numLine][x] = FactoryElement.getFromFileSymbolMotion(line.toCharArray()[x], null);
				}
				else if(FactoryElement.getFromFileSymbolMotionless(line.toCharArray()[x])!=null) {
					this.elements[numLine][x] = FactoryElement.getFromFileSymbolMotionless(line.toCharArray()[x]);
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

	public void save() {
		this.dao.open();
		this.dao.insertNettleWorld(this.elements, 1);
		this.dao.close();
	}
	public void setElements(final MotionlessElement[][] elements) {
		this.elements = elements;
	}
}
