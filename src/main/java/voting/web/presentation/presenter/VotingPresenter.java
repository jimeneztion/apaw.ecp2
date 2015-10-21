package voting.web.presentation.presenter;

import java.util.ArrayList;
import java.util.List;

import voting.rest.business.controllers.BusinessController;
import voting.rest.business.views.TransferTheme;
import voting.web.presentation.models.Model;

public class VotingPresenter {

    public List<String> process() {
        List<TransferTheme> themeAverages = new BusinessController().getAverages();
        List<String> averagesList = new ArrayList<>();
        for (int i = 0; i < themeAverages.size(); i++) {
            averagesList.add("[themeName=" + themeAverages.get(i).getThemeName() + ", average=" + themeAverages.get(i).getAverage() + "]");
        }
        return averagesList;

    }
    

   
}
