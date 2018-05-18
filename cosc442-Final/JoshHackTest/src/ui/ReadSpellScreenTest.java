package ui;

import java.awt.Color;
import java.awt.Component;
import game.Effect;
import game.Creature;
import asciiPanel.AsciiPanel;
import game.Spell;
import game.World;
import java.awt.event.KeyEvent;
import game.Tile;
import game.Item;
import game.AppletMain;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ReadSpellScreenTest</code> contains tests for the class <code>{@link ReadSpellScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/18 3:04 PM
 * @author Club President
 * @version $Revision: 1.0 $
 */
public class ReadSpellScreenTest {
	/**
	 * Run the ReadSpellScreen(Creature,int,int,Item) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testReadSpellScreen_1()
		throws Exception {
		Creature player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int sx = 1;
		int sy = 1;
		Item item = new Item('', new Color(1), "", "");

		ReadSpellScreen result = new ReadSpellScreen(player, sx, sy, item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testDisplayOutput_3()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testDisplayOutput_4()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testRespondToUserInput_4()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen use(Spell) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testUse_1()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		Spell spell = new Spell("", 1, new Effect(1));

		Screen result = fixture.use(spell);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen use(Spell) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 3:04 PM
	 */
	@Test
	public void testUse_2()
		throws Exception {
		ReadSpellScreen fixture = new ReadSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), 1, 1, new Item('', new Color(1), "", ""));
		Spell spell = new Spell("", 1, new Effect(1));

		Screen result = fixture.use(spell);

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
		new org.junit.runner.JUnitCore().run(ReadSpellScreenTest.class);
	}
}