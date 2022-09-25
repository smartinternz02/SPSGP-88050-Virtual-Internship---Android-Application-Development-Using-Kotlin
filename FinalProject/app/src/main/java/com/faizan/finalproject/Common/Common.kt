package com.faizan.finalproject.Common

import com.faizan.finalproject.Model.Results
import com.faizan.finalproject.Remote.IGoogleAPIService
import com.faizan.finalproject.Remote.RetroFitClient

object Common {
    var currentResults : Results ?= null

    private val GOOGLE_API_URL = "https://maps.googleapis.com/"
    val googleApiService : IGoogleAPIService
    get() = RetroFitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService :: class.java)
}