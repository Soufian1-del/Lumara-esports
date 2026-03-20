package es.fplumara.dam1.lumarasports.repository;

import es.fplumara.dam1.lumarasports.model.Equipo;

import java.util.List;

public interface EquipoRepository {

    List<Equipo> obtenerTodos();

    Equipo buscarPorId(Long id);

    void guardar(Equipo equipo);

    void actualizar(Equipo equipo);

    void borrar(Long id);

    boolean existePorNombre(String nombre);

    boolean existePorNombreDistintoId(String nombre, Long id);
}
