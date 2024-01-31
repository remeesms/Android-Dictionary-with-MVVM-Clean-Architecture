package com.remees.dictionary.feature_dictionary.data.remote.dto

data class PhoneticDto(
    val audio: String,
    val licenseDto: LicenseDto,
    val sourceUrl: String,
    val text: String
)