package dev.perfectbogus.cms.domain.models;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document(collection = "news")
public class News {

    @Id
    String id;

    String title;

    String content;

    User author;

    Set<User> mandatoryReviewers;

    Set<Review> reviewers;

    Set<Category> categories;

    Set<Tag> tags;

    public Review review(String userId, String status){
        final Review review = new Review(userId, status);
        this.reviewers.add(review);
        return review;
    }

    public boolean revised(){
        return this.mandatoryReviewers.stream().allMatch(
                reviewer -> this.reviewers.stream().anyMatch(
                   review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)
                )
        );
    }
}
