package dev.scottpierce.html.write

internal actual object PlatformWriter {
    actual val lineSeparator: String
        get() = System.lineSeparator()
}