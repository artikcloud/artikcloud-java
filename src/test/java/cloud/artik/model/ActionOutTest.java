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
		//YWU
//        ActionDetails action = new ActionDetails();
//        ArrayList<ActionDetails> actions = new ArrayList<>();
//        ActionDetailsArray actionDetailsArray = new ActionDetailsArray();
//        ActionOut actionOut = new ActionOut();
//
//        action.setName("setOn");
//        actions.add(action);
//        actionDetailsArray.setActions(actions);
//        actionOut.data(actionDetailsArray);
//		
//		assertEquals(actionDetailsArray,actionOut.getData());
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
}
