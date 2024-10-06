package com.daniilpuris.Lesson9

//   ССССССССС        ддддддд     н       н    еееееееее    м       м       рррррррр      ооооооо     ж   ж   ж     ддддддд     еееееееее    н       н    и      ии     яяяяяяяя      !!!!!
//   С       С       д       д    н       н    е            мм     мм       р       р    о       о    ж   ж   ж    д       д    е            н       н    и     и и    я       я     !!!!!!!
//   С               д       д    н       н    е            м м   м м       р       р    о       о    ж ж ж ж ж    д       д    е            н       н    и    и  и    я       я      !!!!!
//   С               д       д    н       н    еееееее      м  м м  м       рррррррр     о       о       жжж       д       д    еееееее      н       н    и   и   и      яяяяяяя       !!!
//   С               д       д    ннннннннн    е            м   м   м       р            о       о    ж ж ж ж ж    д       д    е            ннннннннн    и  и    и        я   я        !
//   С       С       ддддддддд    н       н    е            м       м       р            о       о    ж   ж   ж    ддддддддд    е            н       н    и и     и      я     я
//   ССССССССС       д       д    н       н    еееееееее    м       м       р             ооооооо     ж   ж   ж    д       д    еееееееее    н       н    ии      и    я       я        !

fun main() {

    val array = arrayOf('О', 'П', "Р", "С")
    val firstLetter = array[3]
    val Spaces: String = "годом неделей днем"
    val secondLetter = Spaces.substring(Spaces.indexOf("днем"))
    var thirdWord = ""
    val сelebrations = "космонавтики программиста рождения"
    for (i in 26 until сelebrations.length) {
        thirdWord += сelebrations[i]
    }
    println("$firstLetter" + " " + "$secondLetter" + " " + "$thirdWord")
}

