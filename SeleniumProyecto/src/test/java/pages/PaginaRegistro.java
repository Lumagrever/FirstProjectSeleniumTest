package pages;

import java.util.List;

public class PaginaRegistro extends BasePage {

    private String planDropdown;

    public PaginaRegistro(){
        super(driver);
    }

    public List<String> returnPlanDropdownValues(){
        return getDropdwnValues(planDropdown);
    }
    
}
