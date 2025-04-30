package behavioral.chainofresponsibility;

import java.util.List;

public class GermanLanguageHandler extends LanguageLearningHandler {

    @Override
    public void handle(List<Languages> languages) {
        if (languages.contains(Languages.GERMAN)) {
            System.out.println("Successfully completed German language study");
        }
        if (next != null) {
            next.handle(languages);
        }
    }
}
