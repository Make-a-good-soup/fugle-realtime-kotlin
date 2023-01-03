package net.makeagoodsoup.fugle_realtime_lib.core.entities

data class Dealts(
    val at: String, // 此筆交易的成交時間
    val bid: Double?, // 此筆交易的買進價
    val ask: Double?, // 此筆交易的賣出價
    val price: Double, // 此筆交易的成交價
    val volume: Double, // 此筆交易的成交量
    val serial: Double, // 此筆交易的序號
)