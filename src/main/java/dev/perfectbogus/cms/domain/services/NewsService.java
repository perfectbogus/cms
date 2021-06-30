package dev.perfectbogus.cms.domain.services;

import dev.perfectbogus.cms.domain.models.News;
import dev.perfectbogus.cms.domain.repositories.AbstractRepository;
import dev.perfectbogus.cms.domain.repositories.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsService extends AbstractRepository<News> {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }

    public News update(News news){
        return this.newsRepository.save(news);
    }

    public News create(News news){
        return this.newsRepository.save(news);
    }

    public void delete(String id){
        final Optional<News> news = this.newsRepository.findById(id);
        this.newsRepository.delete(news.get());
    }

    public List<News> findAll(){
        return this.newsRepository.findAll();
    }

    public News findOne(String id){
        return this.newsRepository.findById(id).get();
    }
}
