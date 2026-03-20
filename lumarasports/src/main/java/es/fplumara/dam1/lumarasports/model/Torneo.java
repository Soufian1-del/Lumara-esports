package es.fplumara.dam1.lumarasports.model;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Torneo {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "La ciudad es obligatoria")
    private String ciudad;

    @NotNull(message = "El premio es obligatorio") //similar al throw new runtime execption con if en este caso el if es que no se puede estar vacio
    @DecimalMin(value = "0.01", message = "El premio debe ser mayor que 0") //similar al "size" del equipo, pero en este caso permite decimales
    private BigDecimal premio;

    @NotNull(message = "Debes seleccionar un equipo campeón")
    private Long equipoCampeonId;
}
