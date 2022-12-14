package SortingTest;

import GenericClassesAndInterfaces.SortedPair;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SortingPairTest {

@Test
    public void shouldRetainOrderOfOrderedPair() {
            SortedPair<Integer> pair = new SortedPair<>(1, 2);

            assertEquals(1, pair.getFirst().intValue());
            assertEquals(2, pair.getSecond().intValue());
        }

        @Test
        public void shouldFlipOrderOfMisorderedPair() {
            SortedPair<Integer> pair = new SortedPair<>(2, 1);

            assertEquals(1, pair.getFirst().intValue());
            assertEquals(2, pair.getSecond().intValue());
        }

    }

