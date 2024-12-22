package co.unicauca.gsrpi_api.user_management.infrastructure.configuration;

import co.unicauca.gsrpi_api.user_management.application.output.GetAllPaginatedUsersOutPort;
import co.unicauca.gsrpi_api.user_management.domain.usecase.GetAllPaginatedUsersUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public GetAllPaginatedUsersUseCase createGetAllPaginatedUsersUseCase(
        GetAllPaginatedUsersOutPort getAllPaginatedUsersOutPort
    ){
        return new GetAllPaginatedUsersUseCase(getAllPaginatedUsersOutPort);
    }

    @Bean
    @Qualifier("genericModelMapper")
    public ModelMapper genericModelMapper(){
        return new ModelMapper();
    }

}
