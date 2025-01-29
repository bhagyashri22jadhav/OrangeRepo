package hooks;

import java.io.IOException;

import BaseLayer.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;

public class Hooks extends BaseClass {
    
	@BeforeAll
	public static void setup() throws IOException {
		BaseClass.initialization("chrome");
		BaseClass.getURL();
	}
	@After
	public static void refresh() {
		getDriver().navigate().refresh();
	}
	
}
