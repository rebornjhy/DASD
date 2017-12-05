package com.example.rebor.dasd;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ReBor on 2017-12-04.
 */

public class DBOpenHelper extends SQLiteOpenHelper {

    public DBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE ADMIN (adminKey TEXT PRIMARY KEY);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(String adminKey) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("INSERT INTO ADMIN VALUES(null, '" + adminKey + "');");
        db.close();
    }
/*관리자키는 초기 설정 및 변형 불가 가정
    public void update(String adminKey) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("UPDATE ADMIN SET adminKey='" + adminKey + "' WHERE _id="id";");
        db.close();
    }

    public void delete(String adminKey) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("DELETE FROM ADMIN WHERE adminKey='" + adminKey + "';");
        db.close();
    }
*/
    public String getResult() {
        SQLiteDatabase db = getReadableDatabase();
        String result = "";

        Cursor cursor = db.rawQuery("SELECT * FROM ADMIN", null);

        while (cursor.moveToNext()) {
            result += cursor.getString(0);
        }

        return result;
    }

}
