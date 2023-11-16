fun main() {
    print("Введите натуральное число: ")
    val number = readln().toInt()

    var sum = number
    var result = " "

    while (sum > 0) {
        val ostatok = sum % 2
        result = "$ostatok$result"
        sum /= 2
    }
    print("Число $number в двоичной системе счисления $result")
}