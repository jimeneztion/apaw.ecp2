package voting.rest.data.models.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import voting.rest.business.models.entities.Theme;
import voting.rest.data.models.daos.ThemeDao;

public class ThemeMemoryDao extends GenericMemoryDao<Theme, Integer> implements ThemeDao {

    public ThemeMemoryDao() {
        this.setMap(new HashMap<Integer, Theme>());
    }

    protected Integer getId(Theme entity) {
        return entity.getId();
    }

    public Theme findByName(String themeName) {
        for (Theme theme : this.findAll())
            if (themeName.equals(theme.getName()))
                return theme;

        return null;
    }

    public List<String> findAllNames() {
        List<String> nameList = new ArrayList<>();
        for (Theme theme : this.findAll()) 
            nameList.add(theme.getName());
        
        return nameList;
    }

}
