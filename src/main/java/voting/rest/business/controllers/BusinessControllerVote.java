package voting.rest.business.controllers;

import java.util.ArrayList;
import java.util.List;

import voting.rest.business.models.entities.Theme;
import voting.rest.business.models.entities.Vote;
import voting.rest.business.views.TransferTheme;
import voting.rest.data.models.daos.DaoFactory;

public class BusinessControllerVote {

    
    public List<TransferTheme> getAverages() {
        List<Theme> themes = DaoFactory.getFactory().getThemeDao().findAll();
        List<TransferTheme> themeAverageTransfer = new ArrayList<>();
        for (int i = 0; i < themes.size(); i++) {
            List<Vote> votes = DaoFactory.getFactory().getVoteDao().findByTheme(themes.get(i));
            double average = getAverage(votes);
            themeAverageTransfer.add(new TransferTheme(themes.get(i).getName(), average));
        }
        return themeAverageTransfer;
    }

    private double getAverage(List<Vote> votes) {
        double sum = 0;
        for (int i = 0; i < votes.size(); i++) {
            sum += votes.get(i).getVote();
        }
        return sum / votes.size();
    }
    
  
}
