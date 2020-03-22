package br.com.rhuan.cursorhuan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rhuan.cursorhuan.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
