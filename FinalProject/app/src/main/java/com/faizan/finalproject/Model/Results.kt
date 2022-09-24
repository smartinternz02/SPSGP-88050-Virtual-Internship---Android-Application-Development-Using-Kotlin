package com.faizan.finalproject.Model

import android.provider.Contacts

class Results {
    var name : String ?= null
    var icon : String ?= null
    var geometry : Geometry ?= null
    var photos : Array<Photos> ?= null
    var id : String ?= null
    var place_id : String ?= null
    var price_level : Int = 0
    var rating : Double = 0.0
    var reference : String ?= null
    var scope : String ?= null
    var types : Array<String> ?= null
    var vicinity : String ?= null
    var opening_hours : OpeningHours ?= null
    var business_status : String ?= null
    var icon_background_color : String ?= null
    var icon_mask_base_uri : String ?= null
    var user_ratings_total : Int = 0
}