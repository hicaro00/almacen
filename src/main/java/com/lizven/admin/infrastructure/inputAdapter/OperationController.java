package com.lizven.admin.infrastructure.inputAdapter;

import com.lizven.admin.dominio.entity.Operaciones;
import com.lizven.admin.infrastructure.inputPort.OperationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/serie")
@Slf4j
public class OperationController {


    @Autowired
    OperationType operationType;


    @PostMapping("/guardarOperacion")
    @ResponseBody
    public ResponseEntity<Operaciones> saveOpertaionType ( Operaciones operaciones){

        Operaciones saveOperation = operationType.createOperationType(operaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveOperation);
    }
    @GetMapping("/getoperationtype")
    @ResponseBody
    public ResponseEntity<Optional<Operaciones>> getOperationType (Long id){

        Optional<Operaciones> getOpertaionType = operationType.getByIdOperationType(id);
        return ResponseEntity.status(HttpStatus.OK).body(getOpertaionType);
    }

}
