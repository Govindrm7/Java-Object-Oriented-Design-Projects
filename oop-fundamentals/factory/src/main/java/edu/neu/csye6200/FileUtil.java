package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	public static List<String> reader(String fileName) {
		List<String> a = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				a.add(line);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return a;

	}

	public static void writestd() throws IOException {
		String FileName = "src/main/java/edu/neu/csye6200/newdata.txt";
		FileWriter fw = new FileWriter(FileName);
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			for (int i = 0; i < abstractStore.OutList.size(); i++) {
				bw.append(abstractStore.OutList.get(i).toString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		bw.close();
	}
}
