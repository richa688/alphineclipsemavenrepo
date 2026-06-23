package rinku;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class InputParameter {
	
	@DataProvider(name="getData")
	public Object[][] dataSet()
	{

		Object[][] obj = {
				      {10,56},
				      {34,78},
				      {12,60},
				      {51,44}
		};
		return obj;
	}
	
	
	@Parameters({"avg","mark"})
	@Test
	
	void show(String a,int b)
	{
		System.out.println("show a="+a+" b="+b);
	}
	

	@Test(dataProvider = "selectData", dataProviderClass = InputDataProviders.class   )
	
	void outsideData(int a,int b)
	{
		System.out.println("outsideData a="+a+" b="+b);
	}
	
	
	@Test
	void display()
	{
		System.out.println("in display");
	}
	

}
