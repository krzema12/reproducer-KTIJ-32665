fun someFunction(): String {
    val builder = StringBuilder()
    builder.append(value = "foobar", startIndex = 1, endIndex = 4)
    return builder.toString()
}
