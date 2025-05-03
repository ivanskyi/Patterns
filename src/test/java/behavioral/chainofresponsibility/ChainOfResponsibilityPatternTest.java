package behavioral.chainofresponsibility;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class ChainOfResponsibilityPatternTest {

    @Test
    @DisplayName("Test that English and Ukrainian language handlers process the chain and stop further processing")
    void testEnglishAndUkrainianLanguageHandlersStopChainProcessing() {
        LanguageLearningHandler englishHandler = spy(new EnglishLanguageHandler());
        LanguageLearningHandler ukrainianHandler = spy(new UkrainianLanguageHandler());
        LanguageLearningHandler germanHandler = spy(new GermanLanguageHandler());

        englishHandler
                .setNext(ukrainianHandler);

        englishHandler.handle(List.of(Languages.ENGLISH, Languages.UKRAINIAN));

        verify(englishHandler, times(1)).handle(List.of(Languages.ENGLISH, Languages.UKRAINIAN));
        verify(ukrainianHandler, times(1)).handle(List.of(Languages.ENGLISH, Languages.UKRAINIAN));
        verify(germanHandler, never()).handle(List.of(Languages.ENGLISH, Languages.UKRAINIAN));
    }

    @Test
    @DisplayName("Test that Ukrainian language handler processes the chain and stops further processing")
    void testUkrainianLanguageHandlerStopsChainProcessing() {
        LanguageLearningHandler englishHandler = spy(new EnglishLanguageHandler());
        LanguageLearningHandler ukrainianHandler = spy(new UkrainianLanguageHandler());
        LanguageLearningHandler germanHandler = spy(new GermanLanguageHandler());

        ukrainianHandler.handle(List.of(Languages.UKRAINIAN));

        verify(ukrainianHandler, times(1)).handle(List.of(Languages.UKRAINIAN));
        verify(englishHandler, never()).handle(List.of(Languages.UKRAINIAN));
        verify(germanHandler, never()).handle(List.of(Languages.UKRAINIAN));
    }
}
