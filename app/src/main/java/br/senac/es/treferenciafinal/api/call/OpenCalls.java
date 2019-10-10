package br.senac.es.treferenciafinal.api.call;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;

import br.senac.es.treferenciafinal.R;
import br.senac.es.treferenciafinal.api.OnEventListener;
import br.senac.es.treferenciafinal.model.Call;

public class OpenCalls extends Fragment{
    ListView openCallsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View viewFragment = inflater.inflate(R.layout.firstfrag, container, false);

        final FloatingActionButton btnAtualizar = (FloatingActionButton) viewFragment.findViewById(R.id.updateBut);

        updateCallList(viewFragment);

        btnAtualizar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                updateCallList(viewFragment);

            }
        });


        return viewFragment;
    }
    private void updateCallList(final View viewMetodo) {

        CallTask chamadoTask = new CallTask(viewMetodo.getContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String result) {

                Gson gson = new Gson();

                Call[] chamados = gson.fromJson(result, Call[].class);

                ArrayAdapter<Call> adapter = new ArrayAdapter<Call>(getActivity(),android.R.layout.simple_list_item_1, chamados);

                openCallsList = (ListView) viewMetodo.findViewById(R.id.minha_lista);
                openCallsList.setAdapter(adapter);
            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(viewMetodo.getContext(), "ERROR: " + e.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

        chamadoTask.execute();
    }
}
