package bank2mjee.Services;
import com.bank.bank2mjee.Dao.DemandeDeCreditDao;
import com.bank.bank2mjee.Dao.Impl.DemandeDeCreditDaoImpl;
import com.bank.bank2mjee.Entities.Agence;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Entities.DemandeDeCredit;
import com.bank.bank2mjee.Enums.CreditEtat;
import com.bank.bank2mjee.Services.ClientService;
import com.bank.bank2mjee.Services.SimulationService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.mockito.Mockito.*;

public class CreditServicesTest {
    static DemandeDeCreditDao demandeDeCreditDao;

    static SimulationService simulationService;
    static ClientService clientService;
    static DemandeDeCredit demandeDeCredit;

    @BeforeAll
    public static void setUp() {
        demandeDeCreditDao = mock(DemandeDeCreditDaoImpl.class);
        simulationService = new SimulationService(demandeDeCreditDao);
        demandeDeCredit = new DemandeDeCredit(99L, new Client("KJSDYTEZ67Z"), new Agence("WXCHGF546999"), LocalDate.now(), null, 5000.0, 12, "GOOD ONE", CreditEtat.EN_ATTENTE);
    }

    @Test
    public void saveTest() {
        when(simulationService.addDemande(demandeDeCredit)).thenReturn(Optional.ofNullable(demandeDeCredit));
        Optional<DemandeDeCredit> demandeDeCredit1 = simulationService.addDemande(demandeDeCredit);
        assertSame(demandeDeCredit, demandeDeCredit1.get());
        verify(demandeDeCreditDao).save(demandeDeCredit);
    }



    @Test
    public void findAllTest() {
        List<DemandeDeCredit> demandeDeCreditArrayList = new ArrayList<>();
        demandeDeCreditArrayList.add(new DemandeDeCredit());
        demandeDeCreditArrayList.add(new DemandeDeCredit());
        demandeDeCreditArrayList.add(new DemandeDeCredit());
        when(simulationService.findAll("date")).thenReturn(demandeDeCreditArrayList);
        List<DemandeDeCredit> demandeDeCreditArrayList1 = simulationService.findAll("date");
        assertSame(demandeDeCreditArrayList.size(), demandeDeCreditArrayList1.size());
        verify(demandeDeCreditDao).findAll("date");
    }


    @Test
    public void findAllTestWithoutFilter() {
        List<DemandeDeCredit> demandeDeCreditArrayList = new ArrayList<>();
        demandeDeCreditArrayList.add(new DemandeDeCredit());
        demandeDeCreditArrayList.add(new DemandeDeCredit());
        demandeDeCreditArrayList.add(new DemandeDeCredit());
        when(simulationService.findAll(null)).thenReturn(demandeDeCreditArrayList);
        List<DemandeDeCredit> demandeDeCreditArrayList1 = simulationService.findAll(null);
        assertSame(demandeDeCreditArrayList.size(), demandeDeCreditArrayList1.size());
        verify(demandeDeCreditDao).findAll();
    }


    @Test
    public void updateEtatTest() {
        demandeDeCredit.setCreditEtat(CreditEtat.APPROUVE);
        when(simulationService.updateEtat(demandeDeCredit)).thenReturn(Optional.ofNullable(demandeDeCredit));
        Optional<DemandeDeCredit> demandeDeCredit1 = simulationService.updateEtat(demandeDeCredit);
        assertSame(demandeDeCredit, demandeDeCredit1.get());
        verify(demandeDeCreditDao).update(demandeDeCredit);
    }

}
