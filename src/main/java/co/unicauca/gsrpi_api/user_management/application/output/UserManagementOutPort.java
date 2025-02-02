package co.unicauca.gsrpi_api.user_management.application.output;

import co.unicauca.gsrpi_api.auth.domain.model.User;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;

public interface UserManagementOutPort {
    Person savePerson(Person person);
    User getUserById(long userId);
    User getPersonByUid(String uid);
    Person getPersonByUserId(long userId);

}
