package src;

import static org.junit.jupiter.api.Assertions.*;

class TiendaTest {



    @org.junit.jupiter.api.Test
    void size() {
        Tienda tienda = Lector.readFile("HashMap");
        assertEquals(7, tienda.size());
    }

    @org.junit.jupiter.api.Test
    void encontrarPorValor() {
        Tienda tienda = Lector.readFile("HashMap");
        assertEquals(true, tienda.encontrarPorValor("\tPescados"));
    }

    @org.junit.jupiter.api.Test
    void mostrarCategoria() {
        Tienda tienda = Lector.readFile("HashMap");
        assertEquals("Categoria: Carnes ", tienda.mostrarCategoria("\tPescados"));
    }

}