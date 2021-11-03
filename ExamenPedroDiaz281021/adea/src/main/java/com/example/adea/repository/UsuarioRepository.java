package com.example.adea.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.adea.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>  {
   public Usuario findByLogin(String login);
   public Usuario findByPassword(String password);
}