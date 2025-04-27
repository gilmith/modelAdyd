package org.jacobo.adyd.ficha.model.firebase;

import lombok.Getter;

public enum Race {
    HUMANO("Humano", "Versátil y adaptable, sin bonificaciones ni penalizaciones especiales."),
    ELFO("Elfo", "Conocido por su agilidad y afinidad con la magia. Bonificación a la destreza."),
    MEDIO_ELFO("Medio-Elfo", "Combina la versatilidad humana con la gracia élfica. Bonificación a la carisma."),
    ENANO("Enano", "Resistente y fuerte, con bonificación a la constitución."),
    GNOMO("Gnomo", "Pequeño y astuto, con bonificación a la inteligencia."),
    MEDIANO("Mediano", "Ágil y sigiloso, con bonificación a la destreza."),
    SEMIORCO("Semiorco", "Fuerte y resistente, con bonificación a la fuerza pero penalización a la carisma.");

	@Getter
	private final String nombre;
	@Getter
    private final String descripcion;
    
    Race(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
