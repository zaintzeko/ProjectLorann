package saveInBDDByMapText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;

import contract.ILorannWorld;
import contract.IMotionlessElement;
import model.lorannWorld.LorannWorld;
import model.lorannWorld.element.motionless.FactoryElement;
import model.lorannWorld.element.motionless.MotionlessElement;

public class LoadTextFile {
	private DAO dao;
	MotionlessElement[][] elements;

	
	public MotionlessElement[][] getElements() {
		return elements;
	}
	public void setElements(MotionlessElement[][] elements) {
		this.elements = elements;
	}
	public LoadTextFile()
	{
		this.dao = new DAO();
		elements = new MotionlessElement[12][20];
	}
	
	@SuppressWarnings("unused")
	public void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int numLine = 0;
		while ((line = buffer.readLine()) != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				this.elements[numLine][x] = FactoryElement.getFromFileSymbol(line.toCharArray()[x]);
				if(elements[numLine][x]!= null)System.out.print(elements[numLine][x].getSymbole());
				else System.out.print(" ");
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
}
