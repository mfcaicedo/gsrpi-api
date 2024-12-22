package co.unicauca.gsrpi_api.user_management.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.user_management.application.output.GetAllPaginatedUsersOutPort;
import co.unicauca.gsrpi_api.user_management.domain.model.User;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.UserEntity;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.respository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllPaginatedUsersAdapter implements GetAllPaginatedUsersOutPort {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public GetAllPaginatedUsersAdapter(
            UserRepository userRepository,
            ModelMapper modelMapper
    ) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<User> getAllPaginatedUsers() {
        //TODO: Implementar lógica de negocio para obtener todos los usuarios paginados usando el repositorio
        List<UserEntity> users = this.userRepository.findAll();
        System.out.println("ver");
        users.forEach(user ->
                System.out.println(user.getEmail() + " " + user.getUser_id() + " " +
                        user.getUsername() + " " + user.getPassword()
                ));
        return this.modelMapper.map(users, new TypeToken<List<User>>(){}.getType());
    }
}
