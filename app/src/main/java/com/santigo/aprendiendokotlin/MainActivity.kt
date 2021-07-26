package com.santigo.aprendiendokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Leccion 1
        //variablesYConstantes()
        //Leccion 2
        //tiposDeDatos()
        //Leccion 3
        //sentenciaIf()
        //Leccion 4
        //sentenciaWhen()
        //Leccion 5
        //arrays()
        //Leccion 6
        maps()
    }

    /**
     * Aqui vamos a hablar de variables y constantes
     */
    private fun variablesYConstantes(){
        //Variables
        var myFirstVariable = "Hello hackermen!"
        var myFirstNumber = 1
        println(myFirstVariable)
        myFirstVariable = "Bienvenidos al cursillo"
        println(myFirstVariable)

        var mySecondVariable = "Suscribete"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)
        myFirstVariable = "¿Ya te has suscrito?"
        println(myFirstVariable)

        //Constantes

        val myFirstConstant = myFirstVariable
        println(myFirstConstant)



    }

    /**
     * Hablaremos de tipos de datos
     */
    private fun tiposDeDatos(){
        // String
        val myString = "Hola hackermen!"
        val myStringDos = "Bienvenidos al tutorial"
        val myStringTres = myString + " " + myStringDos
        println(myStringTres)

        //Enteros (Byte, Short, Int, Long)
        val myInt:Int = 1
        val myIntDos = 2
        val myIntTres = myInt + myIntDos
        println(myIntTres)

        // Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDoubleDos = 2.6
        val myDoubleTres = 1
        val myDoubleCuatro: Double = myDouble + myDoubleDos + myDoubleTres
        println(myDoubleCuatro)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBoolDos = false
        //val myBoolTres = myBool + myBoolDos
        println(myBool == myBoolDos)
        println(myBool && myBoolDos)
        println(myBool || myBoolDos)


    }

    /**
     * Hablamos de la sentencia IF
     */
    private fun sentenciaIf() {
        val myNumber = 70

        /**
         * Operadores condicionales
         * > mayor que
         * < menor que
         * >= Mayor o igual que
         * <= menor o igual que
         * == igualdad
         * != desigualdad
         */
        /**
         * Operadores Logicos
         * %% operador "y"
         * || operador "o"
         * ! operador "no"
         */
        if((myNumber <= 10 && myNumber > 5) ){
            println("$myNumber es menor o igual que 10 y mayor que 5")
        }
        else if(myNumber != 60){
            println("$myNumber no es igual a 60")
        }
        else{
            println("$myNumber es mayor que 10 o menor o igual que 5")
        }


    }

    /**
     * Aqui vamos a hablar de la sentencia when
     */
    private fun sentenciaWhen(){
        //When con String
        val country = "Peru"

        when(country){
            "España", "Mexico", "Peru", "Argentina" -> {
                println("El idioma es español")
            }
            "EEUU"->{
                println("El idioma es ingles")

            }
            "Francia"->{
                println("El idioma es Frances")

            }
            else->{
                println("No conocemos el idioma")

            }
        }
        //When con Int
        val age = 10

        when(age){
            0,1,2 -> {
                println("Eres un Bebe")
            }
            in 3..10 ->{
                println ("Eres un niño")
            }
            in 11..17 ->{
                println ("Eres un adolescente")
            }
            in 18..69 ->{
                println ("Eres un adulto")
            }
            in 70..99 ->{
                println ("Eres un anciano")
            }
            else ->{
                println("😐")
            }
        }
    }

    /**
        Aqui vamos a hablar de arrays o arreglos
     */
    private fun arrays(){
        val name = "Santiago"
        val surname = "Gonzalez"
        val company = "SantiGO"
        val age = "24"

        //Creacion de un array
        val myArray: ArrayList<String> = arrayListOf<String>()

        //Añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        //Añadir conjunto de datos
        myArray.addAll(listOf("Hola","Bienvenidos al tutorial"))
        println(myArray)

        //Acceso a datos
        val myCompany = myArray[2]
        println(myCompany)

        myArray[5] = "Suscribete y activa la campana"
        println(myArray)
        myArray.removeAt(4)
        println(myArray)

        //Recorrer datos
        myArray.forEach{
            println(it)
        }
        //Otras operaciones
        println(myArray.count())
        myArray.clear()
        println(myArray.count())
    myArray.first()
        myArray.last()


    }

    /**
     * Aqui trabajamos con mapa tambien llamados diccionarios
     *
     */
    private fun maps(){
        var myMap: Map<String,Int> = mapOf() // creo un mapa vacio

        // Añadir elementos
        myMap = mapOf("Santi" to 24, "PEDRO" to 2) // cada vez que hago mapOf creo un mapa de cero vacio
        println(myMap)

        // Para agregar un solo valor al mapa creado
        //myMap["Ana"] = 7 //da error por que el mapa no es mutable
        val myMapDos: MutableMap<String,Int> = mutableMapOf() // creo mapa mutable para seguir agregando valores
        myMapDos["Maria"] = 8;
        myMapDos.put("Juan", 15)
        println(myMapDos)

        // Actualizar un dato
        myMapDos.put("Maria",2)
        myMapDos.put("Marcos",20)
        println(myMapDos)

        // Acceso a un dato
        println(myMapDos["Maria"])

        // Eliminar un dato
        myMapDos.remove("Maria")
        println(myMapDos)

    }
}