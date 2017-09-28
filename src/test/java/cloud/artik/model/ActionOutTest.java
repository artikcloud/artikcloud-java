package cloud.artik.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ActionOutTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getDataTest() {
		ActionOut actionOut = new ActionOut();
		assertNull(actionOut.getData());
	}
	
	@Test
	public void getCidTest() {
		ActionOut actionOut = new ActionOut();
		assertNull(actionOut.getCid());
	}
	
	@Test
	public void getDdidTest() {
		ActionOut actionOut = new ActionOut();
		assertNull(actionOut.getDdid());
	}
	
	@Test
	public void getSdidTest() {
		ActionOut actionOut = new ActionOut();
		assertNull(actionOut.getSdid());
	}

	@Test
	public void getTsTest() {
		ActionOut actionOut = new ActionOut();
		assertNull(actionOut.getTs());
	}

	@Test
	public void getTypeTest() {
		ActionOut actionOut = new ActionOut();
		assertEquals("action", actionOut.getType());
	}
	
	@Test
	public void setDataTest() {
		ActionOut actionOut = new ActionOut();
		try {
			actionOut.setData(null);
			actionOut.setData(new ActionDetailsArray());
		} catch (Exception e) {
			fail();
		}
	}
	
	
	@Test
	public void integrationSetDataGetDataTest() {
		ActionOut actionOut = new ActionOut();
		ActionDetailsArray actionDetailsArray = new ActionDetailsArray();
		actionOut.setData(actionDetailsArray);
		assertEquals(actionDetailsArray, actionOut.getData());
	}
}
