package co.unicauca.gsrpi_api.applications.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.applications.application.port.output.ApplicationManagementOutPort;
import co.unicauca.gsrpi_api.applications.domain.model.*;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationRequestCreate;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.*;
import co.unicauca.gsrpi_api.applications.infrastructure.output.mapper.MapStructApplicationsMapper;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.*;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.entity.DepartmentEntity;
import co.unicauca.gsrpi_api.system_configuration.infrastructure.output.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
public class ApplicationManagementAdapter implements ApplicationManagementOutPort {
    private final ApplicationTempRepository applicationTempRepository;
    private final TeacherRepository teacherRepository;
    private final ApplicationRecognizedRepository applicationRecognizedRepository;
    private final TypeProductionRepository typeProductionRepository;
    private final ApplicationRepository applicationRepository;
    private final StatusApplicationRepository statusApplicationRepository;
    private final DepartmentRepository departmentRepository;
    private final MapStructApplicationsMapper mapStructApplicationsMapper;

    public ApplicationManagementAdapter(ApplicationTempRepository applicationTempRepository,
                                        TeacherRepository teacherRepository,
                                        ApplicationRecognizedRepository applicationRecognizedRepository,
                                        TypeProductionRepository typeProductionRepository,
                                        ApplicationRepository applicationRepository,
                                        StatusApplicationRepository statusApplicationRepository,
                                        DepartmentRepository departmentRepository,
                                        MapStructApplicationsMapper mapStructApplicationsMapper) {
        this.applicationTempRepository = applicationTempRepository;
        this.teacherRepository = teacherRepository;
        this.applicationRecognizedRepository = applicationRecognizedRepository;
        this.typeProductionRepository = typeProductionRepository;
        this.applicationRepository = applicationRepository;
        this.statusApplicationRepository = statusApplicationRepository;
        this.departmentRepository = departmentRepository;
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
            //Consulto la solicitud temporal y solo los valores que vengan diferentes de null de aplicationTemp
            //los actualizo
            ApplicationTempEntity applicationTempEntity = this.applicationTempRepository.findById(applicationTemp.getApplicationTempId()).orElse(null);
            if (applicationTempEntity != null) {
                if (applicationTemp.getApplicationTypeCatId() != null) {
                    applicationTempEntity.setApplicationTypeCatId(applicationTemp.getApplicationTypeCatId());
                }
                if (applicationTemp.getDepartmentId() != null) {
                    applicationTempEntity.setDepartmentId(applicationTemp.getDepartmentId());
                }
                if (applicationTemp.getDescription() != null) {
                    applicationTempEntity.setDescription(applicationTemp.getDescription());
                }
                if (applicationTemp.getNumberOfAuthors() != 0) {
                    applicationTempEntity.setNumberOfAuthors(applicationTemp.getNumberOfAuthors());
                }
                if (applicationTemp.getProductionDisciplinaryArea() != null) {
                    applicationTempEntity.setProductionDisciplinaryArea(applicationTemp.getProductionDisciplinaryArea());
                }
                if (applicationTemp.getProductionEndPage() != 0) {
                    applicationTempEntity.setProductionEndPage(applicationTemp.getProductionEndPage());
                }
                if (applicationTemp.getProductionJsonData() != null) {
                    applicationTempEntity.setProductionJsonData(applicationTemp.getProductionJsonData());
                }
                if (applicationTemp.getProductionObservations() != null) {
                    applicationTempEntity.setProductionObservations(applicationTemp.getProductionObservations());
                }
                if (applicationTemp.getProductionPublicationMechanisms() != null) {
                    applicationTempEntity.setProductionPublicationMechanisms(applicationTemp.getProductionPublicationMechanisms());
                }
                if (applicationTemp.getProductionStartPage() != 0) {
                    applicationTempEntity.setProductionStartPage(applicationTemp.getProductionStartPage());
                }
                if (applicationTemp.getProductionTitle() != null) {
                    applicationTempEntity.setProductionTitle(applicationTemp.getProductionTitle());
                }
                if (applicationTemp.isTermsAndConditions()) {
                    applicationTempEntity.setTermsAndConditions(applicationTemp.isTermsAndConditions());
                }
                if (applicationTemp.getTeacherId() != null) {
                    applicationTempEntity.setTeacherId(applicationTemp.getTeacherId());
                }
                if (applicationTemp.getProductionTypeId() != null) {
                    applicationTempEntity.setProductionTypeId(applicationTemp.getProductionTypeId());
                }
                if (applicationTemp.getProductionNumberOfPages() != 0) {
                    applicationTempEntity.setProductionNumberOfPages(applicationTemp.getProductionNumberOfPages());
                }

            }

            return this.mapStructApplicationsMapper.applicationTempEntityToApplicationTemp(
                    this.applicationTempRepository.save(Objects.requireNonNull(applicationTempEntity)));
        }
        return null;
    }

    @Override
    @Transactional
    public Teacher getTeacherByPersonId(Long personId) {
        return this.mapStructApplicationsMapper.teacherEntityToTeacher(this.teacherRepository.findByPerson_PersonId(personId));
    }

    @Override
    public ApplicationRecognized createApplicationRecognized(ApplicationRecognized applicationRecognized) {
        return this.mapStructApplicationsMapper.applicationRecognizedEntityToApplicationRecognized(
                this.applicationRecognizedRepository.save(
                        this.mapStructApplicationsMapper.applicationRecognizedToApplicationRecognizedEntity(applicationRecognized))
        );
    }

    @Override
    public ApplicationRecognized updateApplicationRecognized(ApplicationRecognized applicationRecognized) {
        return this.mapStructApplicationsMapper.applicationRecognizedEntityToApplicationRecognized(
                this.applicationRecognizedRepository.save(
                        this.mapStructApplicationsMapper.applicationRecognizedToApplicationRecognizedEntity(applicationRecognized))
        );
    }

    @Override
    public ApplicationRecognized getApplicationRecognizedByApplicationId(Long applicationId) {
        return this.mapStructApplicationsMapper.applicationRecognizedEntityToApplicationRecognized(
                this.applicationRecognizedRepository.findByApplicationId(applicationId)
        );
    }

    @Override
    public TypeProduction getTypeProductionById(Long typeProductionId) {
        return this.mapStructApplicationsMapper.typeProductionEntityToTypeProduction(
                this.typeProductionRepository.findById(typeProductionId).orElse(null)
        );
    }

    @Override
    public TypeProduction getTypeProductionByAlias(String alias) {
        return this.mapStructApplicationsMapper.typeProductionEntityToTypeProduction(
                this.typeProductionRepository.findByAlias(alias)
        );
    }

    @Override
    @Transactional
    public Application createApplication(ApplicationRequestCreate application) {
        //TODO: 1. Debo consultar la solicitud temporal
        ApplicationTempEntity applicationTempEntity = this.applicationTempRepository.findById(application.getApplicationTempId()).orElse(null);
        if (applicationTempEntity == null) {
            return null;
        }
        //TODO: 2. Debo consultar el docente por id que se saca de la solicitud temporal
        TeacherEntity teacherEntity = this.teacherRepository.findById(applicationTempEntity.getTeacherId()).orElse(null);
        if (teacherEntity == null) {
            return null;
        }
        //TODO: 3. Debo crear el objeto estado solicitud, el primer estado es Enviada al CPD
        StatusApplicationEntity statusApplicationEntity = this.statusApplicationRepository.findById(1L).orElse(null);
        if (statusApplicationEntity == null) {
            return null;
        }
        //TODO: 4. Debo consultar el tipo_produccion por id que se saca de la solicitud temporal
        TypeProductionEntity typeProductionEntity = this.typeProductionRepository.findById(
                applicationTempEntity.getProductionTypeId()).orElse(null);
        if (typeProductionEntity == null) {
            return null;
        }
        //TODO: 6. Debo consultar el departamento por id que se saca de la solicitud temporal
        DepartmentEntity departmentEntity = this.departmentRepository.findById(
                applicationTempEntity.getDepartmentId()).orElse(null);
        if (departmentEntity == null) {
            return null;
        }
        //TODO: 7. Crear una entidad de docente-solicitud
        TeacherApplicationEntity teacherApplicationEntity = new TeacherApplicationEntity(
                null, "primario", teacherEntity, null
        );

        //TODO: 8. Debo crear el objeto solicitud que quedara con un listado de docente-solcitud,
        //  el objeto de estado_solicitud y el objeto produccion que tendrá dentro los objetos de
        // tipo_produccion y produccion_archivo (produccion_archivo es un listado de archivos, que
        // es lo único que viene por el request)
        ProductionEntity productionEntity = new ProductionEntity();
        productionEntity.setProductionType(typeProductionEntity);
        //Mapeo de la lista de archivos de la solicitud de ProductionFileRequestCreate a ProductionFileEntity
        List<ProductionFileEntity> productionFiles = application.getProductionFiles().stream().map(
                productionFileRequestCreate ->
                        new ProductionFileEntity(null, productionFileRequestCreate.getFileId(),
                                productionFileRequestCreate.getName(), productionEntity)
        ).toList();
        //Seteo de la lista de archivos de la tabla produccion
        productionEntity.setProductionFiles(productionFiles);
        productionEntity.setProductionType(typeProductionEntity);
        productionEntity.setDataJson(applicationTempEntity.getProductionJsonData());
        productionEntity.setDisciplinaryArea(applicationTempEntity.getProductionDisciplinaryArea());
        productionEntity.setObservations(applicationTempEntity.getProductionObservations());
        productionEntity.setWorkTitle(applicationTempEntity.getProductionTitle());
        productionEntity.setStartPage(applicationTempEntity.getProductionStartPage());
        productionEntity.setEndPage(applicationTempEntity.getProductionEndPage());
        productionEntity.setNumberOfPages(applicationTempEntity.getProductionNumberOfPages());
        productionEntity.setPublicationMechanism(applicationTempEntity.getProductionPublicationMechanisms());
//        productionEntity.setApplication(null); //Revisar si es necesaria esta linea

        //Creación de la solicitud
        ApplicationEntity applicationEntity = new ApplicationEntity();
        applicationEntity.setApplicationStatus(statusApplicationEntity);
        applicationEntity.setProduction(productionEntity);
        applicationEntity.setNumberOfAuthors(applicationTempEntity.getNumberOfAuthors());
        applicationEntity.setApplicationTypeCatId(applicationTempEntity.getApplicationTypeCatId());
        applicationEntity.setDepartment(departmentEntity);
        applicationEntity.setDescription(applicationTempEntity.getDescription());
        applicationEntity.setTermsAndConditions(applicationTempEntity.isTermsAndConditions());
        applicationEntity.setCreateAt(LocalDateTime.now()); //Verificar luego por el utc por la ubicación del servidor
        applicationEntity.setTeacherApplications(List.of(teacherApplicationEntity));

        applicationEntity.getTeacherApplications().forEach(teacherApplication ->
                teacherApplication.setApplication(applicationEntity)
        );

        //Seteo la solicitud en la entidad de produccion
        productionEntity.setApplication(applicationEntity);


        //TODO: 7. Guardar la solicitud
        ApplicationEntity applicationEntitySave = this.applicationRepository.save(applicationEntity);

        //Buscar a la solicitud reconocida por el id de la solicitud temporal y actualizar el id de la solicitud
        //reconocida con el id de la solicitud creada
        ApplicationRecognizedEntity applicationRecognizedEntity = this.applicationRecognizedRepository.findByApplicationId(application.getApplicationTempId());
        if (applicationRecognizedEntity != null) {
            applicationRecognizedEntity.setApplicationId(applicationEntitySave.getApplicationId());
            this.applicationRecognizedRepository.save(applicationRecognizedEntity);
        }

        //Si se guardo la solicitud, se elimina la solicitud temporal
        this.applicationTempRepository.deleteById(applicationTempEntity.getApplicationTempId());

        return this.mapStructApplicationsMapper.applicationEntityToApplication(applicationEntitySave);
    }

    @Override
    public ApplicationTemp getApplicationTempByTeacherId(Long teacherId) {
        return this.mapStructApplicationsMapper.applicationTempEntityToApplicationTemp(
                this.applicationTempRepository.findByTeacherId(teacherId)
        );
    }

    @Override
    @Transactional
    public List<Application> getAllApplicationByTeacherId(Long teacherId) {
        return this.mapStructApplicationsMapper.applicationEntityListToApplicationList(
                this.applicationRepository.findAllByTeacherApplications_Teacher_TeacherIdOrderByCreateAtDesc(teacherId)
        );
    }

    @Override
    @Transactional(readOnly = true)
    public Application getApplicationById(Long applicationId) {
        return this.mapStructApplicationsMapper.applicationEntityToApplication(
                this.applicationRepository.findById(applicationId).orElse(null)
        );
    }

}
