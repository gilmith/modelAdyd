package org.jacobo.adyd.ficha.model.firebase;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.cloud.Timestamp;

import lombok.*;
import org.jacobo.adyd.ficha.model.common.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class DataSheet extends FireBaseClass {
	
	private String name;
	private String playerName;
	private String playerEmail;
	private Race raza;
	private String alignment;
	private Clase clase;
	private Integer level; 
	private Integer gac0; 
	private Integer hitPoints; 
	private String gender; 
	private Integer ac;
	private List<String> languages;
	private Proficiencies proficiencies;
	@JsonIgnore
	private List<Equipment> equipment;
	private Habilities habilities;
	@JsonIgnore
	private Timestamp creationDate;
	@JsonIgnore
	private Timestamp modificationDate;

}
