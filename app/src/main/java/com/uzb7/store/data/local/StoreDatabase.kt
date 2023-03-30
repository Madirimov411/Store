package com.uzb7.store.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.uzb7.store.model.Product

@Database(entities = [Product::class], version = 1)
abstract class StoreDatabase:RoomDatabase() {

    abstract fun getStoreDao():StoreDao

    companion object{
        private var DB_INSTANCE:StoreDatabase?=null

        fun getAppInstance(context: Context):StoreDatabase{
            if (DB_INSTANCE==null){
                DB_INSTANCE=Room.databaseBuilder(context.applicationContext,StoreDatabase::class.java,"store").allowMainThreadQueries().build()
            }
            return DB_INSTANCE!!
        }
    }


}