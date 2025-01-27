package co.unicauca.gsrpi_api.applications.application.mapper;

import co.unicauca.gsrpi_api.applications.domain.model.ApplicationTemp;
import co.unicauca.gsrpi_api.applications.domain.model.dto.request.ApplicationTempRequest;
import co.unicauca.gsrpi_api.applications.domain.model.dto.response.ApplicationTempResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApplicationsMapper {
    ApplicationTemp applicationTempRequestToApplicationTemp(ApplicationTempRequest applicationTempRequest);
    ApplicationTempResponse applicationTempToApplicationTempResponse(ApplicationTemp applicationTemp);
}
