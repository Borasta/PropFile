package odbg.org.main;

import java.util.Properties;

import odbg.org.libs.PropFile;

public class Main {

	public static void main(String[] args) {
		
		Properties prop = PropFile.getfile("database");
		
		System.out.println(prop);
		
	}

}
