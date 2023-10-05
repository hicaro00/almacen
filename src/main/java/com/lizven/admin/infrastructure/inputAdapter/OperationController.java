package com.lizven.admin.infrastructure.inputAdapter;

import com.lizven.admin.dominio.entity.Operaciones;
import com.lizven.admin.infrastructure.inputPort.OperationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/operationtype")
@Slf4j
public class OperationController {


    @Autowired
    OperationType operationType;


    @PostMapping("/guardaroperaciontipe")
    @ResponseBody
    public ResponseEntity<Operaciones> saveOpertaionType ( Operaciones operaciones){

        Operaciones saveOperation = operationType.createOperationType(operaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveOperation);
    }
    @GetMapping("/getoperationtype")
    @ResponseBody
    public List<Operaciones> getOperationType (){
        return operationType.getAllOperations();

    }

}
