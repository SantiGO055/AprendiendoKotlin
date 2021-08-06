package com.santigo.aprendiendokotlin

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.santigo.aprendiendokotlin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding



class Constantes {
    //aca adentro declaramos las constantes, es similar al public statis final de java
    companion object {
        const val direccion = "25 de julio"
    }
}

enum class DIAS(val numero: Int){
    LUNES(0),
    MARTES(1),
    MIERCOLES(2),
    JUEVES(3),
    VIERNES(4),
    SABADO(5),
    DOMINGO(6)
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnChangeActivity.setOnClickListener{ checkValue(binding.etName) }
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
        //maps()
        //Leccion 7
        //loops()
        // Leccion 8
        //nullSafety()
        // Leccion 9
        //funciones()
        //Leccion 10
        //clases()


        //usoDeObjetos()
        //usoDeDataClasses()
        //usoDeConstantes()
        val numero = 4;
        if(esPar(numero)){
            println("El numero $numero es par")
        }
        else{
            println("El numero $numero es impar")
        }
    }
    fun usoDeObjetos(){
        val persona: Persona = Persona("Santiago","Gonzalez")
        val persona2: Persona = Persona()
        persona2.nombre = "Pepe"
        persona2.apellido = "Pepe"
        persona.darBienvenida()
        persona2.darBienvenida()
    }
    fun usoDeDataClasses(){
        val usuario = User("Santiago",24)
        val usuario2 = usuario.copy(edad = 20) //copio el objeto a uno nuevo modificando edad
        println(usuario2.toString()) //imprimo el objeto entero con sus atributos
        println("Son iguales: ${usuario == usuario2}") //uso equals par ver si son iguales
    }
    fun usoDeConstantes(){
        println(Constantes.direccion)
        val dia = DIAS.LUNES.numero
        println(dia)
    }
    private fun esPar(numero: Int): Boolean{ //el private es visible desde el scope de esta clase, no desde ninguna otra
        return numero % 2 == 0
    }
    fun checkValue(etName: TextView){

        if(etName.text.toString().isEmpty()){
            Toast.makeText(this, "El nombre no puede estar vacío", Toast.LENGTH_SHORT).show()
        }else{
            val intent = Intent(this,ShowNameActivity::class.java)
            intent.putExtra("name",etName.text.toString())
            startActivity(intent)
            //Iremos a otra pantalla
        }
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

    /**
     * Vamos a hablar de loops (bucles)
     */
    private fun loops(){
        // Bucles
        val myArray: List<String> = listOf("Hola","Bienvenidos al tutorial", "Ciaooo")
        val myMap = mutableMapOf("Santi" to 1,"Maria" to 2, "Sara" to 3)

        // For

        for (myString in myArray){
            println(myString)
        }

        for (myElement in myMap){
            println("${myElement.key} - ${myElement.value}")
        }

        /**
         Imprimo 11 numeros
         */
        for (x in 0..10){
            println("Imprimo 11 numeros " + x)
        }
        /**
         Imprimo 10 numeros
         */
        for (x in 0 until 10){
            println("Imprimo 10 numeros " + x)
        }

        for (x in 0..10 step 2){
            println("Imprimo numeros pares " + x)
        }

        for (x in 10 downTo 0 step 3){
            println("Imprimo numeros pares " + x)
        }

        val myNumericArray: IntRange = (0..20)

        for (myNum in myNumericArray){
            println(myNum)
        }

        // While
        var x = 0
        while (x < 10){


            println(x)
            x++;

        }

    }

    /**
     * Aqui vamos a hablar de seguridad contra nulos llamada nullSafety
     */
    fun nullSafety(){
        var myString = "SantiGO"
        //myString = null Esto daria un error de compilacion
        println(myString)

        //Variable null safety
        var mySafetyString: String? = "SantiGO null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "SantiGO"
        //println(mySafetyString)

        /*if (mySafetyString != null){
            println("No es nulo " + mySafetyString)//obligo a que mySafetyString no sea nula
        }
        else{
            println(""+mySafetyString)
        }*/

        // Safe call
        println(mySafetyString?.length)

        // reemplazo el if( a != null)
        mySafetyString?.let {  //ejecuto este codigo cuando la variable no sea null
            println(it)
        } ?: run{ //lo ejecuto cuando la variable sea null
            println(mySafetyString)

        }
    }

    /**
     * Se veran funciones
     */
    fun funciones(){
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Santiago")
        sayMyName("Pedro")
        sayMyName("Sara")
        sayMyNameAndAge("Santiago",24)
        sayMyNameAndAge("Pedro",45)
        sayMyNameAndAge("Sara",35)
        println(sumTwoNumbers(10,sumTwoNumbers(5,5)))

    }
    fun sayHello(){
        println("Hola!")

    }
    //Funciones con un parametro de entrada
    fun sayMyName(name: String){
        println("Hola, mi nombre es $name")
    }
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    //Funciones con valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int{
        val sum = firstNumber + secondNumber
        return sum
    }

    /**
     * Hablamos de clases
     */
    fun clases(){
        val Santi = Programmer("Santiago",24, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.JAVASCRIPT))

        //Santi.languages.forEach { println(it) }
        Santi.code()
        var sara = Programmer("Sara",35, arrayOf(Programmer.Language.JAVA), arrayOf(Santi))
        sara.code()
        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }

}

class Persona(var nombre: String = "",var apellido: String = ""){
    fun darBienvenida(){
        println("Bienvenido $nombre $apellido")
    }
}

data class User(val nombre: String, val edad: Int)