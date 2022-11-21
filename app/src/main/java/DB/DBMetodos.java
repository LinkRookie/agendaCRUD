package DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBMetodos {
    public SQLiteDatabase getConexion(Context context){
        DBHelper con = new DBHelper(context,"DBContactos",null,1);
        SQLiteDatabase db = con.getWritableDatabase();
        return db;

    }
    public int insertarUsuario(Context context, DBContactos db_contactos){
        int res = 0;
        String sql = "INSERT INTO Contactos(numero,nombre,correo)values('"+db_contactos.getNumero()+"','"+db_contactos.getNombre()+"','"+db_contactos.getCorreo()+"')";
        SQLiteDatabase db = this.getConexion(context);
        try {
            db.execSQL(sql);
            res = 1;
        }catch (Exception e){

        }

        return res;


    }
}
