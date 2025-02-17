package co.unicauca.gsrpi_api.review_applications.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.Application;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructReviewApplicationsMapper {
    List<Application> applicationEntityListToApplicationList(List<ApplicationEntity> applicationEntityList);

}
