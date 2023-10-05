package com.lizven.admin.infrastructure.inputPort;

import com.lizven.admin.dominio.entity.Operaciones;

import java.util.List;
import java.util.Optional;

public interface OperationType {

    public Operaciones createOperationType(Operaciones operaciones) ;
    public Optional<Operaciones> getByIdOperationType(Long id);
    public List<Operaciones> getAllOperations();


}
