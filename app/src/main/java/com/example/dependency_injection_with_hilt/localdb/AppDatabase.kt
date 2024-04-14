package com.example.dependency_injection_with_hilt.localdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.example.dependency_injection_with_hilt.constants.AppConstants
import com.example.dependency_injection_with_hilt.models.ExampleData


@Database(entities = [ExampleData::class], exportSchema = false, version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dataDao(): DataDao

    companion object{
        @Volatile private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDB(context).also { instance = it }
            }
        }

        private fun buildDB(context: Context): AppDatabase {
            return databaseBuilder(
                context,
                AppDatabase::class.java,
                AppConstants.DB_NAME
            ).build()
        }
    }

}