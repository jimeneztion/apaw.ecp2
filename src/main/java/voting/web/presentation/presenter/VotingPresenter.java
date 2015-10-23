package voting.web.presentation.presenter;

import java.util.ArrayList;
import java.util.List;

import voting.rest.business.controllers.BusinessControllerVote;
import voting.rest.business.views.TransferTheme;
import voting.rest.business.views.TransferVote;
import voting.web.presentation.models.Model;

public class VotingPresenter {

    public List<String> process() {
        List<TransferTheme> themeAverages = new BusinessControllerVote().getThemeAverages();
        List<String> averagesList = new ArrayList<>();
        for (int i = 0; i < themeAverages.size(); i++) {
            averagesList.add("[themeName=" + themeAverages.get(i).getThemeName() + ", average=" + themeAverages.get(i).getAverage() + "]");
        }
        return averagesList;

    }

    public void voteTheme(Model model) {
        new BusinessControllerVote().voteTheme(new TransferVote((String) model.get("themeName"), (int) model.get("vote")));

    }

}
