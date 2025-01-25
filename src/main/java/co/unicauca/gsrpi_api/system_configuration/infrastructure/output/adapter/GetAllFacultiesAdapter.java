package co.unicauca.gsrpi_api.system_configuration.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.system_configuration.application.port.output.GetAllFacultiesOutPort;
import co.unicauca.gsrpi_api.system_configuration.domain.model.Faculty;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.FacultyEntity;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.mapper.MapStructConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository.FacultyRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetAllFacultiesAdapter implements GetAllFacultiesOutPort {

    private final FacultyRepository facultyRepository;
    private final MapStructConfigurationMapper mapStructConfigurationMapper;

    public GetAllFacultiesAdapter(
            FacultyRepository facultyRepository,
            MapStructConfigurationMapper mapStructConfigurationMapper
    ) {
        this.facultyRepository = facultyRepository;
        this.mapStructConfigurationMapper = mapStructConfigurationMapper;
    }

    @Override
    public List<Faculty> getAllFaculties() {
        List<FacultyEntity> facultiesList = this.facultyRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
        return this.mapStructConfigurationMapper.facultyEntityListToFacultyList(facultiesList);
    }
}
