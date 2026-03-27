package com.orangehrm.seleniumuiframework.demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReading {
	@DataProvider(name = "SampleData")
	Object[][] getdata(){
		return new Object[][] {
			{"Key","Value","1"},
			{"username","Admin","2"},
			{"password","admin123","3"}
		};
	}
	@Test(dataProvider = "SampleData")
	public void RedingDataProvider(String key,String value,String  data) {
		System.out.println("My keys is : "+ key +"---->"+ value +"---->"+data);
	}

}
