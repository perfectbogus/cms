package dev.perfectbogus.cms.domain.requests;

import dev.perfectbogus.cms.domain.models.Role;
import lombok.Data;

@Data
public class UserRequest {

    String identity;

    String name;

    Role role;

}
