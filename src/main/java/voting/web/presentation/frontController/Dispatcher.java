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
            model.put("Votos", votingPresenter.process());
            break;
        case "ThemeManagerPresenter":
            ThemeManagerPresenter themeManagerPresenter = new ThemeManagerPresenter();
            // Injectar parámetros mediante helper2Presenter.setters()
            model.put("Themas", votingPresenter.process());
            break;

        }
        this.show(nextView, model);
    }

    public void doPost(HttpRequest request, HttpResponse response) {
        Model model = new Model();
        String presenter = request.getPath() + "Presenter";
        String action = request.getParams().get("action");
        String nextView = request.getPath() + "View";

        switch (presenter) {

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
