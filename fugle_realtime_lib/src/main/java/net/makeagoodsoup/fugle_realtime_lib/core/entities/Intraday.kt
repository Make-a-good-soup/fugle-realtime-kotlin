package net.makeagoodsoup.fugle_realtime_lib.core.entities

data class Intraday<T>(val apiVersion: String, val data: T)

data class MetaData(val info: Info, val meta: Meta)

// todo: 其他 data model