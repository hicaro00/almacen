package com.lizven.admin.infrastructure.inputPort;

import com.lizven.admin.dominio.entity.UnidadMetrica;

import java.util.List;

public interface UnidadMetricaService {

    public UnidadMetrica crearUnidad(UnidadMetrica unidadMetrica);
    public void borrarUnidad(Long id);
    public List<UnidadMetrica> listarUnidades();
    public UnidadMetrica buscaUnidID(Long id);
}
