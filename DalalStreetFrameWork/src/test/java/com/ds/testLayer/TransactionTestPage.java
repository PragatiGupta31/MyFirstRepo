package com.ds.testLayer;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ds.testBase.TestBase;

public class TransactionTestPage extends TestBase {
	
	@Test
	public void getDatafromTransactionPage() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		buy_obj.clickonTransaction();
		tran_obj.getAllData();
	}

}
