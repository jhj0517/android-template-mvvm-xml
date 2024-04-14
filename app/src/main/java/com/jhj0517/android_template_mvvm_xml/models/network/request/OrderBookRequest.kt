package com.jhj0517.android_template_mvvm_xml.models.network.request

import com.google.gson.annotations.SerializedName

/**
 * Example network request data class for the Binance order book. You can change it to your own.
 * You can find the API documentation here : https://binance-docs.github.io/apidocs/spot/en/
 */
data class OrderBookRequest(
    @SerializedName("symbol") val symbol: String,
    @SerializedName("limit") val limit: Int
)
