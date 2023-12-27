package inaction.chap2.iter


fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz  "
    i % 3 == 0 -> "Fizz  "
    i % 5 == 0 -> "Buzz  "
    else -> "$i  "
}


fun some(){
    for (i in 1 downTo -100 step 2){
        print(fizzBuzz(i))
    }
}
