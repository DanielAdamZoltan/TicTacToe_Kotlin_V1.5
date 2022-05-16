import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLInputElement
import react.create
import react.dom.render



//var b1 = getElementByIdB1





//fun check() {



//    window.alert("Mukodik")


//    var showPlayerInfo: String = (document.getElementById("showPlayerInfo") as HTMLInputElement).innerHTML
//
//    val playerXWon = "Játékos X nyert!"
//    val playerOWon = "Játékos O nyert!"



//    val b1DisableInput = (document.getElementById("b1") as HTMLInputElement)
//    val b2DisableInput = (document.getElementById("b2") as HTMLInputElement)
//    val b3DisableInput = (document.getElementById("b3") as HTMLInputElement)
//    val b4DisableInput = (document.getElementById("b4") as HTMLInputElement)
//    val b5DisableInput = (document.getElementById("b5") as HTMLInputElement)
//    val b6DisableInput = (document.getElementById("b6") as HTMLInputElement)
//    val b7DisableInput = (document.getElementById("b7") as HTMLInputElement)
//    val b8DisableInput = (document.getElementById("b8") as HTMLInputElement)
//    val b9DisableInput = (document.getElementById("b9") as HTMLInputElement)

//    if ((b1 == "x" || b1 == "X") && (b2 == "x" ||
//                b2 == "X") && (b3 == "x" || b3 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB4.disabled=true
//        getElementByIdB5.disabled=true
//        getElementByIdB6.disabled=true
//        getElementByIdB7.disabled=true
//        getElementByIdB8.disabled=true
//        getElementByIdB9.disabled=true
//        window.alert(playerXWon)
//
//
//        document.getElementById("b2").setAttribute("disabled","")
//        document.getElementById("b2").disabled=true
//    }
//    else if ((b1 == "x" || b1 == "X") && (b4 == "x" ||
//                b4 == "X") && (b7 == "x" || b7 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b7 == "x" || b7 == "X") && (b8 == "x" ||
//                b8 == "X") && (b9 == "x" || b9 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB6.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b3 == "x" || b3 == "X") && (b6 == "x" ||
//                b6 == "X") && (b9 == "x" || b9 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b1 == "x" || b1 == "X") && (b5 == "x" ||
//                b5 == "X") && (b9 == "x" || b9 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b3 == "x" || b3 == "X") && (b5 == "x" ||
//                b5 == "X") && (b7 == "x" || b7 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b2 == "x" || b2 == "X") && (b5 == "x" ||
//                b5 == "X") && (b8 == "x" || b8 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB1.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b4 == "x" || b4 == "X") && (b5 == "x" ||
//                b5 == "X") && (b6 == "x" || b6 == "X")) {
//        showPlayerInfo==playerXWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerXWon)
//    }
//    else if ((b1 == "0" || b1 == "0") && (b2 == "0" ||
//                b2 == "0") && (b3 == "0" || b3 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB4.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b1 == "0" || b1 == "0") && (b4 == "0" ||
//                b4 == "0") && (b7 == "0" || b7 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b7 == "0" || b7 == "0") && (b8 == "0" ||
//                b8 == "0") && (b9 == "0" || b9 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB6.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b3 == "0" || b3 == "0") && (b6 == "0" ||
//                b6 == "0") && (b9 == "0" || b9 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB5.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b1 == "0" || b1 == "0") && (b5 == "0" ||
//                b5 == "0") && (b9 == "0" || b9 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b3 == "0" || b3 == "0") && (b5 == "0" ||
//                b5 == "0") && (b7 == "0" || b7 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerOWon);
//    }
//    else if ((b2 == "0" || b2 == "0") && (b5 == "0" ||
//                b5 == "0") && (b8 == "0" || b8 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB1.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB4.disabled = true
//        getElementByIdB6.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b4 == "0" || b4 == "0") && (b5 == "0" ||
//                b5 == "0") && (b6 == "0" || b6 == "0")) {
//        showPlayerInfo==playerOWon
//        getElementByIdB1.disabled = true
//        getElementByIdB2.disabled = true
//        getElementByIdB3.disabled = true
//        getElementByIdB7.disabled = true
//        getElementByIdB8.disabled = true
//        getElementByIdB9.disabled = true
//        window.alert(playerOWon)
//    }
//    else if ((b1 == "X" || b1 == "0") && (b2 == "X"
//                || b2 == "0") && (b3 == "X" || b3 == "0") &&
//        (b4 == "X" || b4 == "0") && (b5 == "X" ||
//                b5 == "0") && (b6 == "X" || b6 == "0") &&
//        (b7 == "X" || b7 == "0") && (b8 == "X" ||
//                b8 == "0") && (b9 == "X" || b9 == "0")) {
//        window.alert("Döntetlen")
//    }
//    else {
//        if (flag == 1) {
//            showPlayerInfo == "Player X Turn"
//        }
//        else {
//            showPlayerInfo == "Player 0 Turn"
//        }
//    }
//
//
//}
//
//fun reset() {
//    b1=""
//    b2=""
//    b3=""
//    b4=""
//    b5=""
//    b6=""
//    b7=""
//    b8=""
//    b9=""
//
//}
//
//fun checkButtonOne() {
//    if (flag == 1) {
//        b1 = "X"
//        getElementByIdB1.disabled = true
//        flag = 0
//    } else {
//        b1 = "0"
//        getElementByIdB1.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonTwo() {
//    if (flag == 1) {
//        b2 = "X"
//        getElementByIdB2.disabled = true
//        flag = 0
//    } else {
//        b2 = "0"
//        getElementByIdB2.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonThree() {
//    if (flag == 1) {
//        b3 = "X"
//        getElementByIdB3.disabled = true
//        flag = 0
//    } else {
//        b3 = "0"
//        getElementByIdB3.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonFour() {
//    if (flag == 1) {
//        b4 = "X"
//        getElementByIdB4.disabled = true
//        flag = 0
//    } else {
//        b4 = "0"
//        getElementByIdB4.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonFive() {
//    if (flag == 1) {
//        b5 = "X"
//        getElementByIdB5.disabled = true
//        flag = 0
//    } else {
//        b5 = "0"
//        getElementByIdB5.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonSix() {
//    if (flag == 1) {
//        b6 = "X"
//        getElementByIdB6.disabled = true
//        flag = 0
//    } else {
//        b6 = "0"
//        getElementByIdB6.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonSeven() {
//    if (flag == 1) {
//        b7 = "X"
//        getElementByIdB7.disabled = true
//        flag = 0
//    } else {
//        b7 = "0"
//        getElementByIdB7.disabled = true
//        flag = 1
//    }
//}
//
//fun checkButtonEight() {
//    if (flag == 1) {
//        b8 = "X"
//        getElementByIdB8.disabled = true
//        flag == 0
//    } else {
//        b8 = "0"
//        getElementByIdB8.disabled = true
//        flag == 1
//    }
//}
//
//fun checkButtonNine() {
//    if (flag == 1) {
//        b9 = "X"
//        getElementByIdB9.disabled = true
//        flag = 0
//    } else {
//        b9 = "0"
//        getElementByIdB9.disabled = true
//        flag = 1
//    }
//}

fun main() {
    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val welcome = Index.create {
    }
    render(welcome, container)



}

