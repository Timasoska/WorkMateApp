package com.example.workmateapp.data.dto

import com.google.gson.annotations.SerializedName

data class PokemonListDto (
    @SerializedName("count") val count: Int,
    @SerializedName("next") val next: String?,
    @SerializedName("previous") val previous: String?,
    @SerializedName("results") val results: List<PokemonResultDto>
)

data class PokemonResultDto (
    @SerializedName("name") val name: String,
    @SerializedName("url") val url: String
)