package com.test.recycle.ipcdataprovider.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.test.recycle.ipcdataprovider.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  DatabaseHelper dataBaseHelper = new DatabaseHelper(this);
        //   SQLiteDatabase sqLiteDatabase = dataBaseHelper.getReadableDatabase();
       /* Cursor cursor = sqLiteDatabase.rawQuery("Select * From sqlite_master", null);
        if (cursor != null) {
            cursor.moveToFirst();

            do {
                Log.d("getAllBooks()", "0 " + cursor.getString(0));
                Log.d("getAllBooks()", "1 " + cursor.getString(1));
                Log.d("getAllBooks()", "2 " + cursor.getString(2));
                Log.d("getAllBooks()", "4 " + cursor.getString(3));
            } while (cursor.moveToNext());
        }*/


    }

}


    /*private static String ASSETS_DB_FOLDER = "db";
    private static String DB_NAME = "db.sqlite";
    String DB_PATH = null;
    private final Context myContext;
    private SQLiteDatabase myDataBase;

    public DatabaseHelper(Context paramContext) throws IOException {
        super(paramContext, DB_NAME, null, 1);
        this.myContext = paramContext;
        this.DB_PATH = ("/data/data/" + paramContext.getPackageName() + "/" + "databases/");
    }

    private boolean checkDataBase() {
        Object localObject = null;
        SQLiteDatabase localSQLiteDatabase;
        try {
            localSQLiteDatabase = SQLiteDatabase.openDatabase(this.DB_PATH + DB_NAME, null, 1);
            localObject = localSQLiteDatabase;
        } catch (SQLiteException localSQLiteException3) {
        }
        if (localObject != null) {
            ((SQLiteDatabase) localObject).close();
        }
        try {
            localSQLiteDatabase = SQLiteDatabase.openDatabase(this.DB_PATH + DB_NAME, null, 0);
            localSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bookmark(id integer primary key autoincrement,name TEXT)");
            localSQLiteDatabase.close();

            localSQLiteDatabase = SQLiteDatabase.openDatabase(this.DB_PATH + DB_NAME, null, 0);
            localSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS history(id integer primary key autoincrement,name TEXT)");
            localSQLiteDatabase.close();
            return localObject != null;


        } catch (SQLiteException localSQLiteException2) {

        }
        return false;
    }

    private void copyDataBase()
            throws IOException {
        String[] arrayOfString = this.myContext.getAssets().list(ASSETS_DB_FOLDER);
        FileOutputStream localFileOutputStream = new FileOutputStream(this.DB_PATH + DB_NAME);

        int i = 0;
        if (i >= arrayOfString.length) {
            localFileOutputStream.flush();
            localFileOutputStream.close();
            return;
        }
        InputStream localInputStream = null;
        byte[] arrayOfByte = null;
        for(;;) {
            if (i != 2) {
                localInputStream = this.myContext.getAssets().open(ASSETS_DB_FOLDER + "/" + arrayOfString[i]);
                arrayOfByte = new byte[310];
            }
            for (; ; ) {
                int j = localInputStream.read(arrayOfByte);
                if (j <= 0) {
                    localInputStream.close();
                    i += 1;
                    break;
                }
                localFileOutputStream.write(arrayOfByte, 0, j);
            }

            if(i>=arrayOfString.length){
                break;
            }
        }
    }

    public void close() {
        try {
            if (this.myDataBase != null) {
                this.myDataBase.close();
            }
            super.close();
            return;
        } finally {
        }
    }

    public void createDataBase()
            throws IOException {
        if (!checkDataBase()) {
            getReadableDatabase();
        }
        try {
            copyDataBase();
            return;
        } catch (IOException localIOException) {
            throw new Error("Error copying database");
        }
    }

    public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
        try {
            createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
        try {
            paramSQLiteDatabase = SQLiteDatabase.openDatabase(this.DB_PATH + DB_NAME, null, 0);
            paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS bookmark(id integer primary key autoincrement,name TEXT)");
            paramSQLiteDatabase.close();
            return;
        } catch (SQLiteException e) {
        }
    }

    public void openDataBase()
            throws SQLException {
        this.myDataBase = SQLiteDatabase.openDatabase(this.DB_PATH + DB_NAME, null, 1);
    }

    public Cursor query(String paramString, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6) {
        return this.myDataBase.query(null, null, "ID like '%7%'", null, null, null, "ID DESC");
    }

    public Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5) {
        return this.myDataBase.query("Syamu", null, null, null, null, null, null);
    }*/


