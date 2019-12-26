package br.com.raveline.estudosnovos.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.raveline.estudosnovos.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConversasFragment extends Fragment {
    private TextView textoConversas;


    public ConversasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversas, container, false);
        textoConversas = view.findViewById(R.id.texto_conversas_id_fragment);
        textoConversas.setText("Alterei Conversas");



        return view;
    }

}
