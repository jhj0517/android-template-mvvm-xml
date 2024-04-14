package com.jhj0517.android_template_mvvm_xml.network

import com.jhj0517.android_template_mvvm_xml.models.network.response.OrderBookResponse
import retrofit2.http.GET

/**
 * This is Example interface for the Binance API. You can change it to your own.
 * You can find the API documentation here : https://binance-docs.github.io/apidocs/spot/en/
 */
interface BinanceService {
    @GET("depth")
    suspend fun getOrderBook(): OrderBookResponse
}