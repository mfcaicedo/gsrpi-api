package co.unicauca.gsrpi_api.review_applications.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.applications.domain.model.StatusApplication;
import co.unicauca.gsrpi_api.applications.domain.model.TeacherApplication;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ProductionEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.StatusApplicationEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.TeacherApplicationEntity;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.ApplicationRepository;
import co.unicauca.gsrpi_api.applications.infrastructure.output.repository.StatusApplicationRepository;
import co.unicauca.gsrpi_api.review_applications.application.port.output.ReviewApplicationManagementOutPort;
import co.unicauca.gsrpi_api.review_applications.domain.model.Validation;
import co.unicauca.gsrpi_api.review_applications.domain.model.ValidationType;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.entity.ValidationEntity;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.mapper.MapStructReviewApplicationsMapper;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.repository.TeacherApplicationRepository;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.repository.ValidationRepository;
import co.unicauca.gsrpi_api.review_applications.infrastructure.output.repository.ValidationTypeRepository;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.respository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReviewApplicationsAdapter implements ReviewApplicationManagementOutPort {

    private final ApplicationRepository applicationRepository;
    private final ValidationRepository validationRepository;
    private final ValidationTypeRepository validationTypeRepository;
    private final PersonRepository personRepository;
    private final StatusApplicationRepository statusApplicationRepository;
    private final TeacherApplicationRepository teacherApplicationRepository;
    private final MapStructReviewApplicationsMapper mapStructReviewApplicationsMapper;

    public ReviewApplicationsAdapter(ApplicationRepository applicationRepository,
                                     ValidationRepository validationRepository,
                                     ValidationTypeRepository validationTypeRepository,
                                     PersonRepository personRepository,
                                     StatusApplicationRepository statusApplicationRepository,
                                     TeacherApplicationRepository teacherApplicationRepository,
                                     MapStructReviewApplicationsMapper mapStructReviewApplicationsMapper) {
        this.applicationRepository = applicationRepository;
        this.validationRepository = validationRepository;
        this.validationTypeRepository = validationTypeRepository;
        this.personRepository = personRepository;
        this.statusApplicationRepository = statusApplicationRepository;
        this.teacherApplicationRepository = teacherApplicationRepository;
        this.mapStructReviewApplicationsMapper = mapStructReviewApplicationsMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Application> getAllApplicationsByFacultyId(Long facultyId) {
        return this.mapStructReviewApplicationsMapper.applicationEntityListToApplicationList(
                this.applicationRepository.findAllByDepartment_Faculty_FacultyIdOrderByCreateAtAsc(facultyId)
        );
    }

    @Override
    @Transactional(readOnly = true)
    public List<Application> getAllApplicationsByFacultyIdAndSpecificStatus(Long facultyId, String statusApplication) {

        Long statusApplicationId = this.statusApplicationRepository.findByName(statusApplication).getStatusApplicationId();
        //Valido que el estado de la solicitud exista
        if (statusApplicationId == null) {
            return null;
        }
        return this.mapStructReviewApplicationsMapper.applicationEntityListToApplicationList(
                this.applicationRepository.findAllByDepartment_Faculty_FacultyIdAndApplicationStatus_StatusApplicationIdOrderByCreateAtAsc(facultyId, statusApplicationId)
        );
    }

    @Override
    @Transactional
    public Validation saveValidation(Validation validation) {
        //TODO: verificar si la producción existe y obtenerla si existe.
        if (this.applicationRepository.existsById(validation.getApplication().getApplicationId())) {
            ApplicationEntity applicationEntity = this.applicationRepository.findByApplicationId(validation.getApplication().getApplicationId());
            Application application = this.mapStructReviewApplicationsMapper.aplicationEntityToApplication(
                    this.applicationRepository.findByApplicationId((validation.getApplication().getApplicationId())));
            validation.setApplication(application);
        }
        //TODO: verificar si  el tipo de validación existe y obtenerlo si existe.
        if (this.validationTypeRepository.existsById(validation.getValidationType().getValidationTypeId())) {
            ValidationType validationType = this.mapStructReviewApplicationsMapper.validationTypeEntityToValidationType(
                    this.validationTypeRepository.findById(validation.getValidationType().getValidationTypeId()).get());
            validation.setValidationType(validationType);
        }
        //TODO: verificar si la persona que valida existe y obtenerla si existe.
        if (this.personRepository.existsById(validation.getPerson().getPersonId())) {
            Person person = this.mapStructReviewApplicationsMapper.personEntityToPerson(
                    this.personRepository.findByPersonId(validation.getPerson().getPersonId())
            );
            validation.setPerson(person);
        }
        //TODO: guardar la validación
        return this.mapStructReviewApplicationsMapper.validationEntityToValidation(
                this.validationRepository.save(
                        this.mapStructReviewApplicationsMapper.validationToValidationEntity(validation)
                )
        );
    }

    @Override
    public List<Validation> getAllValidationsByApplicationId(Long applicationId) {
        return this.mapStructReviewApplicationsMapper.validationEntityListToValidationList(
                this.validationRepository.findAllByApplication_ApplicationId(applicationId)
        );
    }

    @Override
    public List<ValidationType> getAllValidationTypes() {
        return this.mapStructReviewApplicationsMapper.validationTypeEntityListToValidationTypeList(
                this.validationTypeRepository.findAll()

        );
    }

    @Override
    public List<StatusApplication> getAllStatusApplications() {
        return this.mapStructReviewApplicationsMapper.statusApplicationEntityListToStatusApplicationList(
                this.statusApplicationRepository.findAll()
        );
    }

    @Override
    public Application updateStatusApplication(Application application) {
        //TODO: validar que la solicitud exista y obtenerla si existe.
        if (!this.applicationRepository.existsById(application.getApplicationId())) {
            return null;
        }
        ApplicationEntity applicationEntity = this.applicationRepository.findByApplicationId(application.getApplicationId());

        //Validar que el estado de la solicitud exista y obtenerlo si existe.
        if (!this.statusApplicationRepository.existsByName((application.getApplicationStatus().getName()))) {
            return null;
        }
        StatusApplicationEntity statusApplicationEntity = this.statusApplicationRepository.findByName(application.getApplicationStatus().getName());

        //TODO: actualizar el estado de la solicitud
        applicationEntity.setApplicationStatus(statusApplicationEntity);

        return this.mapStructReviewApplicationsMapper.aplicationEntityToApplication(
                this.applicationRepository.save(applicationEntity)
        );
    }

    @Override
    @Transactional(readOnly = true)
    public List<Validation> getAllValidationsByApplicationIdAndPersonId(Long applicationId, Long personId) {
        return this.mapStructReviewApplicationsMapper.validationEntityListToValidationList(
                this.validationRepository.findAllByApplication_ApplicationIdAndPerson_PersonId(applicationId, personId)
        );
    }

    @Override
    public TeacherApplication savePointsApplicationRecognition(TeacherApplication teacherApplication) {
        //Busco por id la entidad docente_solicitud y si existe la obtengo
        if (!this.teacherApplicationRepository.existsById(teacherApplication.getTeacherApplicationId())) {
            return null;
        }
        //Obtengo la entidad docente_solicitud
        TeacherApplicationEntity teacherApplicationEntity = this.teacherApplicationRepository.findByTeacherApplicationId(teacherApplication.getTeacherApplicationId());
        //Seteo los puntos recomendados y asignados
        teacherApplicationEntity.setRecommendedPoints(teacherApplication.getRecommendedPoints());
        teacherApplicationEntity.setAssignedPoints(teacherApplication.getAssignedPoints());
        //Guardo los cambios
        return this.mapStructReviewApplicationsMapper.teacherApplicationEntityToTeacherApplication(
                this.teacherApplicationRepository.save(teacherApplicationEntity)
        );
    }

    @Override
    public TeacherApplication updatePointsApplicationRecognition(TeacherApplication teacherApplication) {
        //Busco por id la entidad docente_solicitud y si existe la obtengo
        if (!this.teacherApplicationRepository.existsById(teacherApplication.getTeacherApplicationId())) {
            return null;
        }

        //Obtengo la entidad docente_solicitud
        TeacherApplicationEntity teacherApplicationEntity = this.teacherApplicationRepository.findByTeacherApplicationId(
                teacherApplication.getTeacherApplicationId()
        );
        //Seteo los puntos asignados
        teacherApplicationEntity.setAssignedPoints(teacherApplication.getAssignedPoints());
        //Guardo los cambios
        return this.mapStructReviewApplicationsMapper.teacherApplicationEntityToTeacherApplication(
                this.teacherApplicationRepository.save(teacherApplicationEntity)
        );

    }
}
