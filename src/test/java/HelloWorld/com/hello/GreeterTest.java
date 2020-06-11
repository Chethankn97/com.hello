package HelloWorld.com.hello;

import org.junit.Test;
import static org.junit.Assert.*;

import org.hamcrest.Matcher;


public class GreeterTest {
	private Greeter greeter = new Greeter();
	
	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(),containsString("Hello"));
		}

	private Matcher<String> containsString(String string) {
		return null;
	}
	
}
