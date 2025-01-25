package co.unicauca.gsrpi_api.system_configuration.infrastructure.configuration;

import co.unicauca.gsrpi_api.system_configuration.application.mapper.SystemConfigurationMapper;
import co.unicauca.gsrpi_api.system_configuration.application.port.output.GetAllFacultiesOutPort;
import co.unicauca.gsrpi_api.system_configuration.application.port.output.SaveConfigurationOutPort;
import co.unicauca.gsrpi_api.system_configuration.application.usecase.GetAllFacultiesUseCase;
import co.unicauca.gsrpi_api.system_configuration.application.usecase.SaveConfigurationUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurationSystem {
    @Bean
    public GetAllFacultiesUseCase createGetAllFacultiesUseCase(
            GetAllFacultiesOutPort getAllFacultiesOutPort,
            SystemConfigurationMapper mapper
    ){
        return new GetAllFacultiesUseCase(getAllFacultiesOutPort, mapper);
    }

    @Bean
    public SaveConfigurationUseCase createSaveConfigurationUseCase(
            SaveConfigurationOutPort saveConfigurationOutPort,
            SystemConfigurationMapper mapper
    ){
        return new SaveConfigurationUseCase(saveConfigurationOutPort,mapper);
    }

}
