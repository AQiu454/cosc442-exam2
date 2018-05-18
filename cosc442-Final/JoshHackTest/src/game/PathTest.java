package game;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>PathTest</code> contains tests for the class <code>{@link Path}</code>.
 *
 * @generatedBy CodePro at 5/18/18 3:03 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class PathTest {
	/**
	 * Run the Path(Creature,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:03 PM
	 */
	@Test
	public void testPath_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		creature.z = 1;
		int x = 1;
		int y = 1;

		Path result = new Path(creature, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the List<Point> points() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:03 PM
	 */
	@Test
	public void testPoints_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		creature.z = 1;
		Path fixture = new Path(creature, 1, 1);

		List<Point> result = fixture.points();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 3:03 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 3:03 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/18 3:03 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PathTest.class);
	}
}