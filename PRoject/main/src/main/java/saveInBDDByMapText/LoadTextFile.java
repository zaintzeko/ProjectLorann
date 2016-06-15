package saveInBDDByMapText;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;

import contract.ILorannWorld;
import contract.IMotionlessElement;
import model.lorannWorld.LorannWorld;
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
		elements = new MotionlessElement[20][12];
	}
	
	private void loadFile(final String fileName) throws IOException {
		final BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		String line;
		int numLine;
		while ((line = buffer.readLine()) != null) {
			for (int x = 0; x < line.toCharArray().length; x++) {
				elements[x][numLine] = FactoryElement.getFromStringSymbol(line.toCharArray()[x]);
			}
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
