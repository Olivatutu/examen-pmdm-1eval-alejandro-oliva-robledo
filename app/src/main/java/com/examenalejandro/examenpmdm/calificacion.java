package com.examenalejandro.examenpmdm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class calificacion extends Fragment{


        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_calificacion, container, false);

            TextView nombre = view.findViewById(R.id.tv_nombre);
            TextView descripcion = view.findViewById(R.id.tv_descripcion);

            nombre.setText("Alejandro Oliva Robledo");
            descripcion.setText("Hola Mario");

            return view;
        }

}
