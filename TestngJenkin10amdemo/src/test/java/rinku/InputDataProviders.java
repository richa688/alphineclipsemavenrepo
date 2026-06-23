package rinku;

import org.testng.annotations.DataProvider;

public class InputDataProviders {
	@DataProvider
	public Object[][] selectData()
	{

		Object[][] obj = {
				      {37,12},
				      {92,51},
				      {77,48},
				      {63,31}
		};
		return obj;
	}

}
