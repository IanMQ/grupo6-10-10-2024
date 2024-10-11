package pe.upc.grupo6catchupplatform.news.domain.model.commands;

public record UpdateFavoriteSourceCommand(Long id, String name) {
    public UpdateFavoriteSourceCommand {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name is required");
        }
    }
}
