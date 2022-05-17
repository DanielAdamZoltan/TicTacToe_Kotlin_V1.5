import csstype.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.w3c.dom.HTMLInputElement
import org.w3c.dom.HTMLParagraphElement
import react.*
import react.css.css
import react.dom.html.InputType
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.form
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.ul

external interface IndexProps : Props {
    var name: String
}

//Check winner if button pressed
fun check() {
    console.log("check Müködik")


val b1 = document.getElementById("b1") as HTMLInputElement
val b2 = document.getElementById("b2") as HTMLInputElement
val b3 = document.getElementById("b3") as HTMLInputElement
val b4 = document.getElementById("b4") as HTMLInputElement
val b5 = document.getElementById("b5") as HTMLInputElement
val b6 = document.getElementById("b6") as HTMLInputElement
val b7 = document.getElementById("b7") as HTMLInputElement
val b8 = document.getElementById("b8") as HTMLInputElement
val b9 = document.getElementById("b9") as HTMLInputElement


    var showPlayerInfo = document.getElementById("showPlayerInfo") as HTMLParagraphElement



    val playerXWon = "Játékos X nyert!"
    val playerOWon = "Játékos O nyert!"

//    b1.value = "X"



        if ((b1.value == "x" || b1.value == "X") && (b2.value == "x" ||
                b2.value == "X") && (b3.value == "x" || b3.value == "X")) {
        showPlayerInfo.innerHTML=playerXWon

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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerXWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        showPlayerInfo.innerHTML=playerOWon
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
        if (actualPlayer == 1) {
            showPlayerInfo.innerHTML= "Player X Turn"
            console.log("Player X Turn")
        }
        else {
            showPlayerInfo.innerHTML= "Player 0 Turn"
            console.log("Player O Turn")
        }
    }



}

//Reset the game
fun reset() {
    console.log("reset")
    document.location?.reload()

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

    actualPlayer = 1;
}

//Variable what use to which player is the next player
var actualPlayer = 1;

//Check First Input which player is clicked the input field
fun checkButtonOne() {
    console.log("Button 1 fun")
    val b1 = document.getElementById("b1") as HTMLInputElement
    if (actualPlayer == 1) {
        b1.value = "X"
        b1.disabled = true
        actualPlayer = 0
    } else {
        b1.value = "0"
        b1.disabled = true
        actualPlayer = 1
    }
    b1.disabled = true
}

//Check Second Input which player is clicked the input field
fun checkButtonTwo() {
    console.log("Button 2 fun")
    val b2 = document.getElementById("b2") as HTMLInputElement
    if (actualPlayer == 1) {
        b2.value = "X"
        b2.disabled = true
        actualPlayer = 0
    } else {
        b2.value = "0"
        b2.disabled = true
        actualPlayer = 1
    }
    b2.disabled = true
}

//Check Third Input which player is clicked the input field
fun checkButtonThree() {
    console.log("Button 3 fun")
    val b3 = document.getElementById("b3") as HTMLInputElement
    if (actualPlayer == 1) {
        b3.value = "X"
        b3.disabled = true
        actualPlayer = 0
    } else {
        b3.value = "0"
        b3.disabled = true
        actualPlayer = 1
    }
    b3.disabled = true
}

//Check Fourth Input which player is clicked the input field
fun checkButtonFour() {
    console.log("Button 4 fun")
    val b4 = document.getElementById("b4") as HTMLInputElement
    if (actualPlayer == 1) {
        b4.value = "X"
        b4.disabled = true
        actualPlayer = 0
    } else {
        b4.value = "0"
        b4.disabled = true
        actualPlayer = 1
    }
    b4.disabled = true
}

//Check Fifth Input which player is clicked the input field
fun checkButtonFive() {
    console.log("Button 5 fun")
    val b5 = document.getElementById("b5") as HTMLInputElement
    if (actualPlayer == 1) {
        b5.value = "X"
        b5.disabled = true
        actualPlayer = 0
    } else {
        b5.value = "0"
        b5.disabled = true
        actualPlayer = 1
    }
    b5.disabled = true
}

//Check Sixth Input which player is clicked the input field
fun checkButtonSix() {
    console.log("Button 6 fun")
    val b6 = document.getElementById("b6") as HTMLInputElement
    if (actualPlayer == 1) {
        b6.value = "X"
        b6.disabled = true
        actualPlayer = 0
    } else {
        b6.value = "0"
        b6.disabled = true
        actualPlayer = 1
    }
    b6.disabled=true
}

