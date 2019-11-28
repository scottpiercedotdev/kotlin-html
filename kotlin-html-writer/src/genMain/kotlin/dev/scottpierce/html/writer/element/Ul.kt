// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
package dev.scottpierce.html.writer.element

import dev.scottpierce.html.writer.BodyContext
import dev.scottpierce.html.writer.HtmlDsl
import dev.scottpierce.html.writer.HtmlWriter
import dev.scottpierce.html.writer.InlineStyleLambda
import dev.scottpierce.html.writer.UlContext
import dev.scottpierce.html.writer.pageWriterScope
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@HtmlDsl
inline fun HtmlWriter.ul(
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: UlContext.() -> Unit = {}
) {
    pageWriterScope(this) {
        writeNormalElementStart("ul", id, classes, style)
        func()
        writeNormalElementEnd("ul")
    }
}

@HtmlDsl
inline fun HtmlWriter.ul(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: UlContext.() -> Unit = {}
) {
    pageWriterScope(this) {
        writeNormalElementStart("ul", id, classes, style, attrs)
        func()
        writeNormalElementEnd("ul")
    }
}

@HtmlDsl
inline fun HtmlWriter.ul(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: UlContext.() -> Unit = {}
) {
    pageWriterScope(this) {
        writeNormalElementStart("ul", id, classes, style, attrs)
        func()
        writeNormalElementEnd("ul")
    }
}

@HtmlDsl
inline fun BodyContext.ul(
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: UlContext.() -> Unit = {}
) {
    writeNormalElementStart("ul", id, classes, style)
    (this as UlContext).apply(func)
    writeNormalElementEnd("ul")
}

@HtmlDsl
inline fun BodyContext.ul(
    vararg attrs: Pair<String, String?>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: UlContext.() -> Unit = {}
) {
    writeNormalElementStart("ul", id, classes, style, attrs)
    (this as UlContext).apply(func)
    writeNormalElementEnd("ul")
}

@HtmlDsl
inline fun BodyContext.ul(
    attrs: List<Pair<String, String?>>,
    id: String? = null,
    classes: String? = null,
    noinline style: InlineStyleLambda? = null,
    func: UlContext.() -> Unit = {}
) {
    writeNormalElementStart("ul", id, classes, style, attrs)
    (this as UlContext).apply(func)
    writeNormalElementEnd("ul")
}
