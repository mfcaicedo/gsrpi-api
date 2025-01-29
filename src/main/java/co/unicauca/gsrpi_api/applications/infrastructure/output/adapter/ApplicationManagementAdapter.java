package co.unicauca.gsrpi_api.applications.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.applications.application.port.output.ApplicationManagementOutPort;
import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;
import co.unicauca.gsrpi_api.applications.domain.model.Teacher;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationTempEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TeacherEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.mapper.MapStructApplicationsMapper;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.ApplicationTempRepository;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationManagementAdapter implements ApplicationManagementOutPort {
    private final ApplicationTempRepository applicationTempRepository;
    private final TeacherRepository teacherRepository;
    private final MapStructApplicationsMapper mapStructApplicationsMapper;

    public ApplicationManagementAdapter(ApplicationTempRepository applicationTempRepository,
                                        TeacherRepository teacherRepository,
                                        MapStructApplicationsMapper mapStructApplicationsMapper) {
        this.applicationTempRepository = applicationTempRepository;
        this.teacherRepository = teacherRepository;
        this.mapStructApplicationsMapper = mapStructApplicationsMapper;
    }

    @Override
    public ApplicationTemp createApplicationTemp(ApplicationTemp applicationTemp) {
        ApplicationTempEntity applicationTempEntity = this.mapStructApplicationsMapper.applicationTempToApplicationTempEntity(applicationTemp);
        return this.mapStructApplicationsMapper.applicationTempEntityToApplicationTemp(
                this.applicationTempRepository.save(applicationTempEntity)
        );
    }

    @Override
    public ApplicationTemp updateApplicationTemp(ApplicationTemp applicationTemp) {
        //Todo: Veririfco si el id de la solicitud temporal existe
        if (this.applicationTempRepository.existsById(applicationTemp.getApplicationTempId())) {
            return this.mapStructApplicationsMapper.applicationTempEntityToApplicationTemp(
                    this.applicationTempRepository.save(
                            this.mapStructApplicationsMapper.applicationTempToApplicationTempEntity(applicationTemp))
            );
        }
        return null;
    }

    @Override
    @Transactional
    public Teacher getTeacherByPersonId(Long personId) {
        TeacherEntity teacherEntity = this.teacherRepository.findByPerson_PersonId(personId);
        return this.mapStructApplicationsMapper.teacherEntityToTeacher(this.teacherRepository.findByPerson_PersonId(personId));
    }
}
