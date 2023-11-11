package com.bank.bank2mjee.Services;

import com.bank.bank2mjee.Dao.AgenceDao;
import com.bank.bank2mjee.Dao.ClientDao;
import com.bank.bank2mjee.Dao.DemandeDeCreditDao;
import com.bank.bank2mjee.Entities.Agence;
import com.bank.bank2mjee.Entities.Client;
import com.bank.bank2mjee.Entities.DemandeDeCredit;
import com.bank.bank2mjee.Enums.CreditEtat;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Optional;

public class SimulationService {

    ClientDao clientDao;
    AgenceDao agenceDao;
    DemandeDeCreditDao demandeDeCreditDao;

    public SimulationService(DemandeDeCreditDao demandeDeCreditDao) {
        this.demandeDeCreditDao = demandeDeCreditDao;
    }

    public double createSimulation(Double capitale, int nombremensualite) throws Exception {
        if (capitale < 5000 || capitale > 600000) {
            throw new Exception("La capital doit etre entre 5000 et 600000");
        }
        if (nombremensualite < 12 || nombremensualite > 120 ) {
            throw new Exception("Le nombre de mensualite doit etre entre 12 et 60");
        }
        double tauxMensuel = DemandeDeCredit.TAUX / 12;
        double result = (capitale * tauxMensuel * Math.pow(1 + tauxMensuel, nombremensualite))
                / (Math.pow(1 + tauxMensuel, nombremensualite) - 1);

        DecimalFormat decimalFormat = new DecimalFormat("#.#");

        String formattedResult = decimalFormat.format(result);

        double roundedResult = Double.parseDouble(formattedResult);

        return roundedResult;
    }


    public SimulationService(ClientDao clientDao,DemandeDeCreditDao demandeDeCreditDao) {
        this.clientDao = clientDao;
        this.demandeDeCreditDao = demandeDeCreditDao;
    }
    public SimulationService() {
    }
    public Optional<DemandeDeCredit> addDemande(DemandeDeCredit demandeDeCredit){
        return demandeDeCreditDao.save(demandeDeCredit);
    }








    public List<DemandeDeCredit> findAll(String filter) {
        if (filter == null) {
        return demandeDeCreditDao.findAll();
        } else {
            return demandeDeCreditDao.findAll(filter);
        }
    }

    public Optional<DemandeDeCredit> updateEtat(DemandeDeCredit demandeDeCredit) {
        return demandeDeCreditDao.update(demandeDeCredit);
    }
}
