package com.ljhernandez.shopAll.repository;


import com.ljhernandez.shopAll.data.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Interface que extiende de JpaRepository
}
