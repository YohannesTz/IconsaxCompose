package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BookmarkTwo: ImageVector
    get() {
        val current = _bookmarkTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BookmarkTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.0f, y = 2.0f)
                quadToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 3.0f, dy2 = 3.03f)
                verticalLineToRelative(dy = 7.05f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.99f, dx2 = -1.41f, dy2 = 2.76f, dx3 = -3.14f, dy3 = 1.72f)
                lineTo(x = 12.54f, y = 13.0f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.08f, dy1 = 0.0f)
                lineToRelative(dx = -1.32f, dy = 0.8f)
                curveTo(x1 = 8.41f, y1 = 14.84f, x2 = 7.0f, y2 = 14.07f, x3 = 7.0f, y3 = 12.08f)
                verticalLineTo(y = 5.03f)
                quadTo(x1 = 7.0f, y1 = 2.0f, x2 = 10.0f, y2 = 2.0f)
                close()
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.82f, y = 4.99f)
                curveTo(x1 = 3.41f, y1 = 5.56f, x2 = 2.0f, y2 = 7.66f, x3 = 2.0f, y3 = 11.9f)
                verticalLineToRelative(dy = 3.03f)
                curveTo(x1 = 2.0f, y1 = 19.98f, x2 = 4.0f, y2 = 22.0f, x3 = 9.0f, y3 = 22.0f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 5.0f, dy1 = 0.0f, dx2 = 7.0f, dy2 = -2.02f, dx3 = 7.0f, dy3 = -7.07f)
                verticalLineTo(y = 11.9f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.31f, dx2 = -1.46f, dy2 = -6.42f, dx3 = -5.0f, dy3 = -6.94f)
            }
        }.build().also { _bookmarkTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _bookmarkTwo: ImageVector? = null
