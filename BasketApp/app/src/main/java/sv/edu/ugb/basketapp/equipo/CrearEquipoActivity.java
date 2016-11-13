package sv.edu.ugb.basketapp.equipo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import sv.edu.ugb.basketapp.R;
import sv.edu.ugb.basketapp.dao.EquipoDAO;
import sv.edu.ugb.basketapp.dto.Equipo;

public class CrearEquipoActivity extends AppCompatActivity implements View.OnClickListener{
    EditText nombre;
    Button btnAgregar, btnCancelar;
    Equipo equipo;
    EquipoDAO dao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_equipo);

        nombre = (EditText) findViewById(R.id.nombreTxt);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        btnCancelar = (Button) findViewById(R.id.btnCancel);
        btnAgregar.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnAgregar){
            equipo = new Equipo(nombre.getText().toString());
            dao = new EquipoDAO(this);
            dao.insertar(equipo);
            Intent intent = new Intent(this, EquipoActivity.class);
            startActivity(intent);
        }else if(v.getId() == R.id.btnCancel){
            Intent intent = new Intent(this, EquipoActivity.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
