package comparator_music_collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Track> track = Arrays.asList(
                new Track("Without me", "Eminem", 290),
                new Track("Borderline", "Tame Impala", 237),
                new Track("Starboy", "The Weekend", 230));

        Comparator<Track> durationComparator = new DurationComparator();
        track.sort(durationComparator);

        Comparator<Track> titleComparator = new TitleComparator();
        track.sort(titleComparator);

        Comparator<Track> artistComparator = new ArtistComparator();
        track.sort(artistComparator);
    }
}
