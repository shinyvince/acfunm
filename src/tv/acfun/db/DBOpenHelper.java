package tv.acfun.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {

	public DBOpenHelper(Context context) {
		super(context, "acfun.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE FAVORITES (_ID INTEGER PRIMARY KEY AUTOINCREMENT,VIDEOID VARCHAR(20), TITLE VARCHAR(20),TIME VARCHAR(20))");
		db.execSQL("CREATE TABLE HISTORY (_ID INTEGER PRIMARY KEY AUTOINCREMENT,VIDEOID VARCHAR(20), TITLE VARCHAR(20),TIME VARCHAR(20))");
		db.execSQL("CREATE TABLE SEARCHHISTORY (_ID INTEGER PRIMARY KEY AUTOINCREMENT, TITLE VARCHAR(20))");
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}


}