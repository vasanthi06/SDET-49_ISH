package ish_practice;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider = "phone")
	
	public void addProduct(String phone , int price)
	{
		System.out.println(phone+"-----"+price);
	}
	@DataProvider(name="phone")
	public Object[][] getData()
	{
		Object[][]data = new Object[3][2];
		data[0][0] ="samsung";
		data[0][1] =15000;
		
		data[1][0] ="IQQO";
		data[1][1] = 23000;
		
		data[2][0] ="vivo";
		data[2][1] =22000;
		
		return data;
		
	}
   


}

