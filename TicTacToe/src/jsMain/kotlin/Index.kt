import csstype.*
import io.ktor.util.*
import io.ktor.util.reflect.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.w3c.dom.HTMLInputElement
import react.FC
import react.Props
import react.css.css
import react.dom.events.MouseEvent
import react.dom.html.ButtonHTMLAttributes
import react.dom.html.InputType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.p
import react.useState


//fun checkButtonOne() {
//    if (flag == 1) {
//        b1.value = "X"
//        b1.disabled = true
//        flag = 0
//    } else {
//        b1.value = "0"
//        b1.disabled = true
//        flag = 1
//    }
//}

external interface IndexProps : Props {
    var name: String
}




var flag = 1;
//
fun check() {


val b1 = document.getElementById("b1") as HTMLInputElement
val b2 = document.getElementById("b2") as HTMLInputElement
val b3 = document.getElementById("b3") as HTMLInputElement
val b4 = document.getElementById("b4") as HTMLInputElement
val b5 = document.getElementById("b5") as HTMLInputElement
val b6 = document.getElementById("b6") as HTMLInputElement
val b7 = document.getElementById("b7") as HTMLInputElement
val b8 = document.getElementById("b8") as HTMLInputElement
val b9 = document.getElementById("b9") as HTMLInputElement


    val showPlayerInfo = document.getElementById("showPlayerInfo") as HTMLInputElement



    val playerXWon = "Játékos X nyert!"
    val playerOWon = "Játékos O nyert!"

//    b1.value = "X"



        if ((b1.value == "x" || b1.value == "X") && (b2.value == "x" ||
                b2.value == "X") && (b3.value == "x" || b3.value == "X")) {
        showPlayerInfo.value=playerXWon

        b4.disabled=true
        b5.disabled=true
        b6.disabled=true
        b7.disabled=true
        b8.disabled=true
        b9.disabled=true
        window.alert(playerXWon)


    }
    else if ((b1.value == "x" || b1.value == "X") && (b4.value == "x" ||
                b4.value == "X") && (b7.value == "x" || b7.value == "X")) {
        showPlayerInfo.value=playerXWon
            b2.disabled = true
            b3.disabled = true
            b5.disabled = true
            b6.disabled = true
            b8.disabled = true
            b9.disabled = true
        window.alert(playerXWon)
    }
    else if ((b7.value == "x" || b7.value == "X") && (b8.value == "x" ||
                b8.value == "X") && (b9.value == "x" || b9.value == "X")) {
        showPlayerInfo.value=playerXWon
        b1.disabled = true
        b2.disabled = true
        b3.disabled = true
        b4.disabled = true
        b5.disabled = true
        b6.disabled = true
        window.alert(playerXWon)
    }
    else if ((b3.value == "x" || b3.value == "X") && (b6.value == "x" ||
                b6.value == "X") && (b9.value == "x" || b9.value == "X")) {
        showPlayerInfo.value=playerXWon
        b1.disabled = true
        b2.disabled = true
        b4.disabled = true
        b5.disabled = true
        b7.disabled = true
        b8.disabled = true
        window.alert(playerXWon)
    }
    else if ((b1.value == "x" || b1.value == "X") && (b5.value == "x" ||
                b5.value == "X") && (b9.value == "x" || b9.value == "X")) {
        showPlayerInfo.value=playerXWon
        b2.disabled = true
        b3.disabled = true
        b4.disabled = true
        b6.disabled = true
        b7.disabled = true
        b8.disabled = true
        window.alert(playerXWon)
    }
    else if ((b3.value == "x" || b3.value == "X") && (b5.value == "x" ||
                b5.value == "X") && (b7.value == "x" || b7.value == "X")) {
        showPlayerInfo.value=playerXWon
        b1.disabled = true
        b2.disabled = true
        b4.disabled = true
        b6.disabled = true
        b8.disabled = true
        b9.disabled = true
        window.alert(playerXWon)
    }
    else if ((b2.value == "x" || b2.value == "X") && (b5.value == "x" ||
                b5.value == "X") && (b8.value == "x" || b8.value == "X")) {
        showPlayerInfo.value=playerXWon
        b1.disabled = true
        b3.disabled = true
        b4.disabled = true
        b6.disabled = true
        b7.disabled = true
        b9.disabled = true
        window.alert(playerXWon)
    }
    else if ((b4.value == "x" || b4.value == "X") && (b5.value == "x" ||
                b5.value == "X") && (b6.value == "x" || b6.value == "X")) {
        showPlayerInfo.value=playerXWon
        b1.disabled = true
        b2.disabled = true
        b3.disabled = true
        b7.disabled = true
        b8.disabled = true
        b9.disabled = true
        window.alert(playerXWon)
    }
    else if ((b1.value == "0" || b1.value == "0") && (b2.value == "0" ||
                b2.value == "0") && (b3.value == "0" || b3.value == "0")) {
        showPlayerInfo.value=playerOWon
        b4.disabled = true
        b5.disabled = true
        b6.disabled = true
        b7.disabled = true
        b8.disabled = true
        b9.disabled = true
        window.alert(playerOWon)
    }
    else if ((b1.value == "0" || b1.value == "0") && (b4.value == "0" ||
                b4.value == "0") && (b7.value == "0" || b7.value == "0")) {
        showPlayerInfo.value=playerOWon
        b2.disabled = true
        b3.disabled = true
        b5.disabled = true
        b6.disabled = true
        b8.disabled = true
        b9.disabled = true
        window.alert(playerOWon)
    }
    else if ((b7.value == "0" || b7.value == "0") && (b8.value == "0" ||
                b8.value == "0") && (b9.value == "0" || b9.value == "0")) {
        showPlayerInfo.value=playerOWon
        b1.disabled = true
        b2.disabled = true
        b3.disabled = true
        b4.disabled = true
        b5.disabled = true
        b6.disabled = true
        window.alert(playerOWon)
    }
    else if ((b3.value == "0" || b3.value == "0") && (b6.value == "0" ||
                b6.value == "0") && (b9.value == "0" || b9.value == "0")) {
        showPlayerInfo.value=playerOWon
        b1.disabled = true
        b2.disabled = true
        b4.disabled = true
        b5.disabled = true
        b7.disabled = true
        b8.disabled = true
        window.alert(playerOWon)
    }
    else if ((b1.value == "0" || b1.value == "0") && (b5.value == "0" ||
                b5.value == "0") && (b9.value == "0" || b9.value == "0")) {
        showPlayerInfo.value=playerOWon
        b2.disabled = true
        b3.disabled = true
        b4.disabled = true
        b6.disabled = true
        b7.disabled = true
        b8.disabled = true
        window.alert(playerOWon)
    }
    else if ((b3.value == "0" || b3.value == "0") && (b5.value == "0" ||
                b5.value == "0") && (b7.value == "0" || b7.value == "0")) {
        showPlayerInfo.value=playerOWon
        b1.disabled = true
        b2.disabled = true
        b4.disabled = true
        b6.disabled = true
        b8.disabled = true
        b9.disabled = true
        window.alert(playerOWon);
    }
    else if ((b2.value == "0" || b2.value == "0") && (b5.value == "0" ||
                b5.value == "0") && (b8.value == "0" || b8.value == "0")) {
        showPlayerInfo.value=playerOWon
        b1.disabled = true
        b3.disabled = true
        b4.disabled = true
        b6.disabled = true
        b7.disabled = true
        b9.disabled = true
        window.alert(playerOWon)
    }
    else if ((b4.value == "0" || b4.value == "0") && (b5.value == "0" ||
                b5.value == "0") && (b6.value == "0" || b6.value == "0")) {
        showPlayerInfo.value=playerOWon
        b1.disabled = true
        b2.disabled = true
        b3.disabled = true
        b7.disabled = true
        b8.disabled = true
        b9.disabled = true
        window.alert(playerOWon)
    }
    else if ((b1.value == "X" || b1.value == "0") && (b2.value == "X"
                || b2.value == "0") && (b3.value == "X" || b3.value == "0") &&
        (b4.value == "X" || b4.value == "0") && (b5.value == "X" ||
                b5.value == "0") && (b6.value == "X" || b6.value == "0") &&
        (b7.value == "X" || b7.value == "0") && (b8.value == "X" ||
                b8.value == "0") && (b9.value == "X" || b9.value == "0")) {
        window.alert("Döntetlen")
    }
    else {
        if (flag == 1) {
            showPlayerInfo.value= "Player X Turn"
        }
        else {
            showPlayerInfo.value= "Player 0 Turn"
        }
    }



}

