// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import kotlin.Int
import kotlin.Number
import kotlin.String
import kotlin.Suppress

fun BaseStyleContext.textDecorationColor(color: Color) {
    writeStyleProperty("text-decoration-color", color)
}

fun BaseStyleContext.textDecorationColor(hexString: String) {
    writeStyleProperty("text-decoration-color", Color(hexString))
}

fun BaseStyleContext.textDecorationColor(
    r: Int,
    g: Int,
    b: Int
) {
    writeStyleProperty("text-decoration-color", Color(r, g, b))
}

fun BaseStyleContext.textDecorationColor(
    r: Int,
    g: Int,
    b: Int,
    a: Number
) {
    writeStyleProperty("text-decoration-color", Color(r, g, b, a))
}
