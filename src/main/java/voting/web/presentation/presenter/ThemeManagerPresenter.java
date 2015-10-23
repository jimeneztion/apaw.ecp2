package voting.web.presentation.presenter;

import java.util.List;

import voting.rest.business.controllers.BusinessControllerTheme;
import voting.web.presentation.models.Model;

public class ThemeManagerPresenter {

    public List<String> process() {
        List<String> themes = new BusinessControllerTheme().getThemes();
        return themes;
    }

    public void createTheme(Model model) {
        new BusinessControllerTheme().createTheme((String) model.get("themeName"));
    }
}
