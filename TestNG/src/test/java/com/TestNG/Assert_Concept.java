package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BaseClass.BaseClass;

public class Assert_Concept extends BaseClass{
	
	
	@Test
	private void setUp() throws InterruptedException {
		
		initiateBrowser("gecko");
		   
		getUrl("https://www.amazon.in/");
		
		String expected = "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=610780881833&hvpos=&hvnetw=g&hvrand=10943003175445417734&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040218&hvtargid=kwd-64107830&hydadcr=14452_2316413&gclid=CjwKCAiA76-dBhByEiwAA0_s9Rdhty9BA27eqyLAjmuGRG78ybYl4kPDsXN-JuDgmGAnZ4Hy1VChmxoCSmwQAvD_BwE";
		
		System.out.println(expected);
		
		String actual = driver.getTitle();
		System.out.println(actual);
		
		SoftAssert s = new SoftAssert();
		s.assertNotEquals(actual, expected);
		s.assertAll();
	}
	

}
