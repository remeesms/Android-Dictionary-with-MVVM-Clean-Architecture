package com.remees.dictionary.feature_dictionary.domain.repository

import com.remees.dictionary.feature_dictionary.core.util.Resource
import com.remees.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}