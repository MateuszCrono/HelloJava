package challenges;

import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();


        Map<String, List<String>> streamedListResult = movieStore.getMovies();

        streamedListResult.entrySet()
                .stream()
                .forEach(each -> System.out.print(each.getValue() + " ! "));

    }
}

