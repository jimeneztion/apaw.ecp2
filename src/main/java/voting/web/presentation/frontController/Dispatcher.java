package voting.web.presentation.frontController;

import voting.web.presentation.models.Model;
import voting.web.presentation.presenter.ThemeManagerPresenter;
import voting.web.presentation.presenter.VotingPresenter;
import voting.web.presentation.views.ErrorView;
import voting.web.presentation.views.ThemeManagerView;
import voting.web.presentation.views.View;
import voting.web.presentation.views.VotingView;
import web.http.HttpRequest;
import web.http.HttpResponse;

public class Dispatcher {

    public void doGet(HttpRequest request, HttpResponse response) {
        Model model = new Model();
        String presenter = request.getPath() + "Presenter";
        String nextView = request.getPath() + "View";

        switch (presenter) {
        case "VotingPresenter":
            VotingPresenter votingPresenter = new VotingPresenter();
            model.put("votes", votingPresenter.process());
            break;
        case "ThemeManagerPresenter":
            ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
            model.put("themes", themeManagerPresenter.process());
            break;
        }
        this.show(nextView, model);
    }

    public void doPost(HttpRequest request, HttpResponse response) {

        String controller = request.getPath() + "Presenter";
        String action = request.getParams().get("action");
        String themeName = request.getParams().get("themeName");
        String nextView = request.getPath() + "View";
        Model model = new Model();

        switch (controller) {
        case "VotingPresenter":
            String vote = request.getParams().get("value");
            int voteValue = Integer.parseInt(vote);

            if ("voteTheme".equalsIgnoreCase(action)) {
                VotingPresenter votingPresenter = new VotingPresenter();
                model.put("themeName", themeName);
                model.put("vote", voteValue);
                votingPresenter.voteTheme(model);
                model.put("votes", votingPresenter.process());
            } else
                model.put("error", "Acción no permitida: " + action);

            break;

        case "ThemeManagerPresenter":
            model.put("themeName", themeName);

            if ("createTheme".equalsIgnoreCase(action)) {
                ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
                themeManagerPresenter.createTheme(model);
                model.put("themes", themeManagerPresenter.process());

            } else
                model.put("error", "Acción no permitida: " + action);

            break;
        }
        this.show(nextView, model);
    }

    private void show(String nextView, Model model) {
        View view;
        switch (nextView) {
        case "VotingView":
            view = new VotingView();
            break;
        case "ThemeManagerView":
            view = new ThemeManagerView();
            break;
        default:
            view = new ErrorView();
            model.put("error", "Vista no encontrada: " + nextView);
        }
        view.show(model);
    }

}
