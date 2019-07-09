

package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?):Pair<String?,String?>{
        val parts: List<String>? = fullName?.split(" ")
        val firstName = if(parts.isNullOrEmpty()) null else parts[0]
        val lastName = if(parts.isNullOrEmpty()) null else parts[1]
        return firstName to lastName
    }

    fun toInitials(firstName:String?, lastName:String?): String?{
        var initials: String?
        if(firstName.isNullOrEmpty() && lastName.isNullOrEmpty()) initials = null
        else if(firstName.isNullOrEmpty())
            initials=lastName!!.toCharArray()[0].toUpperCase().toString()
        else if(lastName.isNullOrEmpty())
            initials=firstName.toCharArray()[0].toUpperCase().toString()
        else initials=lastName.toCharArray()[0].toUpperCase().toString()+firstName.toCharArray()[0].toUpperCase().toString()
        return initials
    }

    fun transliteration(payload: String, divider: String=" "): String{
        var str = ""
        for(i in payload.toCharArray()){
            str+= switcher(i,divider)
        }
        return str
    }
}

fun switcher(c: Char, divider: String=" "):String {
    when(c){
        'а' -> return "a"
        'б' -> return "b"
        'в' -> return "v"
        'г' -> return "g"
        'д' -> return "d"
        'е' -> return "e"
        'ё' -> return "e"
        'ж' -> return "zh"
        'з' -> return "z"
        'и' -> return "i"
        'й' -> return "i"
        'к' -> return "k"
        'л' -> return "l"
        'м' -> return "m"
        'н' -> return "n"
        'о' -> return "o"
        'п' -> return "p"
        'р' -> return "r"
        'с' -> return "s"
        'т' -> return "t"
        'у' -> return "u"
        'ф' -> return "f"
        'х' -> return "h"
        'ц' -> return "c"
        'ч' -> return "ch"
        'ш' -> return "sh"
        'щ' -> return "sh"
        'ъ' -> return ""
        'ы' -> return "i"
        'ь' -> return ""
        'э' -> return "e"
        'ю' -> return "yu"
        'я' -> return "ya"
        ' ' -> return divider
        else -> return "$c"
    }
}