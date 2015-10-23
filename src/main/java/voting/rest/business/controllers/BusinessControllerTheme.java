package voting.rest.business.controllers;

import java.util.List;

import voting.rest.business.models.entities.Theme;
import voting.rest.data.models.daos.DaoFactory;

public class BusinessControllerTheme {

    public void createTheme(String themeName) {
        int id = DaoFactory.getFactory().getThemeDao().findAll().size() + 1;
        DaoFactory.getFactory().getThemeDao().create(new Theme(id, themeName));
    }

    public List<String> getThemes() {
        return DaoFactory.getFactory().getThemeDao().findAllNames();
    }

}
