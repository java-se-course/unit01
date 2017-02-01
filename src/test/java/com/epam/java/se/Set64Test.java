package com.epam.java.se;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Simon Popugaev
 */
public class Set64Test {
    @Test
    public void add() throws Exception {
        final Set64 set = new Set64();

        assertFalse(set.contains(0));

        set.add(0);

        assertTrue(set.contains(0));

        assertFalse(set.contains(15));

        set.add(15);
        set.add(15);

        assertTrue(set.contains(15));

        set.add(-1);
        assertFalse(set.contains(-1));
        set.add(64);
        assertFalse(set.contains(64));
    }

    @Test
    public void remove() throws Exception {
        final Set64 set = new Set64();
        assertFalse(set.contains(0));
        set.add(0);
        assertTrue(set.contains(0));
        set.add(0);
        set.remove(0);
        assertFalse(set.contains(0));
    }

    @Test
    public void contains() throws Exception {
        final Set64 set = new Set64();
        for (int i = -1; i < 65; i++) {
            assertFalse(set.contains(i));
        }

        set.add(-1);
        set.add(-1);
        set.add(0);
        set.add(0);
        set.add(64);
        set.add(64);
        set.add(63);
        set.add(7);
        set.add(45);

        assertFalse(set.contains(13));

        for (int i = -1; i < 65; i++) {
            if (i == 0 || i == 7 || i == 45 || i == 63) {
                assertTrue(set.contains(i));
            } else {
                assertFalse("At index " + i, set.contains(i));
            }
        }
    }

    @Test
    @Ignore
    public void union() throws Exception {
        // TODO: 31.01.17
        throw new UnsupportedOperationException();
    }

    @Test
    @Ignore
    public void intersect() throws Exception {
        // TODO: 31.01.17
        throw new UnsupportedOperationException();
    }

}