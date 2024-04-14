package com.jhj0517.android_template_mvvm_xml.models.network

import com.google.gson.annotations.SerializedName

/**
 * Example network response data class for the Binance order book. You can change it to your own.
 * API Documentation : https://binance-docs.github.io/apidocs/spot/en/#order-book
 */
data class OrderBookResponse(
    @SerializedName("lastUpdateId") val lastUpdateId: Long,
    @SerializedName("bids") val bids: List<List<String>>,
    @SerializedName("asks") val asks: List<List<String>>
)