package org.example

fun main() {
    while (true) {
        println("Hello Kekod")

        val sayi1 = getNumber("Birinci sayiyi giriniz : ")
        val sayi2 = getNumber("İkinci sayiyi giriniz : ")

        matOperations(sayi1, sayi2)

        println("Devam etmek istiyor musunuz : Y / N ")
        val secim = readln()
        if (secim.equals("N", ignoreCase = true)) {

            println("Hoşçakal Kekod")
            break
        }
    }
}

fun getNumber(prompt: String): Number? {
    while (true) {
        println(prompt)
        val input = readln()
        val number = typeControl(input)
        if (number != null) {
            return number
        } else {
            println("Geçerli bir sayı giriniz.")
        }
    }
}

fun typeControl(input: String?): Number? {
    return if (input != null && input.isNotBlank()) {
        val intValue: Int? = input.toIntOrNull()
        val doubleValue: Double? = input.toDoubleOrNull()

        when {
            intValue != null -> intValue
            doubleValue != null -> doubleValue
            else -> null
        }
    } else {
        null
    }
}

fun matOperations(num1: Number?, num2: Number?) {
    if (num1 != null && num2 != null) {
        println("Yapmak istediğiniz matematiksel işlemi giriniz (+ / - / * / /) : ")
        val islem = readln()

        val sonuc = when (islem) {
            "+" -> addNumber(num1, num2)
            "-" -> subtractNumber(num1, num2)
            "*" -> multiplyNumber(num1, num2)
            "/" -> divideNumber(num1, num2)
            else -> {
                println("Geçerli bir işlem giriniz !!!!")
                return
            }
        }
        println("Sonuç: $sonuc")
    } else {
        println("Eksik sayi girdiniz !!!")
    }
}

fun addNumber(num1: Number, num2: Number): Number {
    return if (num1 is Double || num2 is Double) {
        num1.toDouble() + num2.toDouble()
    } else {
        num1.toInt() + num2.toInt()
    }
}

fun subtractNumber(num1: Number, num2: Number): Number {
    return if (num1 is Double || num2 is Double) {
        num1.toDouble() - num2.toDouble()
    } else {
        num1.toInt() - num2.toInt()
    }
}

fun multiplyNumber(num1: Number, num2: Number): Number {
    return if (num1 is Double || num2 is Double) {
        num1.toDouble() * num2.toDouble()
    } else {
        num1.toInt() * num2.toInt()
    }
}

fun divideNumber(num1: Number, num2: Number): Number {
    return if (num1.toDouble() != 0.0 && num2.toDouble() != 0.0) {
        if (num1 is Double || num2 is Double) {
            num1.toDouble() / num2.toDouble()
        } else {
            num1.toInt() / num2.toInt().toDouble()
        }
    } else {
        println("Sıfıra bölme hatası!")
        0
    }
}
