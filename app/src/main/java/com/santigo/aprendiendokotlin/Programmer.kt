package com.santigo.aprendiendokotlin

class Programmer(val name:String,
                 val age: Int,
                 val languages: Array<Language>,
                 val friends: Array<Programmer>? = null) { //programador puede tener amigos programadores, si no se pasa parametro asigno null por defecto

    enum class Language{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code(){
        for (language in languages){
            println("Estoy programando en $language")

        }
    }

}