package com.lizven.admin.infrastructure.ouputPort;

import com.lizven.admin.dominio.entity.Operaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operaciones,Long> {

}
