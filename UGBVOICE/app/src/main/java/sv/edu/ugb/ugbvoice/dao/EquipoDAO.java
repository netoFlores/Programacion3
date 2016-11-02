package sv.edu.ugb.ugbvoice.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import sv.edu.ugb.ugbvoice.DBHelper;
import sv.edu.ugb.ugbvoice.dto.Equipo;

/**
 * Created by neto on 10-30-16.
 */

public class EquipoDAO {
    private DBHelper dbHelper;
    private SQLiteDatabase db;
    private static final String ID = "idEquipo";
    private static final String NAME = "nombre";

    public EquipoDAO(Context context){
        dbHelper = new DBHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long insertar(Equipo equipo){
        long outcome = -1;
        ContentValues valores = new ContentValues();
        valores.put(NAME, equipo.getNombre());
        outcome = db.insert(DBHelper.EQUIPO, null, valores);
        return outcome;
    }

    public long modificar(Equipo equipo){
        long outcome = -1;
        ContentValues valores = new ContentValues();
        valores.put(NAME, equipo.getNombre());
        outcome = db.update(DBHelper.EQUIPO, valores, "idEquipo=?", new String[]{equipo.getIdEquipo().toString()});
        return outcome;
    }

    public long eliminar(Equipo equipo){
        long outcome = 1;
        outcome = db.delete(DBHelper.EQUIPO, "idEquipo=?", new String[]{equipo.getIdEquipo().toString()});
        return outcome;
    }

    public Cursor mostrar(){
        String[] columnas = new String[]{ID, NAME};
        return db.query(DBHelper.EQUIPO, columnas, null, null, null, null, null);
    }

    public Cursor findById(Equipo equipo){
        String[] columnas = new String[]{ID, NAME};
        return db.query(DBHelper.EQUIPO, columnas, "idEquipo=?",new String[]{equipo.getIdEquipo().toString()}, null, null, null);
    }
}
