package co.unicauca.gsrpi_api.applications.domain.model.dto.response;

import co.unicauca.gsrpi_api.auth.domain.model.User;

public class PersonResponseGetTeacherById {
    private Long personId;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private Long identificationTypeCatId;
    private Long identificationNumber;
    private String email;
    //Relacion debil con la tabla configuracion
    private Long configurationId;
}
