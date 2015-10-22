package voting.web.presentation.views;

import voting.web.presentation.models.Model;

public class ErrorView implements View {

    @Override
    public void show(Model model) {
        StringBuilder sb = new StringBuilder();
        sb.append("ErrorView \n  error: "+ model.get("error"));
        System.out.print(sb.toString());
        
    }

}
