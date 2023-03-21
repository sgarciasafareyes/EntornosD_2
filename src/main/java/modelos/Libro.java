package modelos;

import lombok.Data;

@Data
public class Libro extends Producto {
    private String autor;
    private int numPaginas;

    }
