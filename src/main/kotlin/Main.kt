fun main(args: Array<String>) {
    var text:String = "${args.get(0)}"
    var sum : Int = 0
    for(i: Int in 0..args.size step(1)) {   // 0에서 1 씩 증가
        text += " + ${args.get(i)}"
        sum += args.get(i)

    }
    println(text +"= $sum")
}