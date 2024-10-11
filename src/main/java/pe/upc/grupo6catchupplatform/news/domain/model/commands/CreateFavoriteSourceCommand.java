package pe.upc.grupo6catchupplatform.news.domain.model.commands;

public record CreateFavoriteSourceCommand(Long id) {

    public CreateFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
    }
}
