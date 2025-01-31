package co.unicauca.gsrpi_api.applications.application.usecase;

import co.unicauca.gsrpi_api.applications.application.mapper.ApplicationsMapper;
import co.unicauca.gsrpi_api.applications.application.port.input.ApplicationManagementPort;
import co.unicauca.gsrpi_api.applications.application.port.output.ApplicationManagementOutPort;
import co.unicauca.gsrpi_api.applications.domain.model.ApplicationRecognized;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRecognizedRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.*;

public class ApplicationManagementUseCase implements ApplicationManagementPort {
    private final ApplicationManagementOutPort applicationManagementOutPort;
    private final ApplicationsMapper applicationsMapper;

    public ApplicationManagementUseCase(ApplicationManagementOutPort applicationManagementOutPort,
                                        ApplicationsMapper applicationsMapper) {
        this.applicationManagementOutPort = applicationManagementOutPort;
        this.applicationsMapper = applicationsMapper;
    }

    @Override
    public ApplicationTempResponse createApplicationTemp(ApplicationTempRequest applicationTempRequest) {
        return this.applicationsMapper.applicationTempToApplicationTempResponse(
                this.applicationManagementOutPort.createApplicationTemp(
                        this.applicationsMapper.applicationTempRequestToApplicationTemp(applicationTempRequest))
        );
    }

    @Override
    public ApplicationTempResponse updateApplicationTemp(ApplicationTempRequest applicationTempRequest) {
        return this.applicationsMapper.applicationTempToApplicationTempResponse(
                this.applicationManagementOutPort.updateApplicationTemp(
                        this.applicationsMapper.applicationTempRequestToApplicationTemp(applicationTempRequest))
        );
    }

    @Override
    public TeacherResponse getTeacherByPersonId(Long personId) {
        return this.applicationsMapper.teacherToTeacherResponse(this.applicationManagementOutPort.getTeacherByPersonId(personId));
    }

    @Override
    public ApplicationRecognizedResponse createApplicationRecognized(ApplicationRecognizedRequest applicationRecognizedRequest) {
        return this.applicationsMapper.ApplicationRecognizedToApplicationRecognizedResponse(
                this.applicationManagementOutPort.createApplicationRecognized(
                        this.applicationsMapper.applicationRecognizedRequestToApplicationRecognized(applicationRecognizedRequest))
        );
    }

    @Override
    public TypeProductionResponse getTypeProductionById(Long typeProductionId) {
        return this.applicationsMapper.typeProductionToTypeProductionResponse(
                this.applicationManagementOutPort.getTypeProductionById(typeProductionId)
        );
    }

    @Override
    public TypeProductionResponse getTypeProductionByAlias(String alias) {
        return this.applicationsMapper.typeProductionToTypeProductionResponse(
                this.applicationManagementOutPort.getTypeProductionByAlias(alias)
        );
    }

    @Override
    public ApplicationResponseCreate createApplication(ApplicationRequestCreate applicationRequestCreate) {
        return this.applicationsMapper.applicationToApplicationResponseCreate(
                this.applicationManagementOutPort.createApplication(applicationRequestCreate)
        );
    }
}
