package fr.ufrsciencestech.panier.Test;

import fr.ufrsciencestech.panier.Model.Jus;
import fr.ufrsciencestech.panier.Model.Orange;
import junit.framework.TestCase;

public class JusTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }

    public void testIsSeedless() {
        Jus j = new Jus(new Orange());
        assertEquals(false, j.isSeedless());
    }

    public void testGetPrix() {
        Jus j = new Jus(new Orange());
        assertEquals(1.0, j.getPrix());
    }

    public void testGetOrigine() {
        Jus j = new Jus(new Orange());
        assertEquals("Espagne", j.getOrigine());
    }

    public void testToString() {
        Jus j = new Jus(new Orange());
        assertEquals("Jus de Orange de Espagne coutant 0.5 euros", j.toString());
    }
}