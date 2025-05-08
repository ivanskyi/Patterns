package structural.facade;

public class HousekeepingFacade {
    private MaintenanceService maintenanceService;
    private CleaningService cleaningService;
    private LaundryService laundryService;

    private HousekeepingFacade() {
    }

    public HousekeepingFacade(MaintenanceService maintenanceService,
                              CleaningService cleaningService,
                              LaundryService laundryService) {
        this.maintenanceService = maintenanceService;
        this.cleaningService = cleaningService;
        this.laundryService = laundryService;
    }

    public void startWorkDay() {
        maintenanceService.performMaintenance();
        cleaningService.performCleaning();
        laundryService.performLaundry();
    }
}
