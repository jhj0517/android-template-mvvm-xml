package com.jhj0517.android_template_mvvm_xml.di

import android.content.Context
import com.jhj0517.android_template_mvvm_xml.localdb.AppDatabase
import com.jhj0517.android_template_mvvm_xml.localdb.DataDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDBModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    @Singleton
    fun provideDataDao(appDatabase: AppDatabase): DataDao {
        return appDatabase.dataDao()
    }
}