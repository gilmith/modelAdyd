package org.jacobo.adyd.ficha.model.firebase;

import lombok.Getter;

public enum Clase {
	
	GUERRERO("guerrero", "vive o muere gracias a su conocimiento de las armas y tacticas"),
	PALADIN("paladin", "campeon de las virtudes"),
	GUARDABOSQUES("guardabosques", "guia de los caminos secretos de los bosques"),
	MAGO("mago", "señor de conocmiento arcano"),
	CLERIGO("clerigo", "director espiritual"),
	DRUIDA("druida", "señor de los boques"),
	LADRON("ladron", "bribon"),
	BARDO("bardo", "hombre para todo");
	
	
	
	
	@Getter
	private String nombre;
	@Getter
	private String descripcion;

	Clase(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
			
	}

}
