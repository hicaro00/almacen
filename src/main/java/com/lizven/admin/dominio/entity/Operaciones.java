package com.lizven.admin.dominio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "operaciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operaciones")
    private Long id_operaciones;

    @Column(name = "ope_descripcion")
    private String ope_descripcion;

}
