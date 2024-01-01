package effective.item17

fun call(before: ()-> Unit = {}, after: ()-> Unit ={}){
    before()
    print("Middle")
    after()
}