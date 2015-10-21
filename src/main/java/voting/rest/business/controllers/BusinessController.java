package voting.rest.business.controllers;

import java.util.List;

import voting.rest.business.views.TransferTheme;
import voting.rest.business.views.TransferVote;
import voting.rest.data.models.daos.DaoFactory;
import voting.web.presentation.presenter.ThemeAverageTransfer;

public class BusinessController {


    public List<ThemeAverageTransfer> getAverages() {
        // TODO Auto-generated method stub
        return null;
    }

    
    public TransferTheme m1() {
        DaoFactory.getFactory().getEntity1Dao().findAll();
        return new TransferTheme();
    }
}
