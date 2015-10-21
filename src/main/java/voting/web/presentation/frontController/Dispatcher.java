package voting.web.presentation.frontController;

import voting.init.Model;
import voting.web.presentation.views.View;
import web.http.HttpRequest;
import web.http.HttpResponse;

public class Dispatcher {

    public void doGet(HttpRequest request, HttpResponse response) {
        Model model = new Model();
        String presenter = request.getPath() + "Presenter";
        String nextView = request.getPath() + "View";

        switch (presenter) {
       
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
        View view = null;
        switch (nextView) {
        
        }
        view.show(model);
    }

}
