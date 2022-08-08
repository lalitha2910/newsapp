package in.velocity.newsapiservice.services;

import java.util.List;

import in.velocity.newsapiservice.dto.news;

public interface NewsService {
    List<news> findnews(String newsName);

    news findNewsById(String Id);

}
