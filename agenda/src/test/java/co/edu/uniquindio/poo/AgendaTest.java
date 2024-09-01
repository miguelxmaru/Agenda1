package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

public class AgendaTest {
    //Crear un contacto
    @Test
    public void testCrearContacto() {
        Contacto contacto1 = new Contacto("Miguel Marulanda", "toño", "avenida 10", "123456789", "mmmz@uqvirtual.edu.co");
        assertEquals("Miguel Marulanda", contacto1.getNombre(), "El nombre del contacto debería ser 'Miguel Marulanda'");
        assertEquals("toño", contacto1.getAlias(), "El alias del contacto debería ser 'toño'");
        assertEquals("avenida 10", contacto1.getDireccion(), "La dirección del contacto debería ser 'avenida 10'");
        assertEquals("123456789", contacto1.getTelefono(), "El teléfono del contacto debería ser '123456789'");
        assertEquals("mmmz@uqvirtual.edu.co", contacto1.getEmail(), "El email del contacto debería ser 'mmmz@uqvirtual.edu.co'");
        JOptionPane.showMessageDialog(null, "Contactos creado");

    }
    @Test
    void testNoAgregarContactoDuplicado() {
        // Crear una nueva agenda
        Agenda agenda = new Agenda("Mi Agenda");

        // Crear un nuevo contacto y agregarlo
        Contacto contacto = new Contacto("Miguel Marulanda", "toño", "avenida 10", "123456789", "mmmz@uqvirtual.edu.co");
        agenda.agregarContacto(contacto);

        // Intentar agregar el mismo contacto otra vez
        Contacto contactoDuplicado2 = new Contacto("Miguel Marulanda", "toño", "avenida 10", "123456789", "mmmz@uqvirtual.edu.co");
        String resultado = agenda.agregarContacto(contactoDuplicado2);

        // Verificar que el resultado sea "contacto ya EXISTE"
        assertEquals("contacto ya EXISTE", resultado);
        JOptionPane.showMessageDialog(null, "Contactos duplicados");

    }
    @Test
    void testEliminarContacto() {
        // Crear una nueva agenda
        Agenda agenda = new Agenda("Mi Agenda");

        // Crear y agregar un nuevo contacto
        Contacto contacto = new Contacto("Miguel Marulanda", "toño", "avenida 10", "123456789", "mmmz@uqvirtual.edu.co");
        agenda.agregarContacto(contacto);

        // Eliminar el contacto de la agenda
        String resultado = agenda.eliminarContacto("Miguel Marulanda", "123456789");

        // Verificar que el resultado sea "El contacto ha sido eliminado."
        assertEquals("El contacto ha sido eliminado.", resultado);
        JOptionPane.showMessageDialog(null, "Contacto eliminado");

    }
    @Test
    public void testContactosDiferentes() {
        Contacto contacto1 = new Contacto("Miguel Marulanda", "toño", "avenida 10", "123456789", "mmmz@uqvirtual.edu.co");
        Contacto contacto2 = new Contacto("Raul", "Profesor", "uq", "987654321", "raul123@uqvirtual.edu.co");
        assertNotEquals(contacto1, contacto2, "Los contactos con diferente nombre o teléfono deberían ser diferentes");
        JOptionPane.showMessageDialog(null, "Contactos agregados");
    }
    
}