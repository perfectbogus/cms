package dev.perfectbogus.cms.domain.requests;

import dev.perfectbogus.cms.domain.models.Category;
import dev.perfectbogus.cms.domain.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
