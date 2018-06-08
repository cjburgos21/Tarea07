package com.example.javier.tarea07.Componentes;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.example.javier.tarea07.Componentes.Usuario;

@Entity(foreignKeys = @ForeignKey(entity = Usuario.class,parentColumns = "id", childColumns = "userid", onDelete = ForeignKey.CASCADE))

public class Nota {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "data")
    private String data;

    public Nota() {

    }

    public Nota(String data, int userid){
        this.data = data;
        this.userid = userid;
    }

    @ColumnInfo(name = "userid")
    private int userid;


}
