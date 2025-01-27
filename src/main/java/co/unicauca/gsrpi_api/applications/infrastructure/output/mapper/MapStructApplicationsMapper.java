package co.unicauca.gsrpi_api.applications.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;
import co.unicauca.gsrpi_api.applications.infrastructure.output.entity.ApplicationTempEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructApplicationsMapper {
    ApplicationTemp applicationTempEntityToApplicationTemp(ApplicationTempEntity applicationTempEntity);
    ApplicationTempEntity applicationTempToApplicationTempEntity(ApplicationTemp applicationTemp);
}
