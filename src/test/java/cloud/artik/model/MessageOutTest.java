package cloud.artik.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessageOutTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getDataTest() {
		MessageOut messageOut = new MessageOut();
		assertEquals(0, messageOut.getData().size());
	}
	
	@Test
	public void getCidTest() {
		MessageOut messageOut = new MessageOut();
		assertNull(messageOut.getCid());
	}
	
	@Test
	public void getDdidTest() {
		MessageOut messageOut = new MessageOut();
		assertNull(messageOut.getDdid());
	}
	
	@Test
	public void getSdidTest() {
		MessageOut messageOut = new MessageOut();
		assertNull(messageOut.getSdid());
	}

	@Test
	public void getTsTest() {
		MessageOut messageOut = new MessageOut();
		assertNull(messageOut.getTs());
	}

	@Test
	public void getTypeTest() {
		MessageOut messageOut = new MessageOut();
		assertEquals("message", messageOut.getType());
	}

}
