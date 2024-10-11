package pe.upc.grupo6catchupplatform.news.application;

import pe.upc.grupo6catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.grupo6catchupplatform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import pe.upc.grupo6catchupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import pe.upc.grupo6catchupplatform.news.domain.services.FavoriteSourceQueryService;

import java.util.Optional;

public class FavorieSourceQueryServiceImpl implements FavoriteSourceQueryService {
    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query) {
        return null;
    }

    @Override
    public Optional<FavoriteSource> handle(GetAllFavoriteSourceQuery query) {
        return null;
    }
}
