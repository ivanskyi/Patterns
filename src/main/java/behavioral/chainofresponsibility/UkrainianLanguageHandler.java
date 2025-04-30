package behavioral.chainofresponsibility;

import java.util.List;

public class UkrainianLanguageHandler extends LanguageLearningHandler {

    @Override
    public void handle(List<Languages> languages) {
        if (languages.contains(Languages.UKRAINIAN)) {
            System.out.println("Successfully completed Ukrainian language study");
        }
        if (next != null) {
            next.handle(languages);
        }
    }
}
