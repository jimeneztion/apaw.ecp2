package voting.rest.business.controllers;

import java.util.List;

import voting.rest.business.views.TransferObject1;
import voting.rest.business.views.TransferObject2;
import voting.rest.data.models.daos.DaoFactory;
import voting.web.presentation.presenter.ThemeAverageTransfer;

public class BusinessController {


    public List<ThemeAverageTransfer> getAverages() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public TransferObject1 m1() {
        DaoFactory.getFactory().getEntity1Dao().findAll();
        return new TransferObject1();
    }
}
