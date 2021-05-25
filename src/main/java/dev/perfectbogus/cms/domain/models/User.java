package dev.perfectbogus.cms.domain.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "system_user")
public class User {
    @Id
    @GeneratedValue(generator = "system-uiid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    String id;

    String identity;

    String name;

    Role role;
}
