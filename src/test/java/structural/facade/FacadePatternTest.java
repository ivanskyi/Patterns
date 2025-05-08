package structural.facade;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FacadePatternTest {

    @Test
    @DisplayName("Should execute all facade methods")
    public void shouldExecuteAllFacadeMethods() {
        MaintenanceService maintenanceServiceMock = mock(MaintenanceService.class);
        CleaningService cleaningServiceMock = mock(CleaningService.class);
        LaundryService laundryServiceMock = mock(LaundryService.class);

        HousekeepingFacade housekeepingFacade = new HousekeepingFacade(
                maintenanceServiceMock,
                cleaningServiceMock,
                laundryServiceMock
        );

        housekeepingFacade.startWorkDay();

        verify(maintenanceServiceMock, times(1)).performMaintenance();
        verify(cleaningServiceMock, times(1)).performCleaning();
        verify(laundryServiceMock, times(1)).performLaundry();
    }
}
