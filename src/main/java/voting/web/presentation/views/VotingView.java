package voting.web.presentation.views;

import java.util.List;
import voting.web.presentation.models.Model;

public class VotingView implements View {

    @Override
    public void show(Model model) {
        StringBuilder sb = new StringBuilder();
        sb.append("Voting Page");
        List<String> listVotes = (List<String>) model.get("votes");
        for (int i = 0; i < listVotes.size(); i++) {
            sb.append("ThemeTransfer " + listVotes.get(i));
        }
        sb.append(" ] \n");
        sb.toString();
    }

    

}
