package anime.api;

import anime.api.domain.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MockAnimes {

    public static final List<Anime> animes;

    static {
        animes = new ArrayList<>(List.of(
                new Anime(UUID.randomUUID().toString(), "Naruto"),
                new Anime(UUID.randomUUID().toString(), "Jujutsu"),
                new Anime(UUID.randomUUID().toString(), "Demon slayer"),
                new Anime(UUID.randomUUID().toString(), "boku no hero")
        ));
    }


}
