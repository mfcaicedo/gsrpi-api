package co.unicauca.gsrpi_api.system_configuration.application.port.input;

import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.FacultyResponse;

import java.util.List;

public interface GetAllFacultiesPort {
    List<FacultyResponse> getAllFaculties();
}
