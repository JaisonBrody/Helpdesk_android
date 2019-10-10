package br.senac.es.treferenciafinal.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import br.senac.es.treferenciafinal.R;
import br.senac.es.treferenciafinal.model.Message;


public class Tab2 extends Fragment{
  ListView listViewMensagensNaoEnviadas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.secundfrag, container, false);

        listViewMensagensNaoEnviadas = (ListView) view.findViewById(R.id.minha_lista);

        List<Message> mensagens = new ArrayList<Message>();

        ArrayAdapter<Message> adapter = new ArrayAdapter<Message>(getActivity(),
                android.R.layout.simple_list_item_1, mensagens);

        listViewMensagensNaoEnviadas.setAdapter(adapter);

        return view;
    }
}
