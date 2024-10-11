package pe.upc.grupo6catchupplatform.news.application;

import pe.upc.grupo6catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.grupo6catchupplatform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import pe.upc.grupo6catchupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.upc.grupo6catchupplatform.news.domain.services.FavoriteSourceQueryService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FavoriteSourceQueryServiceImpl implements FavoriteSourceQueryService {

    private final List<FavoriteSource> favoriteSources = new ArrayList<>();

    public FavoriteSourceQueryServiceImpl() {

        favoriteSources.add(new FavoriteSource(1L, "Source 1", "Description 1",
                "http://source1.com", "News", "EN", "US"));
        favoriteSources.add(new FavoriteSource(2L, "Source 2", "Description 2",
                "http://source2.com", "Sports", "ES", "MX"));
    }

    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query) {

        return favoriteSources.stream()
                .filter(source -> source.id.equals(query.id()))
                .findFirst();
    }

    @Override
    public List<FavoriteSource> handle(GetAllFavoriteSourceQuery query) {

        return new ArrayList<>(favoriteSources);
    }
}
