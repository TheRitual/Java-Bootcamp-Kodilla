package com.kodilla.good.patterns.challenges;
import java.util.List;
import java.util.Map;

public class ModuleRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> ms = movieStore.getMovies();
        ms.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .forEach(l -> System.out.print(l + "!"));
        System.out.println("\n DONE! \n");
    }
}
