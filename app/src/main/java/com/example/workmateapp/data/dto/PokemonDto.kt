package com.example.workmateapp.data.dto

import com.google.gson.annotations.SerializedName

data class PokemonDto(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("sprites") val sprites: SpritesDto
)

data class SpritesDto(
    @SerializedName("other") val other: OtherSpritesDto?
)

data class OtherSpritesDto(
    @SerializedName("official-artwork") val officialArtwork: OfficialArtworkDto?
)

data class OfficialArtworkDto(
    @SerializedName("front_default") val frontDefault: String?
)