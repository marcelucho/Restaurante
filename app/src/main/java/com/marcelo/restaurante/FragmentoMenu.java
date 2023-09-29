package com.marcelo.restaurante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoMenu extends Fragment {

    /** para implementar toast en el boton **/
    View view;
    Button botonAgregarFavorito1, botonAgregarFavorito2, botonAgregarFavorito3;
    /** Fin implementar boton **/




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragmento_menu, container, false);

        /** para implementar toast en el boton **/

        botonAgregarFavorito1 = (Button) view.findViewById(R.id.btnFavorito1);
        botonAgregarFavorito2 = (Button) view.findViewById(R.id.btnFavorito2);
        botonAgregarFavorito3 = (Button) view.findViewById(R.id.btnFavorito3);

        botonAgregarFavorito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Agregando Filet Mignon al Romero a Favoritos...", Toast.LENGTH_LONG).show();
            }
        });
        botonAgregarFavorito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Agregando Mousse de Chocolate con Frutas de Verano a Favoritos...", Toast.LENGTH_LONG).show();
            }
        });
        botonAgregarFavorito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Agregando Filete de Salmon Braseado a Favoritos...", Toast.LENGTH_LONG).show();
            }
        });
        return view;

        /** Fin implementar boton **/

    }
}
