package voting.rest.data.models.daos.memory;

import voting.rest.data.models.daos.DaoFactory;
import voting.rest.data.models.daos.ThemeDao;
import voting.rest.data.models.daos.VoteDao;

public class DaoFactoryMemory extends DaoFactory {

    private ThemeDao themeDao;

    private VoteDao voteDao;

    public DaoFactoryMemory() {
    }

    

    @Override
    public ThemeDao getThemeDao() {
        if (themeDao == null) {
            themeDao = new ThemeDao();
        }
        return themeDao;
    }

    @Override
    public VoteDao getVoteDao() {
        if (voteDao == null) {
            voteDao = new VoteDao();
        }
        return voteDao;
    }

}
