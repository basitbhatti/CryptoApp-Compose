package com.simpewala.cryptoapp_compose.data.remote

import com.simpewala.cryptoapp_compose.data.remote.dto.CoinDTO
import com.simpewala.cryptoapp_compose.data.remote.dto.CoinDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}