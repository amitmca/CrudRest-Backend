package br.com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restapi.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
