package br.senac.es.treferenciafinal.api.call;

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
import br.senac.es.treferenciafinal.model.Call;

public class ClosedCalls extends Fragment {
    ListView closedCallsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.secundfrag, container, false);

        closedCallsList = (ListView) view.findViewById(R.id.minha_lista);

        List<Call> calls = new ArrayList<Call>();

        ArrayAdapter<Call> adapter = new ArrayAdapter<Call>(getActivity(),
                android.R.layout.simple_list_item_1, calls);

        closedCallsList.setAdapter(adapter);

        return view;
    }
}
