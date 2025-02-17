package co.unicauca.gsrpi_api.review_applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.review_applications.domain.model.dto.response.ApplicationResponseGetAllByFacultyId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewApplicationsMapper {
    List<ApplicationResponseGetAllByFacultyId> ApplicationListToApplicationResponseGetAllByFacultyIdList(List<Application> applications);
}
