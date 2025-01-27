package co.unicauca.gsrpi_api.applications.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.applications.application.port.output.ApplicationManagementOutPort;
import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationTempEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.mapper.MapStructApplicationsMapper;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.ApplicationTempRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationManagementAdapter implements ApplicationManagementOutPort {
    private final ApplicationTempRepository applicationTempRepository;
    private final MapStructApplicationsMapper mapStructApplicationsMapper;

    public ApplicationManagementAdapter(ApplicationTempRepository applicationTempRepository,
                                        MapStructApplicationsMapper mapStructApplicationsMapper) {
        this.applicationTempRepository = applicationTempRepository;
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
}
