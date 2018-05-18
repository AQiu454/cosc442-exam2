package ui;

import java.awt.Color;
import game.Tile;
import game.Effect;
import game.Creature;
import game.Spell;
import game.World;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CastSpellScreenTest</code> contains tests for the class <code>{@link CastSpellScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/18 3:04 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class CastSpellScreenTest {
	/**
	 * Run the CastSpellScreen(Creature,String,int,int,Spell) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testCastSpellScreen_1()
		throws Exception {
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		String caption = "";
		int sx = 1;
		int sy = 1;
		Spell spell = new Spell("", 1, new Effect(1));

		CastSpellScreen result = new CastSpellScreen(player, caption, sx, sy, spell);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testSelectWorldCoordinate_1()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
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
	 * @generatedBy CodePro at 5/18/18 3:04 PM
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
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CastSpellScreenTest.class);
	}
}