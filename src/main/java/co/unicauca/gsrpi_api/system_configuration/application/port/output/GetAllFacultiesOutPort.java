package co.unicauca.gsrpi_api.system_configuration.application.port.output;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;

import java.util.List;

public interface GetAllFacultiesOutPort {
    List<Faculty> getAllFaculties();
}
