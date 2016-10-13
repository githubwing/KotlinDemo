package com.wingsofts.kotlindemo

import java.io.Serializable

/**
 * Created by wing on 2016/10/13.
 */

class User :Serializable{
    var name: String? = null
    var id: String? = null

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, id: String) {
        this.name = name
        this.id = id
    }
}
