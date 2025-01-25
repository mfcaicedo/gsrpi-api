package co.unicauca.gsrpi_api.user_management.infrastructure.output.mapper;

import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserEntity;
import co.unicauca.gsrpi_api.user_management.domain.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    List<User> userEntityListToUserList(List<UserEntity> userEntityList);
}
