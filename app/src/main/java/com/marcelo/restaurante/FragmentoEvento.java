package com.marcelo.restaurante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoEvento extends Fragment {


    /** para implementar toast en el boton **/
    View view;
    Button botonEventoAgendar;
    /** fin implementar boton **/



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragmento_eventos, container, false);



        /** para implementar toast en el boton **/
        botonEventoAgendar = (Button) view.findViewById(R.id.btnAgendar);
        botonEventoAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "agendando evento...", Toast.LENGTH_LONG).show();
            }
        });
        /** Fin implementar boton **/



        return view;


    }
}