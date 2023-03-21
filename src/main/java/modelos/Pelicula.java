package modelos;

import lombok.Data;

@Data
public class Pelicula extends Producto {
    private String director;
    private int duracion;

}