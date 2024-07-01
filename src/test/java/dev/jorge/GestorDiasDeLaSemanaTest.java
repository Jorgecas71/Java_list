package dev.jorge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GestorDiasDeLaSemanaTest {

    private GestorDiasDeLaSemana gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorDiasDeLaSemana();
        gestor.crearDiasDeLaSemana();
    }

    @Test
    public void testGetDiasDeLaSemana() {
        assertEquals(7, gestor.getDiasDeLaSemana().size());
        assertEquals("Lunes", gestor.getDiasDeLaSemana().get(0));
    }

    @Test
    public void testGetLargoDeLaLista() {
        assertEquals(7, gestor.getLargoDeLaLista());
    }

    @Test
    public void testEliminarDiaDeLaSemana() {
        gestor.eliminarDiaDeLaSemana("Lunes");
        assertFalse(gestor.existeDia("Lunes"));
    }

    @Test
    public void testGetDiaDeLaSemana() {
        assertEquals("Lunes", gestor.getDiaDeLaSemana(0));
    }

    @Test
    public void testExisteDia() {
        assertTrue(gestor.existeDia("Lunes"));
       
    }

    @Test
    public void testOrdenarDias() {
        gestor.ordenarDias();
        assertEquals("Domingo", gestor.getDiaDeLaSemana(0));
    }

    @Test
    public void testVaciarLista() {
        gestor.vaciarLista();
        assertEquals(0, gestor.getLargoDeLaLista());
    }
    
}
