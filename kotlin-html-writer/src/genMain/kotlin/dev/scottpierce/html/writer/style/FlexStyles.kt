// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Number
import kotlin.String
import kotlin.Suppress

fun BaseStyleContext.flex(
    flexGrow: Number,
    flexShrink: Number,
    flexBasis: Dimension
) {
    writeStyleProperty("flex", """$flexGrow $flexShrink $flexBasis""")
}

fun BaseStyleContext.flex(
    flexGrow: Number,
    flexShrink: Number,
    flexBasis: FlexBasis
) {
    writeStyleProperty("flex", """$flexGrow $flexShrink $flexBasis""")
}

fun BaseStyleContext.flex(value: Flex) {
    writeStyleProperty("flex", value)
}

fun StyleContext.flex(
    flexGrow: Number,
    flexShrink: Number,
    flexBasis: Dimension
) {
    writeStyleProperty("flex", """$flexGrow $flexShrink $flexBasis""")
}

fun StyleContext.flex(
    flexGrow: Number,
    flexShrink: Number,
    flexBasis: FlexBasis
) {
    writeStyleProperty("flex", """$flexGrow $flexShrink $flexBasis""")
}

fun StyleContext.flex(value: Flex) {
    writeStyleProperty("flex", value)
}

fun InlineStyleContext.flex(
    flexGrow: Number,
    flexShrink: Number,
    flexBasis: Dimension
) {
    writeStyleProperty("flex", """$flexGrow $flexShrink $flexBasis""")
}

fun InlineStyleContext.flex(
    flexGrow: Number,
    flexShrink: Number,
    flexBasis: FlexBasis
) {
    writeStyleProperty("flex", """$flexGrow $flexShrink $flexBasis""")
}

fun InlineStyleContext.flex(value: Flex) {
    writeStyleProperty("flex", value)
}

enum class Flex(
    val value: String
) {
    AUTO("auto"),

    INITIAL("initial"),

    INHERIT("inherit"),

    NONE("none");

    override fun toString() = value
}
