package com.jhj0517.android_template_mvvm_xml.di

import com.jhj0517.android_template_mvvm_xml.BuildConfig
import com.jhj0517.android_template_mvvm_xml.network.BinanceService
import com.jhj0517.android_template_mvvm_xml.network.ClientFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideBinanceService(): BinanceService {
        return ClientFactory.create(baseUrl = BuildConfig.BinanceBaseURL, service = BinanceService::class.java)
    }

}