fun reset() {

val b1 = document.getElementById("b1") as HTMLInputElement
val b2 = document.getElementById("b2") as HTMLInputElement
val b3 = document.getElementById("b3") as HTMLInputElement
val b4 = document.getElementById("b4") as HTMLInputElement
val b5 = document.getElementById("b5") as HTMLInputElement
val b6 = document.getElementById("b6") as HTMLInputElement
val b7 = document.getElementById("b7") as HTMLInputElement
val b8 = document.getElementById("b8") as HTMLInputElement
val b9 = document.getElementById("b9") as HTMLInputElement

    b1.value = ""
    b2.value = ""
    b3.value = ""
    b4.value = ""
    b5.value = ""
    b6.value = ""
    b7.value = ""
    b8.value = ""
    b9.value = ""
    b1.disabled = false
    b2.disabled = false
    b3.disabled = false
    b4.disabled = false
    b5.disabled = false
    b6.disabled = false
    b7.disabled = false
    b8.disabled = false
    b9.disabled = false
}




fun checkButtonOne() {
    val b1 = document.getElementById("b1") as HTMLInputElement
    if (flag == 1) {
        b1.value = "X"
        b1.disabled = true
        flag = 0
    } else {
        b1.value = "0"
        b1.disabled = true
        flag = 1
}
}

fun checkButtonTwo() {
    val b2 = document.getElementById("b2") as HTMLInputElement
    if (flag == 1) {
        b2.value = "X"
        b2.disabled = true
        flag = 0
    } else {
        b2.value = "0"
        b2.disabled = true
        flag = 1
    }
}

