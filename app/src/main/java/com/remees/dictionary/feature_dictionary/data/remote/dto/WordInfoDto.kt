package com.remees.dictionary.feature_dictionary.data.remote.dto

import com.remees.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

data class WordInfoDto(
    val license: LicenseDto,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String,
    val origin: String
){
    fun toWordInfo() : WordInfoEntity {
         return WordInfoEntity(

             meanings = meanings.map { it.toMeaning() },
             phonetic = phonetic,
             word = word,
             origin = origin

         )
    }
}