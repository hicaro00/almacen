package com.lizven.admin.infrastructure.ouputPort;

import com.lizven.admin.dominio.entity.UnidadMetrica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadMetricaRepository extends JpaRepository<UnidadMetrica, Long> {
}
