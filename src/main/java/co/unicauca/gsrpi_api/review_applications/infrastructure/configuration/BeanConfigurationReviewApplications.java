package co.unicauca.gsrpi_api.review_applications.infrastructure.configuration;

import co.unicauca.gsrpi_api.applications.application.mapper.ApplicationsMapper;
import co.unicauca.gsrpi_api.applications.application.port.output.ApplicationManagementOutPort;
import co.unicauca.gsrpi_api.applications.application.usecase.ApplicationManagementUseCase;
import co.unicauca.gsrpi_api.review_applications.application.mapper.ReviewApplicationsMapper;
import co.unicauca.gsrpi_api.review_applications.application.port.output.ReviewApplicationManagementOutPort;
import co.unicauca.gsrpi_api.review_applications.application.usecase.ReviewApplicationsManagementUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurationReviewApplications {
    @Bean
    public ReviewApplicationsManagementUseCase createReviewApplicationsManagementUseCase(
            ReviewApplicationManagementOutPort reviewApplicationManagementOutPort,
            ReviewApplicationsMapper reviewApplicationsMapper
    ){
        return new ReviewApplicationsManagementUseCase(reviewApplicationManagementOutPort, reviewApplicationsMapper);
    }
}
