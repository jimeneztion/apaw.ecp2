package voting.web.presentation.presenter;

import java.util.ArrayList;
import java.util.List;

import voting.init.Model;
import voting.rest.business.controllers.BusinessController;

public class VotingPresenter {

    public List<String> process(Model model) {
        List<ThemeAverageTransfer> themeAverages = new BusinessController().getAverages();
        List<String> averagesList = new ArrayList<>();
        for (int i = 0; i < themeAverages.size(); i++) {
            averagesList.add("[themeName=" + themeAverages.get(i).getThemeName() + ", average=" + themeAverages.get(i).getAverage() + "]");
        }
        return averagesList;

    }
    

   
}
