package com.lizven.admin.aplication.usecase;


import com.lizven.admin.dominio.entity.Operaciones;
import com.lizven.admin.infrastructure.inputPort.OperationType;
import com.lizven.admin.infrastructure.ouputPort.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OperationServiceImpl implements OperationType {

    @Autowired
   OperationRepository operationRepository;

    @Override
    public Operaciones createOperationType(Operaciones operaciones) {
        return operationRepository.save(operaciones);
    }

    @Override
    public Optional<Operaciones> getByIdOperationType(Long id) {

        return Optional.ofNullable(operationRepository.findById(id).orElse(null));
    }

    @Override
    public List<Operaciones> getAllOperations() {
        return operationRepository.findAll();
    }
}
