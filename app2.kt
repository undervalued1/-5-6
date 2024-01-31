fun main()
{
    println("Введите число от 0 до 9")
    var a= readLine()!!.toInt()
    when(a)
    {
        0-> println("Ноль")
        1-> println("Один")
        2-> println("Два")
        3-> println("Три")
        4-> println("Четыре")
        5-> println("Пять")
        6-> println("Шесть")
        7-> println("Семь")
        8-> println("Восемь")
        9-> println("Девять")
    }
    when(a>9||a<0)
    {
        true-> println("Число не подходит требованиям")
    }

}