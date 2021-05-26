package dev.perfectbogus.cms.domain.models;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "category")
public class Category {

    @Id
    String id;

    String name;

}
