package ish_practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

    public class ReadDataFromJason {
    
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
		
		// parse the Jason file
		 
		JSONParser p=new JSONParser();
		Object obj=p.parse(new FileReader("D:\\Selenium Anirudh\\jsms.json"));		
		
		//downcast the obj in to JasonObject ,automatically all the data will stored in the form of map
		
	    JSONObject map=(JSONObject)obj;
	    System.out.println(map.get("browser"));
	 	 
		
		

	}

}
