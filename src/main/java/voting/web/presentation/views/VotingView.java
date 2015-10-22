package voting.web.presentation.views;

import java.util.List;
import voting.web.presentation.models.Model;

public class VotingView implements View {

    @Override
    public void show(Model model) {
        StringBuilder sb = new StringBuilder();
        sb.append("Voting Page\n");
        sb.append("Temas: [");
        List<?> listAverages = (List<?>) model.get("votes");
        for (int i = 0; i < listAverages.size(); i++) {
            sb.append("ThemeTransfer " + listAverages.get(i));
            if (listAverages.size() > i + 1) 
                sb.append(", ");   
        }
        sb.append("]\n");
        System.out.print(sb.toString());
    }

}
