package co.unicauca.gsrpi_api.user_management.infrastructure.output.adapter;

import co.unicauca.gsrpi_api.auth.domain.model.User;
import co.unicauca.gsrpi_api.auth.domain.model.UserRole;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.RoleEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.entity.UserRoleEntity;
import co.unicauca.gsrpi_api.auth.infrastructure.output.repository.RoleRepository;
import co.unicauca.gsrpi_api.auth.infrastructure.output.repository.UserRepository;
import co.unicauca.gsrpi_api.user_management.application.output.UserManagementOutPort;
import co.unicauca.gsrpi_api.user_management.domain.model.Person;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.entity.PersonEntity;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.mapper.MapStructMapper;
import co.unicauca.gsrpi_api.user_management.infrastructure.output.respository.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserManagementAdapter implements UserManagementOutPort {
    private final PersonRepository personRepository;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final MapStructMapper mapStructMapper;

    public UserManagementAdapter(PersonRepository personRepository, MapStructMapper mapStructMapper,
                                 UserRepository userRepository, RoleRepository roleRepository) {
        this.personRepository = personRepository;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.mapStructMapper = mapStructMapper;
    }

    @Override
    @Transactional
    public Person savePerson(Person person) {
        //1. Mapear de Person a PersonEntity
        PersonEntity personEntity = this.mapStructMapper.personToPersonEntity(person);
        //2. Guardar al usuario en la base de datos y guarda en la tabla usuariorol el rol del usuario
        //2.1 Verificar si existe el rol en la base de datos por medio del nombre
        UserEntity userEntity = personEntity.getUser();
        List<UserRoleEntity> userRolesEntity = personEntity.getUser().getUserRoles();
        for (int index = 0; index < userRolesEntity.size(); index++) {
            RoleEntity role = this.roleRepository.findByName(userRolesEntity.get(index).getRole().getName());
            if (role != null) {
                //2.2 Seteo el rol en la entidad de rol de usuario
                userEntity.getUserRoles().get(index).setRole(role);
            } else {
                // Cancelamos la operación si no existe el rol y retornamos el error
                return null;
            }
        }
        //2.3 Seteo el usuario en la entidad de rol de usuario
        userEntity.getUserRoles().forEach(userRoles -> userRoles.setUser(userEntity));
        //2.4 Guardo el usuario en la base de datos
        this.userRepository.save(userEntity);
        //3. Guardar a la persona en la base de datos
        return this.mapStructMapper.personEntityToPerson(this.personRepository.save(personEntity));
    }

    @Override
    @Transactional
    public User getUserById(long userId) {
        return this.mapStructMapper.userEntityToUser(
                this.userRepository.findById(userId).orElse(null)
        );
    }

    @Override
    @Transactional
    public User getPersonByUid(String uid) {
        return this.mapStructMapper.userEntityToUser(
                this.userRepository.findByUid(uid)
        );
    }

    @Override
    @Transactional
    public Person getPersonByUserId(long userId) {
        return this.mapStructMapper.personEntityToPerson(
                this.personRepository.findByUser_UserId(userId)
        );
    }
}
