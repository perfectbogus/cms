package dev.perfectbogus.cms.domain.resources;

import dev.perfectbogus.cms.domain.models.News;
import dev.perfectbogus.cms.domain.models.Review;
import dev.perfectbogus.cms.domain.models.User;
import dev.perfectbogus.cms.domain.requests.NewsRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsResource {

    @GetMapping("/{id}")
    public ResponseEntity<News> findOne(@PathVariable("id") String id){
        return ResponseEntity.ok(new News());
    }

    @GetMapping
    public ResponseEntity<List<News>> findAll(){
        return ResponseEntity.ok(Arrays.asList(new News(), new News()));
    }

    @PostMapping
    public ResponseEntity<News> createNews(){
        return ResponseEntity.ok(new News());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeNews(@PathVariable("id") String id){

    }

    @PutMapping("/{id}")
    public ResponseEntity<News> updateNews(@PathVariable("id") String id, NewsRequest request){
        return ResponseEntity.ok(new News());
    }

    @GetMapping("/{newsId}/review/{userId}")
    public ResponseEntity<Review> review(@PathVariable("newsId") String newsId, @PathVariable("userId") String userId){
        return ResponseEntity.ok(new Review());
    }

    @GetMapping("/revised")
    public ResponseEntity<List<News>> revisedNews(){
        return ResponseEntity.ok(Arrays.asList(new News(), new News()));
    }

}
