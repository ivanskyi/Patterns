package behavioral.chainofresponsibility;

import java.util.List;

public class EnglishLanguageHandler extends LanguageLearningHandler {

    @Override
    public void handle(List<Languages> languages) {
        if (languages.contains(Languages.ENGLISH)) {
            System.out.println("Successfully completed English language study");
        }
        if (next != null) {
            next.handle(languages);
        }
    }
}