//Check Seventh Input which player is clicked the input field
fun checkButtonSeven() {
    console.log("Button 7 fun")
    val b7 = document.getElementById("b7") as HTMLInputElement
    if (actualPlayer == 1) {
        b7.value = "X"
        b7.disabled = true
        actualPlayer = 0
    } else {
        b7.value = "0"
        b7.disabled = true
        actualPlayer = 1
    }
    b7.disabled=true
}

//Check Eighth Input which player is clicked the input field
fun checkButtonEight() {
    console.log("Button 8 fun")
    val b8 = document.getElementById("b8") as HTMLInputElement
    if (actualPlayer == 1) {
        b8.value = "X"
        b8.disabled = true
        actualPlayer = 0
    } else {
        b8.value = "0"
        b8.disabled = true
        actualPlayer = 1
    }
    b8.disabled=true
}

//Check Ninth Input which player is clicked the input field
fun checkButtonNine() {
    console.log("Button 9 fun")
    val b9 = document.getElementById("b9") as HTMLInputElement
    if (actualPlayer == 1) {
        b9.value = "X"
        b9.disabled = true
        actualPlayer = 0
    } else {
        b9.value = "0"
        b9.disabled = true
        actualPlayer = 1
    }
    b9.disabled=true
}

private val scope = MainScope()


val Index = FC<IndexProps> { props ->
    var game by useState(emptyList<Games>())
    var step by useState(emptyList<Steps>())

    div {
        css {
            padding = 5.px
            backgroundColor = rgb(0,191,255)


        }
        +"Tic Tac Toe Game"
    }
    div{
        p{
            +"A játék úgy kezdődik, hogy a dobozra kell kattintani."
        }
        br
        p{
            +"Az első játékos X játékosként indul,"
        }
        br
        p{
            +" a második pedig 0 játékosként"
        }


        css { height = 100.px }
    }
    div {

        css {
            backgroundColor = rgb(0, 0, 0)
            textAlign = TextAlign.center
            height = 400.px
            paddingTop = 50.px
        }

        form{
            div {
                css {
                    marginBottom = 5.px
                }



                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b1"

                    onClick = {
                        checkButtonOne()
                        check()
                    }
                    readOnly = true

                }
                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b2"

                    onClick = {
                        checkButtonTwo()
                        check()
                    }
                    readOnly = true
                }
                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b3"

                    onClick = {
                        checkButtonThree()
                        check()
                    }
                    readOnly = true
                }

            }
            div {
                css {
                    marginBottom = 5.px
                }


                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b4"

                    onClick = {
                        checkButtonFour()
                        check()
                    }
                    readOnly = true
                }
                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b5"

                    onClick = {
                        checkButtonFive()
                        check()
                    }
                    readOnly = true
                }
                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b6"

                    onClick = {
                        checkButtonSix()
                        check()
                    }
                    readOnly = true
                }


            }
            div {
                css {
                    marginBottom = 5.px
                }

                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b7"

                    onClick = {
                        checkButtonSeven()
                        check()
                    }
                    readOnly = true
                }
                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b8"

                    onClick = {
                        checkButtonEight()
                        check()
                    }
                    readOnly = true
                }
                input {
                    css {
                        width = 100.px
                        height = 100.px
                        marginRight = 10.px
                        border = 1.px; NamedColor.gray; borderBlock
                        borderRadius = 6.px
                        fontSize = 100.px
                        textAlign = TextAlign.center
                    }
                    type = InputType.text
                    id = "b9"

                    onClick = {
                        checkButtonNine()
                        check()
                    }
                    readOnly = true
                }


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
            +"Új Játék"
            css{
                height = 30.px
                width = 100.px
            }
            id = "resetGame"
            onClick = {
                reset() }
        }
    }
    div{
        ul{
            game.forEach {
                item -> key = item.toString()
                +"${item.winner} ${item.dateCreated}"
                scope.launch {
                    game = getGame()
                }

                li{
                    step.forEach {
                        item -> key = item.toString()
                        +"${item.step}"
                        scope.launch {
                            step = getStep()
                        }

                    }
                }
            }
        }
    }

}