package pe.upc.grupo6catchupplatform.news.domain.model.aggregates;

import org.springframework.data.domain.AbstractAggregateRoot;

public class FavoriteSource {
    public Long id;
    public String name;
    public String description;
    public String url;
    public String category;
    public String language;
    public String country;

    public FavoriteSource(Long id, String name, String description, String url,
                          String category, String language, String country) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.category = category;
        this.language = language;
        this.country = country;
    }
}

