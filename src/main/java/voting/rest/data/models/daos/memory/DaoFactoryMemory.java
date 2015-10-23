package voting.rest.data.models.daos.memory;

import voting.rest.data.models.daos.DaoFactory;
import voting.rest.data.models.daos.ThemeDao;
import voting.rest.data.models.daos.VoteDao;

public class DaoFactoryMemory extends DaoFactory {

    private ThemeDao themeDao = null;
    private VoteDao voteDao = null;

    public ThemeDao getThemeDao() {
        if (themeDao == null) 
            themeDao = new ThemeMemoryDao();
        return themeDao;
    }

    public VoteDao getVoteDao() {
        if (voteDao == null) 
            voteDao = new VoteMemoryDao();
        return voteDao;
    }

}
