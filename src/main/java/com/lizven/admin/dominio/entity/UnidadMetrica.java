package com.lizven.admin.dominio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "unidad_medidas")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UnidadMetrica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidadMedida")
    private Long id_unidadMedida;
    @Column(name = "unidad_metrica")
    private String unidad_Metrica;

}
