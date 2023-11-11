package bank2mjee.Services;

import com.bank.bank2mjee.Services.SimulationService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SimulationServiceTest {
    static SimulationService simulationService;

    @BeforeAll
    static void setUp() {
        simulationService = new SimulationService();
    }

    @Test
    public void createSimulation() throws Exception {
        Double capitale = 5000.0;
        int nombremensualite = 14;
        assertEquals(384.5, simulationService.createSimulation(capitale, nombremensualite));
    }
    // test exception
    @Test
    public void createSimulationExceptionCapital1() throws Exception {
        Double capitale = 600009.0;
        int nombremensualite = 14;
        Exception exception = assertThrows(Exception.class, () -> {
            simulationService.createSimulation(capitale, nombremensualite);
        });
        assertEquals("La capital doit etre entre 5000 et 600000", exception.getMessage());
    }
    @Test
    public void createSimulationExceptionCapital2() throws Exception {
        Double capitale = 4000.0;
        int nombremensualite = 14;
        Exception exception = assertThrows(Exception.class, () -> {
            simulationService.createSimulation(capitale, nombremensualite);
        });
        assertEquals("La capital doit etre entre 5000 et 600000", exception.getMessage());
    }
    @Test
    public void createSimulationExceptionDuree1() throws Exception {
        Double capitale = 5000.0;
        int nombremensualite = 6;
        Exception exception = assertThrows(Exception.class, () -> {
            simulationService.createSimulation(capitale, nombremensualite);
        });
        assertEquals("Le nombre de mensualite doit etre entre 12 et 60", exception.getMessage());
    }
    @Test
    public void createSimulationExceptionDuree2() throws Exception {
        Double capitale = 5000.0;
        int nombremensualite = 999;
        Exception exception = assertThrows(Exception.class, () -> {
            simulationService.createSimulation(capitale, nombremensualite);
        });
        assertEquals("Le nombre de mensualite doit etre entre 12 et 60", exception.getMessage());
    }

}
