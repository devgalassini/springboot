package com.galassinitecnology.derpartamentoRH.repositories;

import com.galassinitecnology.derpartamentoRH.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
