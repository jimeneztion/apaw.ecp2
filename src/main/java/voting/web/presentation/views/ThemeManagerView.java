package voting.web.presentation.views;

import java.util.List;

import voting.web.presentation.models.Model;

public class ThemeManagerView implements View {

    @Override
    public void show(Model model) {
        StringBuilder sb = new StringBuilder();
        sb.append("Theme Manager Page\n");
        sb.append("Temas: [");
        List<?> listThemes = (List<?>) model.get("themes");
        for (int i = 0; i < listThemes.size(); i++) {
            sb.append(listThemes.get(i));
            
            if (listThemes.size() > i + 1)
                sb.append(", ");
        }
        sb.append("]\n");
        System.out.print(sb.toString());
    }

}
