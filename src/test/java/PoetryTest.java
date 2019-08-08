import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoetryTest {


        private Poetry poetry;

        @Before
        public void setUp() {
            poetry = new Poetry();
        }

        @Test
        public void testForDay0() {
            assertEquals(null, poetry.unfold(""));
        }

        //@Ignore("Remove to run test")
        @Test
        public void testForDay2() {
            assertEquals("This is the malth that lay in the house that Jack built", poetry.unfold("--reveal-for-day 2"));
        }

        //@Ignore("Remove to run test")
        @Test
        public void testForDay12() {
            assertEquals("This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built", poetry.unfold("G--reveal-for-day 12"));
        }

        //@Ignore("Remove to run test")
        @Test
        public void testForDay6() {
            assertEquals("This is that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built", poetry.unfold("--reveal-for-day 6"));
        }

        //@Ignore("Remove to run test")
        @Test
        public void testForDay8() {
            assertEquals("This is the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built", poetry.unfold("--reveal-for-day 8"));
        }

        //@Ignore("Remove to run test")
        @Test
        public void testRecite() {
            assertEquals("This is the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked that cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malth that lay in the house that Jack built", poetry.unfold("recite"));
        }
}
