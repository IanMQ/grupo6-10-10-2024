package pe.upc.grupo6catchupplatform.news.domain.services;

import pe.upc.grupo6catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.grupo6catchupplatform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import pe.upc.grupo6catchupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {
    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    List<FavoriteSource> handle(GetAllFavoriteSourceQuery query);
}
