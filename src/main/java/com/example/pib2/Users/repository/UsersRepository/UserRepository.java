package com.example.pib2.Users.repository.UsersRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.pib2.Users.model.Entity.User.Clientes;

import jakarta.transaction.Transactional;

public interface  UserRepository extends JpaRepository<Clientes, Long> {

    //Métodos personalizados
    //Método personalizado para inactivar cliente
    @Modifying
    @Transactional
    @Query("UPDATE Clientes c SET c.activo = :activo WHERE c.idCliente = :idCliente")
    int UpdateStatusCliente(Long idCliente, Boolean activo);
}   
