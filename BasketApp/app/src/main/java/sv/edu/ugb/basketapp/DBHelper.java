package sv.edu.ugb.basketapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by neto on 11-03-16.
 */

public class DBHelper extends SQLiteOpenHelper {
    public static final int DBVERSION = 1;
    public static final String DBNAME = "basketapp";
    public static final String EQUIPO = "equipo";
    public static final String JUGADOR = "jugador";
    public DBHelper(Context context) {
        super(context, DBNAME, null, DBVERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+EQUIPO+"(" +
                " _id INTEGER PRIMARY KEY  AUTOINCREMENT," +
                " nombre TEXT NOT NULL);");
        db.execSQL("CREATE TABLE "+JUGADOR+"(" +
                " _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                " nombre TEXT NOT NULL," +
                " apellido TEXT NOT NULL," +
                " sexo TEXT NOT NULL," +
                " idEquipo INTEGER);");
        db.execSQL("INSERT INTO equipo(nombre) VALUES('Bull')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
