package org.jacobo.adyd.ficha.model.mongodb;

import lombok.*;
import org.jacobo.adyd.ficha.model.common.Proficiencies;
import org.jacobo.adyd.ficha.model.firebase.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "charactersheet")
public class CharacterSheet extends MongoBaseClass {

        private String name;
        @Indexed
        private String playerName;
        @Indexed(unique = false)
        private String playerEmail;
        private Race raza;
        private String alignment;
        private Clase clase;
        private Integer level;
        private Integer gac0;
        private Integer hitPoints;
        private Gender gender;
        private Integer ac;
        private List<String> languages;
        private Proficiencies proficiencies;
        private List<Equipment> equipment;
        private Habilities habilities;


}
