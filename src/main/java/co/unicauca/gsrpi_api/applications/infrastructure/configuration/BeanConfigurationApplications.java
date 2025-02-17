package co.unicauca.gsrpi_api.applications.infrastructure.configuration;

import co.unicauca.gsrpi_api.applications.application.mapper.ApplicationsMapper;
import co.unicauca.gsrpi_api.applications.application.port.output.ApplicationManagementOutPort;
import co.unicauca.gsrpi_api.applications.application.usecase.ApplicationManagementUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurationApplications {
    @Bean
    public ApplicationManagementUseCase createApplicationManagementUseCase(
            ApplicationManagementOutPort applicationManagementOutPort,
            ApplicationsMapper applicationsMapper
    ){
        return new ApplicationManagementUseCase(applicationManagementOutPort, applicationsMapper);
    }
}
