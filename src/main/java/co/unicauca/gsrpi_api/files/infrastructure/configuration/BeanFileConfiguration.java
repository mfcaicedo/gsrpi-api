package co.unicauca.gsrpi_api.files.infrastructure.configuration;

import co.unicauca.gsrpi_api.files.application.mapper.FileMapper;
import co.unicauca.gsrpi_api.files.application.port.output.FileManagementOutPort;
import co.unicauca.gsrpi_api.files.application.usecase.FileManagementUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFileConfiguration {
    @Bean
    public FileManagementUseCase createFileManagementUseCase(
            FileManagementOutPort fileManagementOutPort,
            FileMapper mapper
    ) {
        return new FileManagementUseCase(fileManagementOutPort, mapper);
    }
}
