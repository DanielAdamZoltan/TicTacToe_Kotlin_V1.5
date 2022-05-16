import csstype.*
import io.ktor.util.*
import io.ktor.util.reflect.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.InputType
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.p
import react.useState

external interface IndexProps : Props {
    var name: String
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
//                id = "b1"
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
//                id = "b2"
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
//                id = "b3"
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


            InputComponent {
                onSubmit = {
                    input -> val step =
                }
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
                id = "b1"
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonOne() }
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonTwo() }
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonThree() }
                readOnly
            }

        }
        div {
            css {
                marginBottom = 5.px
            }

//            button{
//                id = "b4"
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
//                id = "b5"
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
//                id = "b6"
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonFour() }
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonFive() }
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonSix() }
                readOnly
            }
        }
        div {
            css {
                marginBottom = 5.px
            }

//            button{
//                id = "b7"
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
//                id = "b8"
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
//                id = "b9"
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonSeven() }
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonEight() }
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
//                onClick = { event -> check() }
//                onClick = {event -> checkButtonNine() }
                readOnly
            }
        }

    }

    div{
        p{
            id="showPlayerInfo"
        }
    }
}