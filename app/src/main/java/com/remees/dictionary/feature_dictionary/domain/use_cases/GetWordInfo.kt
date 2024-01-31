package com.remees.dictionary.feature_dictionary.domain.use_cases

import com.remees.dictionary.feature_dictionary.core.util.Resource
import com.remees.dictionary.feature_dictionary.domain.model.WordInfo
import com.remees.dictionary.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {

    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}