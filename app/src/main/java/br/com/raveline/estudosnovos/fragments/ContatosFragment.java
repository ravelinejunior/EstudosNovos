package br.com.raveline.estudosnovos.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import br.com.raveline.estudosnovos.R;
import br.com.raveline.estudosnovos.activities.CardViewActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContatosFragment extends Fragment {
    private Button botaoSnackBar;


    public ContatosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contatos, container, false);
        botaoSnackBar = view.findViewById(R.id.botao_snackBar_fragment_contatos);


        //definindo Snackbar e alterando color do mesmo.
        //Primeiro parametro é sempre uma View
        botaoSnackBar.setOnClickListener(v ->

                Snackbar.make(view,"Snackbar Pressionado",Snackbar.LENGTH_LONG).setAction("Confirmar",

                        v1 -> {
                            Intent i = new Intent(getActivity(), CardViewActivity.class);
                            startActivity(i);
                        }).setActionTextColor(getResources().getColor(android.R.color.darker_gray)).show());


        return view;
    }

}
