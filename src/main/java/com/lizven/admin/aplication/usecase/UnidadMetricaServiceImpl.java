package com.lizven.admin.aplication.usecase;

import com.lizven.admin.dominio.entity.UnidadMetrica;
import com.lizven.admin.infrastructure.inputPort.UnidadMetricaService;
import com.lizven.admin.infrastructure.ouputPort.UnidadMetricaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadMetricaServiceImpl implements UnidadMetricaService {

    @Autowired
    UnidadMetricaRepository unidadMetricaRepository;

    @Override
    public UnidadMetrica crearUnidad(UnidadMetrica unidadMetrica) {
        return unidadMetricaRepository.save(unidadMetrica);
    }

    @Override
    public void borrarUnidad(Long id) {
        unidadMetricaRepository.deleteById(id);
    }

    @Override
    public List<UnidadMetrica> listarUnidades() {
        return unidadMetricaRepository.findAll();
    }

    @Override
    public UnidadMetrica buscaUnidID(Long id) {
        return unidadMetricaRepository.findById(id).orElse(null);
    }
}
