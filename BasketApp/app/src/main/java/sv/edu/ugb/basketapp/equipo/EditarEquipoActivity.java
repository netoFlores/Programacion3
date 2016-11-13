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

public class EditarEquipoActivity extends AppCompatActivity implements View.OnClickListener{
    EditText nombreTxt;
    Button actualizar, eliminar, cancelar;
    String nombre;
    Integer idEquipo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_equipo);

        Bundle bundle = getIntent().getExtras();
        nombre = bundle.getString("nombre");
        idEquipo = bundle.getInt("idEquipo");


        nombreTxt = (EditText) findViewById(R.id.nombreTxt);
        nombreTxt.setText(nombre);

        actualizar = (Button) findViewById(R.id.btnAgregar);
        eliminar = (Button) findViewById(R.id.btnEliminar);
        cancelar = (Button) findViewById(R.id.btnCancel);

        actualizar.setOnClickListener(this);
        eliminar.setOnClickListener(this);
        cancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EquipoDAO dao = new EquipoDAO(this);
        Equipo equipo = new Equipo(nombreTxt.getText().toString());
        equipo.setIdEquipo(idEquipo);
        if(v.getId() == R.id.btnAgregar){
            //Button Actualizar

            dao.modificar(equipo);
            cambiarPantalla();
        }else if(v.getId() == R.id.btnCancel) {
            //Button Cancelar
            cambiarPantalla();

        }else if(v.getId() == R.id.btnEliminar){
            //Button Eliminar
            dao.eliminar(equipo);
            cambiarPantalla();
        }
    }

    private void cambiarPantalla(){
        Intent intent = new Intent(this, EquipoActivity.class);
        startActivity(intent);
    }
}
