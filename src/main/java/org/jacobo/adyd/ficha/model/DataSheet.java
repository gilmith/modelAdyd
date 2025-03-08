package org.jacobo.adyd.ficha.model;

import java.time.LocalDateTime;
import java.util.List;

public record DataSheet(String id, String name, String playerName, String playerEmail,  Race raza, String alignment,
		Clase clase, Integer level, Integer gac0, Integer hitPoints, String gender, 
		Integer ac, List<String> languages, Proficiencies proficiencies, List<Equipment> equipment,
		Habilities habilities, LocalDateTime creationDate, LocalDateTime modificationDate) {

}
