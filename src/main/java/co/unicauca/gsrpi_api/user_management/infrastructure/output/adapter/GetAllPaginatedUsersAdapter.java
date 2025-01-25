package co.unicauca.gsrpi_api.user_management.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserEntity;
import co.unicauca.gsrpi_api.user_management.application.output.GetAllPaginatedUsersOutPort;
import co.unicauca.gsrpi_api.user_management.domain.model.User;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.mapper.MapStructMapper;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.respository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllPaginatedUsersAdapter implements GetAllPaginatedUsersOutPort {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final MapStructMapper mapStructMapper;
    public GetAllPaginatedUsersAdapter(
            UserRepository userRepository,
            ModelMapper modelMapper,
            MapStructMapper mapStructMapper
    ) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.mapStructMapper = mapStructMapper;
    }

    @Override
    public List<User> getAllPaginatedUsers() {
        //TODO: Implementar lógica de negocio para obtener todos los usuarios paginados usando el repositorio
        List<UserEntity> users = this.userRepository.findAll();
        return this.mapStructMapper.userEntityListToUserList(users);
    }
}
