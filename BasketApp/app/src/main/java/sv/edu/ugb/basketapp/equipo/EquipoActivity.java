package sv.edu.ugb.basketapp.equipo;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;

import sv.edu.ugb.basketapp.R;
import sv.edu.ugb.basketapp.dao.EquipoDAO;
import sv.edu.ugb.basketapp.dto.Equipo;

public class EquipoActivity extends AppCompatActivity {
    ListView lv;
    EquipoDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EquipoActivity.this, CrearEquipoActivity.class);
                startActivity(intent);
            }
        });

        lv = (ListView) findViewById(R.id.lv1);
        dao = new EquipoDAO(this);



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SimpleCursorAdapter cursor = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, dao.mostrar(), new String[]{"nombre"}, new int[]{android.R.id.text1});
        lv.setAdapter(cursor);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cursor cursor = (Cursor) lv.getItemAtPosition(position);
                Intent intent = new Intent(EquipoActivity.this, EditarEquipoActivity.class);
                String nombre = cursor.getString(1);
                int idEquipo = cursor.getInt(0);
                intent.putExtra("nombre", nombre);
                intent.putExtra("idEquipo", idEquipo);
                startActivity(intent);
            }
        });

    }
}
