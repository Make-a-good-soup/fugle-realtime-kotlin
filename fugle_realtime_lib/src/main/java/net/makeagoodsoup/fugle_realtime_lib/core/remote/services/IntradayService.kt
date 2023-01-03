package net.makeagoodsoup.fugle_realtime_lib.core.remote.services

import net.makeagoodsoup.fugle_realtime_lib.core.entities.ChartData
import net.makeagoodsoup.fugle_realtime_lib.core.entities.DealtsData
import net.makeagoodsoup.fugle_realtime_lib.core.entities.Intraday
import net.makeagoodsoup.fugle_realtime_lib.core.entities.MetaData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IntradayService {
    @GET("intraday/meta")
    suspend fun getMeta(
        @Query("symbolId") symbolId: String,
        @Query("apiToken") apiToken: String
    ): Response<Intraday<MetaData>>

    @GET("intraday/chart")
    suspend fun getChart(
        @Query("symbolId") symbolId: String,
        @Query("apiToken") apiToken: String
    ): Response<Intraday<ChartData>>

    @GET("intraday/dealts")
    suspend fun getDealts(
        @Query("symbolId") symbolId: String,
        @Query("apiToken") apiToken: String
    ): Response<Intraday<DealtsData>>
}