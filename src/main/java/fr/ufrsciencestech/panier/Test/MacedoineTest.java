package fr.ufrsciencestech.panier.Test;

import fr.ufrsciencestech.panier.Model.Ananas;
import fr.ufrsciencestech.panier.Model.Fruit;
import fr.ufrsciencestech.panier.Model.Macedoine;
import fr.ufrsciencestech.panier.Model.Orange;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MacedoineTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddFruit() {
        Macedoine m = new Macedoine();
        Fruit f = new Orange();
        m.addFruit(f);
        assertEquals(1, m.getSize());
    }

    public void testGetSize() {
        Macedoine m = new Macedoine();
        assertEquals(0, m.getSize());
    }

    public void testIsSeedless() {
        Macedoine m = new Macedoine();
        m.addFruit(new Ananas());
        m.addFruit(new Orange());

        assertEquals(false, m.isSeedless());
    }

    public void testGetPrix() {
        Macedoine m = new Macedoine();
        m.addFruit(new Orange());
        m.addFruit(new Orange());

        assertEquals(1.0, m.getPrix());
    }

    public void testGetOrigine() {
        Macedoine m = new Macedoine();
        m.addFruit(new Orange());

        assertEquals("Espagne, ", m.getOrigine());
    }

    public void testToString() {
        Macedoine m = new Macedoine();
        m.addFruit(new Orange());

        assertEquals("[macedoine]: {Espagne, } ", m.toString());
    }
}