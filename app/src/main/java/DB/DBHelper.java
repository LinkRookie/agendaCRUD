package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    // declaracion de consultas
    private final String DBCrearTabla = "CREATE TABLE contactos (id INTEGER PRIMARY KEY AUTOINCREMENT, numero TEXT,nombre TEXT,correo TEXT )";

    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase DB){
        //ejecucion de consulta para crear tabla contactos
        DB.execSQL(DBCrearTabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
