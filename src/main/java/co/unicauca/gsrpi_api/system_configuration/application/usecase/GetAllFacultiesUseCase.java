package co.unicauca.gsrpi_api.system_configuration.application.usecase;

import co.unicauca.gsrpi_api.system_configuration.application.mapper.SystemConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.application.port.input.GetAllFacultiesPort;
import co.unicauca.gsrpi_api.system_configuration.application.port.output.GetAllFacultiesOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.dto.response.FacultyResponse;

import java.util.List;

public class GetAllFacultiesUseCase implements GetAllFacultiesPort {

    private final GetAllFacultiesOutPort getAllFacultiesOutPort;
    private final SystemConfigurationMapper mapper;

    public GetAllFacultiesUseCase(GetAllFacultiesOutPort getAllFacultiesOutPort,
                                  SystemConfigurationMapper mapper) {
        this.getAllFacultiesOutPort = getAllFacultiesOutPort;
        this.mapper = mapper;
    }

    @Override
    public List<FacultyResponse> getAllFaculties() {
        return this.mapper.facultyListToFacultyResponseList(this.getAllFacultiesOutPort.getAllFaculties());
    }
}
