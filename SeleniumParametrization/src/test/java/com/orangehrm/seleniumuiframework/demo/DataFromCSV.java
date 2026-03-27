package com.orangehrm.seleniumuiframework.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class DataFromCSV {
	@Test
	public void readcsv() throws IOException {
		FileReader fr=new FileReader("./src/test/resources/orangehrm.testscriptdata/testscript.csv");
//		int i;
//		while((i=fr.read())!=-1) {
//			System.out.print((char)i);
//		}
		System.out.println("----------------->");
		String line="";
		BufferedReader br=new BufferedReader(fr);
		while((line=br.readLine())!=null) {
			String data[]=line.split(",");
			System.out.println(data[0]+"------>"+data[1]);
		}
		
	}
}
