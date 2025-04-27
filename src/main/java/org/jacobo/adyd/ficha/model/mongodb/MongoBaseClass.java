package org.jacobo.adyd.ficha.model.mongodb;

import com.google.cloud.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MongoBaseClass {
    @Id
    private String id;
    private Timestamp creationDate;
    private Timestamp modificationDate;
}
