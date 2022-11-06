package kotlin15

fun main(){
    var age = 17
    if(age >= 21){
        print("now you may drink in the US")
    }
    else if(age >= 18){
        print("now you may vote")
    }
    else if (age >= 16){
        print("you now may drive")
    }
    else{
        print("you're too young")
    }
}