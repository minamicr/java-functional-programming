import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ProgrammingLanguageFilter {

  public static void main(String[] args) {
    ProgrammingLanguage language1 = new ProgrammingLanguage("java", 345, false, true);
    ProgrammingLanguage language2 = new ProgrammingLanguage("python", 241, true, true);
    ProgrammingLanguage language3 = new ProgrammingLanguage("javascript", 340, true, true);
    ProgrammingLanguage language4 = new ProgrammingLanguage("angular", 201, false, true);
    ProgrammingLanguage language5 = new ProgrammingLanguage("react", 56, false, false);

    List<ProgrammingLanguage> languages =
        Arrays.asList(language1, language2, language3, language4, language5);

    Predicate<ProgrammingLanguage> isPopular = x -> x.isPopular;
    Predicate<ProgrammingLanguage> isEasy = x -> !x.isEasy;
    Predicate<ProgrammingLanguage> isTopRated = x -> x.amount > 300;

    languages.stream()
        .filter(isTopRated)
        .filter(isPopular)
        .filter(isEasy)
        .forEach(System.out::println);

  }

}
