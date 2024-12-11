package com.example.mvvmdatabase.data.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmdatabase.data.dao.MahasiswaDao
import com.example.mvvmdatabase.data.entity.Mahasiswa
import kotlin.concurrent.Volatile

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase: RoomDatabase(){
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java, //class database
                    "KrsDatabase" //nama database
                ).build().also { Instance = it }
            })
        }

    }
}