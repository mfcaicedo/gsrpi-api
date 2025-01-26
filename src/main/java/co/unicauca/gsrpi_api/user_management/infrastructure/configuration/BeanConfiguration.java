package co.unicauca.gsrpi_api.user_management.infrastructure.configuration;

import co.unicauca.gsrpi_api.user_management.application.mapper.UserManagementMapper;
import co.unicauca.gsrpi_api.user_management.application.output.UserManagementOutPort;
import co.unicauca.gsrpi_api.user_management.application.usecase.UserMangementUseCase;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UserMangementUseCase createUserMangementUseCase(UserManagementOutPort userManagementOutPort,
                                                           UserManagementMapper userManagementMapper){
        return new UserMangementUseCase(userManagementOutPort, userManagementMapper);
    }

    @Bean
    @Qualifier("genericModelMapper")
    public ModelMapper genericModelMapper(){
        return new ModelMapper();
    }

}
