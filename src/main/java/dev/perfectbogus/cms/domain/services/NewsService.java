package dev.perfectbogus.cms.domain.services;

import dev.perfectbogus.cms.domain.models.News;
import dev.perfectbogus.cms.domain.repositories.AbstractRepository;
import dev.perfectbogus.cms.domain.repositories.NewsRepository;
import org.springframework.stereotype.Service;

@Service
public class NewsService extends AbstractRepository<News> {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }



}
