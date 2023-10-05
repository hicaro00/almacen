package com.lizven.admin.infrastructure.inputAdapter;

import com.lizven.admin.dominio.entity.UnidadMetrica;
import com.lizven.admin.infrastructure.inputPort.UnidadMetricaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unidadmetrica")
@Slf4j
public class UnidadMetricaController {

    @Autowired
    UnidadMetricaService unidadMetricaService;

    @GetMapping("/listarunidad")
    @ResponseBody
    public List<UnidadMetrica> getAllUnit() {
       List<UnidadMetrica> listar = unidadMetricaService.listarUnidades();
        return ResponseEntity.status(HttpStatus.OK).body(listar).getBody();
    }
    @PostMapping("/crearunidad")
    @ResponseBody
    public ResponseEntity<UnidadMetrica> crearUnidadDeMedida(UnidadMetrica unidadMetrica){
        UnidadMetrica unidadCreada = unidadMetricaService.crearUnidad(unidadMetrica);
        return ResponseEntity.status(HttpStatus.CREATED).body(unidadCreada);
    }
    @DeleteMapping("/borrarunidad")
    @ResponseBody
    public void borrarUnidadMedida(Long id){
        unidadMetricaService.borrarUnidad(id);
    }

}
