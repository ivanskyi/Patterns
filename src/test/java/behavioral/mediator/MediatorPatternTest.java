package behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorPatternTest {

    private static final String MESSAGE_TO_JAVA_DEV = "Hello Java dev";
    private static final String MESSAGE_TO_ALL = "Hello, everyone!";
    private static final String DEVELOPER_NAME = "JavaDev";
    private static final String TESTER_NAME = "QA";

    @Test
    public void shouldNotifyAllEmployees() {
        ProjectManager projectManager = new ProjectManager();

        Employee developer = new Developer(projectManager, DEVELOPER_NAME);
        Employee tester = new Tester(projectManager, TESTER_NAME);

        projectManager.addEmployee(developer);
        projectManager.addEmployee(tester);

        developer.send(MESSAGE_TO_ALL);

        assertFalse(developer.hasReceivedMessage(MESSAGE_TO_ALL));
        assertTrue(tester.hasReceivedMessage(MESSAGE_TO_ALL));

        tester.send(MESSAGE_TO_JAVA_DEV);

        assertFalse(tester.hasReceivedMessage(MESSAGE_TO_JAVA_DEV));
        assertTrue(developer.hasReceivedMessage(MESSAGE_TO_JAVA_DEV));
    }
}
