package voting.rest.business.controllers;

import java.util.List;

import voting.rest.business.models.entities.Theme;
import voting.rest.business.models.entities.Vote;
import voting.rest.business.views.TransferVote;
import voting.rest.data.models.daos.DaoFactory;

public class BusinessControllerTheme {

    public void voteTheme(TransferVote TransferVote) {
        int id = DaoFactory.getFactory().getVoteDao().findAll().size() + 1;
        Theme t = DaoFactory.getFactory().getThemeDao().findByName(TransferVote.getThemeName());
        DaoFactory.getFactory().getVoteDao().create(new Vote(id, TransferVote.getVote(), t));
    }

    public void createTheme(String themeName) {
        int id = DaoFactory.getFactory().getThemeDao().findAll().size() + 1;
        DaoFactory.getFactory().getThemeDao().create(new Theme(id, themeName));
    }

    public List<String> getThemes() {
        return DaoFactory.getFactory().getThemeDao().findAllNames();
    }

}