fun checkButtonThree() {
    val b3 = document.getElementById("b3") as HTMLInputElement
    if (flag == 1) {
        b3.value = "X"
        b3.disabled = true
        flag = 0
    } else {
        b3.value = "0"
        b3.disabled = true
        flag = 1
    }
}

fun checkButtonFour() {
    val b4 = document.getElementById("b4") as HTMLInputElement
    if (flag == 1) {
        b4.value = "X"
        b4.disabled = true
        flag = 0
    } else {
        b4.value = "0"
        b4.disabled = true
        flag = 1
    }
}

fun checkButtonFive() {
    val b5 = document.getElementById("b5") as HTMLInputElement
    if (flag == 1) {
        b5.value = "X"
        b5.disabled = true
        flag = 0
    } else {
        b5.value = "0"
        b5.disabled = true
        flag = 1
    }
}

fun checkButtonSix() {
    val b6 = document.getElementById("b6") as HTMLInputElement
    if (flag == 1) {
        b6.value = "X"
        b6.disabled = true
        flag = 0
    } else {
        b6.value = "0"
        b6.disabled = true
        flag = 1
    }
}

fun checkButtonSeven() {
    val b7 = document.getElementById("b7") as HTMLInputElement
    if (flag == 1) {
        b7.value = "X"
        b7.disabled = true
        flag = 0
    } else {
        b7.value = "0"
        b7.disabled = true
        flag = 1
    }
}

fun checkButtonEight() {
    val b8 = document.getElementById("b8") as HTMLInputElement
    if (flag == 1) {
        b8.value = "X"
        b8.disabled = true
        flag == 0
    } else {
        b8.value = "0"
        b8.disabled = true
        flag == 1
    }
}

fun checkButtonNine() {
    val b9 = document.getElementById("b9") as HTMLInputElement
    if (flag == 1) {
        b9.value = "X"
        b9.disabled = true
        flag = 0
    } else {
        b9.value = "0"
        b9.disabled = true
        flag = 1
    }
}


val Index = FC<IndexProps> { props ->
    var name by useState(props.name)



    div {
        css {
            padding = 5.px
            backgroundColor = rgb(0,191,255)


        }
        +"Tic Tac Toe Game"
    }
    div {

        css {
            backgroundColor = rgb(0, 0, 0)
            textAlign = TextAlign.center
        }

        div {
            css {
                marginBottom = 5.px
            }


//            button{
//                id = "getElementByIdB1"
//
//                InputComponent{
//                    onSubmit = {
//                        input -> val step = Step(input.replace("","X"), input.replace("",""))
//                    }
//                }
//
//                onClick = { event -> name== HtmlAttributes.value.toString() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }
//            button{
//                id = "getElementByIdB2"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }
//            button{
//                id = "getElementByIdB3"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }


//            InputComponent {
//                onSubmit = {
//                    input -> val step =
//                }
//            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b1"
                onClick = { event -> check() }
                onClick = { event -> checkButtonOne() }
                readOnly
            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b2"
                onClick = { event -> check() }
                onClick = { event -> checkButtonTwo() }
                readOnly
            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b3"
                onClick = { event -> check() }
                onClick = { event -> checkButtonThree() }
                readOnly
            }

        }
        div {
            css {
                marginBottom = 5.px
            }

//            button{
//                id = "getElementByIdB4"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }
//            button{
//                id = "getElementByIdB5"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }
//            button{
//                id = "getElementByIdB6"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }

            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b4"
                onClick = { event -> check() }
                onClick = { event -> checkButtonFour() }
                readOnly
            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b5"
                onClick = { event -> check() }
                onClick = { event -> checkButtonFive() }
                readOnly
            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b6"
                onClick = { event -> check() }
                onClick = { event -> checkButtonSix() }
                readOnly
            }


        }
        div {
            css {
                marginBottom = 5.px
            }

//            button{
//                id = "getElementByIdB7"
//                onClick = { _ -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }
//            button{
//                id = "getElementById8"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }
//            button{
//                id = "getElementById9"
//                onClick = {event -> check() }
//                css {
//                    width = 100.px
//                    height= 100.px
//                    marginRight= 10.px
//                    border= 1.px; NamedColor.gray; borderBlock
//                    borderRadius= 6.px
//                    fontSize= 30.px
//                    textAlign= TextAlign.center
//                }
//            }

            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b7"
                onClick = { event -> check() }
                onClick = { event -> checkButtonSeven() }
                readOnly
            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b8"
                onClick = { event -> check() }
                onClick = { event -> checkButtonEight() }
                readOnly
            }
            input {
                css {
                    width = 100.px
                    height = 100.px
                    marginRight = 10.px
                    border = 1.px; NamedColor.gray; borderBlock
                    borderRadius = 6.px
                    fontSize = 30.px
                    textAlign = TextAlign.center
                }
                type = InputType.text
                id = "b9"
                onClick = { event -> check() }
                onClick = { event -> checkButtonNine() }
                readOnly
            }


        }

    }

    div{
        p{
            id="showPlayerInfo"
        }
    }

    div{
        button{
            "Reset"
            id = "resetGame"
            onClick = { event -> reset() }
        }
    }
}