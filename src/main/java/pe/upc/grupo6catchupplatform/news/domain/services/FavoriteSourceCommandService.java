package pe.upc.grupo6catchupplatform.news.domain.services;

import pe.upc.grupo6catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.grupo6catchupplatform.news.domain.model.commands.CreateFavoriteSourceCommand;
import pe.upc.grupo6catchupplatform.news.domain.model.commands.UpdateFavoriteSourceCommand;

import java.util.Optional;

public interface FavoriteSourceCommandService {
    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
    Optional<FavoriteSource> handle(UpdateFavoriteSourceCommand command);
}
