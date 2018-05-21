package com.example.javier.tarea07.Fragmentos;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.javier.tarea07.Nota;
import com.example.javier.tarea07.R;

import java.util.List;


public class Informacion extends Fragment {
    Usuario usuario;
    List<Nota> notas;
    TextView Nombre, Apellido;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.uinfo, container, false);

        Nombre = view.findViewById(R.id.nombre);
        Apellido = view.findViewById(R.id.apellido);

        Nombre.setText(usuario.getNombre());
        Apellido.setText(usuario.getApellido());

        return view;
    }

    public void setUser(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setUserNotes(List<Nota> notas){
        this.notas = notas;
    }

}
