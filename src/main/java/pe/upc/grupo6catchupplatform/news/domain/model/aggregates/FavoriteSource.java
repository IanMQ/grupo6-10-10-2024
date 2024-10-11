package pe.upc.grupo6catchupplatform.news.domain.model.aggregates;

import org.springframework.data.domain.AbstractAggregateRoot;

public class FavoriteSource extends AbstractAggregateRoot<FavoriteSource> {

    public Long id;
    public String name;
    public String description;
    public String url;
    public String category;
    public String language;
    public String country;

}
