package by.jb24.less12hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CSVReader {

	public static void main(String[] args) {

		String csvFile = "d:\\Programs\\eclipse\\eclipse-workspace\\less12\\lib\\library.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
		Set<String> set = new TreeSet<String>();
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] scv = line.split(cvsSplitBy);
				System.out.println("scv[0]= " + scv[0] + "\tscv[1]= " + scv[1] + "\tscv[2]= " + scv[2] + "\tscv[3]= "+ scv[3] + "\tscv[4]= " + scv[4]);

				for (int i = 0; i < scv.length; i++) {
					set.add(scv[0]);
				}

			}

			displayAll(set);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	static void displayAll(Collection<String> col) {
		Iterator<String> itr = col.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
		System.out.println();
	}
}
