package assignments.SingletonDesignPattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class JukeBoxTest {
	
	@BeforeClass
	public static void oneTimeSetup() {
		
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	
	@Before
	public static void setup() {
		//runs after each test
	}
	
	@After
	public static void tearDown() {
		//runs after each test
	}
	
	//assertEquals(val1,val2)
	//assertFalse(val)
	//assertTrue(val)
	//assertSame(val1,val2)
	//assertNotSame(val1,val2)
	//assertNull(val)
	//assertNotNull(val)
	
	@Test
	public void testInstance() {
		JukeBox jukeBox = JukeBox.getInstance();
		assertNotNull(jukeBox);
	}
	

}
