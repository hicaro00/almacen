package com.lizven.admin.infrastructure.ouputPort;

import com.lizven.admin.dominio.entity.Operaciones;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OperationRepository extends JpaRepository<Operaciones,Long> {

}
