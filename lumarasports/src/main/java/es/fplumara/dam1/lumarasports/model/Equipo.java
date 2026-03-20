package es.fplumara.dam1.lumarasports.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // se utiliza para que los getters y setters se generen automaticamente sin tener que generarlos tu mismo
@AllArgsConstructor // se usa para generar un constructor con atributos
@NoArgsConstructor // se usa para generar un constructor sin atributos
public class Equipo {

    private Long id;

    @NotBlank(message = "El nombre es obligatorio") //similar al throw new runtime exception que se usa siempre, en este caso tira la excepción si está en blanco/vacio
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres") //al igual que en el anterior es similar a un throw new runtime exception con un if, en este caso el if sería que debe de ser mayor que 3 y menor que 50
    private String nombre;

    @NotBlank(message = "El juego es obligatorio")
    private String juego;

    @NotBlank(message = "El país es obligatorio")
    private String pais;

}
