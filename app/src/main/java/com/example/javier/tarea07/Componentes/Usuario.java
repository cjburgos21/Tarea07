package com.example.javier.tarea07.Componentes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.content.Intent;

@Entity
public class Usuario {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(nombre = "nombre")
    private String nombre;

    @ColumnInfo(apellido = "apellido")
    private String apellido;

    @ColumnInfo(telefono = "telefono")
    private String telefono;

    @ColumnInfo(edad = "edad")
    private int edad;

    public Usuario(String nombre, String apellido, String telefono, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
    }

    //Setters y Getters
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}
}
