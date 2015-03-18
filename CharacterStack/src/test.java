import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import defect.CharacterStack;


public class test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCharacterStack() {
		CharacterStack stack = new CharacterStack();
		assertEquals(0, stack.getSize());
	}

}
