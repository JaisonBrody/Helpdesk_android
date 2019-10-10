package br.senac.es.treferenciafinal.ex;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;



import br.senac.es.treferenciafinal.NovaMensagemActivity;
import br.senac.es.treferenciafinal.R;
import br.senac.es.treferenciafinal.fragments.Tab1;
import br.senac.es.treferenciafinal.fragments.Tab2;

public class Activity extends AppCompatActivity {
    private Adapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1(), "Tab 1");
        adapter.addFragment(new Tab2(), "Tab 2");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        Button btnNovaMensgem = (Button) findViewById(R.id.btn_nova_mensagem);

        btnNovaMensgem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this, NovaMensagemActivity.class);
                startActivity(intent);
            }
        });
    }
}
