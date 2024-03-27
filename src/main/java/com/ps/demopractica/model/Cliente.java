package com.ps.demopractica.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // entidad
@Table(name = "Clientes") //tabla de base de datos
@Data // get and set
@NoArgsConstructor // Genera constructor sin argumentos
@AllArgsConstructor // Genera constructor con todos los argumentos
public class Cliente {

    @Id // especificar el id
    @Column(name = "client_id") // especificar el nombre de la columna
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GENERAR EL ID
    private  Long id;
    private  String  nombre;
    private  String  apellido;
    private  String  direccion;
    private  String  telefono;
    private  String  email;
}
