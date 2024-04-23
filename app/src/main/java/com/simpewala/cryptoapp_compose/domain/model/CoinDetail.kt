package com.simpewala.cryptoapp_compose.domain.model

import com.simpewala.cryptoapp_compose.data.remote.dto.TeamMember

class CoinDetail (
    val coinId : String,
    val name : String,
    val description : String,
    val symbol : String,
    val rank : Int,
    val isActive : Boolean,
    val tags : List<String>,
    val team : List<TeamMember>
)