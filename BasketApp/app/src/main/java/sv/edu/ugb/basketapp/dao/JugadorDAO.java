package sv.edu.ugb.basketapp.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import sv.edu.ugb.basketapp.DBHelper;
import sv.edu.ugb.basketapp.dto.Jugador;

/**
 * Created by neto on 11-03-16.
 */

public class JugadorDAO {
    private DBHelper dbHelper;
    private SQLiteDatabase db;
    private static final String ID = "idJugador";
    private static final String NOMBRE = "nombre";
    private static final String APELLIDO = "apellido";
    private static final String SEXO = "sexo";
    private static final String IDEQUIPO = "idEquipo";

    public JugadorDAO(Context context) {
        dbHelper = new DBHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long insertar(Jugador jugador){
        long outcome = -1;
        ContentValues valores = new ContentValues();
        valores.put(NOMBRE, jugador.getNombre());
        valores.put(APELLIDO, jugador.getApellido());
        valores.put(SEXO, jugador.getSexo());
        valores.put(IDEQUIPO, jugador.getIdEquipo());
        outcome = db.insert(DBHelper.JUGADOR, null, valores);
        return outcome;
    }

    public long modificar(Jugador jugador){
        long outcome = -1;
        ContentValues valores = new ContentValues();
        valores.put(NOMBRE, jugador.getNombre());
        valores.put(APELLIDO, jugador.getApellido());
        valores.put(SEXO, jugador.getSexo());
        valores.put(IDEQUIPO, jugador.getIdEquipo());
        outcome = db.update(DBHelper.JUGADOR, valores, "idJugador=?", new String[]{jugador.getIdJugador().toString()});
        return outcome;
    }

    public long eliminar(Jugador jugador){
        long outcome = 1;
        outcome = db.delete(DBHelper.JUGADOR, "idJugador=?", new String[]{jugador.getIdJugador().toString()});
        return outcome;
    }

    public Cursor mostrar(){
        String[] columnas = new String[]{ID, NOMBRE, APELLIDO, SEXO, IDEQUIPO};
        return db.query(DBHelper.JUGADOR, columnas, null, null, null, null, null);
    }

    public Cursor findById(Jugador jugador){
        String[] columnas = new String[]{ID, NOMBRE, APELLIDO, SEXO, IDEQUIPO};
        return db.query(DBHelper.JUGADOR, columnas, "idJugador=?",new String[]{jugador.getIdJugador().toString()}, null, null, null);
    }
}
