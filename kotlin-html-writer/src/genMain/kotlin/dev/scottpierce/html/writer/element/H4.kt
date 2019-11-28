// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
package dev.scottpierce.html.writer.element

import dev.scottpierce.html.writer.BodyContext
import dev.scottpierce.html.writer.HtmlDsl
import dev.scottpierce.html.writer.HtmlWriter
import dev.scottpierce.html.writer.InlineStyleLambda
import dev.scottpierce.html.writer.pageWriterScope
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@HtmlDsl
inline fun HtmlWriter.h4(
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: BodyContext.() -> Unit = {}
) {
    pageWriterScope(this) {
        writeNormalElementStart("h4", id, classes, style)
        func()
        writeNormalElementEnd("h4")
    }
}

@HtmlDsl
inline fun HtmlWriter.h4(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: BodyContext.() -> Unit = {}
) {
    pageWriterScope(this) {
        writeNormalElementStart("h4", id, classes, style, attrs)
        func()
        writeNormalElementEnd("h4")
    }
}

@HtmlDsl
inline fun HtmlWriter.h4(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: BodyContext.() -> Unit = {}
) {
    pageWriterScope(this) {
        writeNormalElementStart("h4", id, classes, style, attrs)
        func()
        writeNormalElementEnd("h4")
    }
}

@HtmlDsl
inline fun BodyContext.h4(
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: BodyContext.() -> Unit = {}
) {
    writeNormalElementStart("h4", id, classes, style)
    func()
    writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun BodyContext.h4(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: BodyContext.() -> Unit = {}
) {
    writeNormalElementStart("h4", id, classes, style, attrs)
    func()
    writeNormalElementEnd("h4")
}

@HtmlDsl
inline fun BodyContext.h4(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: BodyContext.() -> Unit = {}
) {
    writeNormalElementStart("h4", id, classes, style, attrs)
    func()
    writeNormalElementEnd("h4")
}
