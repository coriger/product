package test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class Test {

	@org.junit.Test
	public void test() {
		File file = new File("E:\\workspace\\2013\\zshop\\src\\test\\init.sql");
		File file1 = new File("E:\\workspace\\2013\\zshop\\src\\test\\init1.sql");
		try {
			file1.createNewFile();
			List<String> list = FileUtils.readLines(file);
			for (String string : list) {
				FileUtils.writeStringToFile(file1, string+";\r\n", true);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
