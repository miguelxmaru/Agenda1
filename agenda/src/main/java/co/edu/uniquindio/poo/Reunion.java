package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String descripcion;
    private String fecha;
    private String hora;
    private List<Contacto> asistentes;

    public Reunion(String descripcion, String fecha, String hora){
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    // Métodos para agregar y remover asistentes
    public String agregarAsistente(Contacto contacto) {
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
            return "asistente agregado";
        }
        return "el asistente ya está en la lista";
    }
    
    public boolean removerAsistente(Contacto contacto) {
        return asistentes.remove(contacto);
        }
}

