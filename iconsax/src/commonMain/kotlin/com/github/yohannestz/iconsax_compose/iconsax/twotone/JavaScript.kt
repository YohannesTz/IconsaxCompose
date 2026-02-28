package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JavaScript: ImageVector
    get() {
        val current = _javaScript
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.JavaScript",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 4.12f, y = 2.0f)
                horizontalLineToRelative(dx = 15.77f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = 1.11f)
                lineToRelative(dx = -1.8f, dy = 16.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.85f)
                lineToRelative(dx = -6.08f, dy = 1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = 0.0f)
                lineToRelative(dx = -6.08f, dy = -1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = -0.85f)
                lineTo(x = 3.13f, y = 3.11f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.12f, y1 = 2.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 10.62f, y = 7.01f)
                verticalLineTo(y = 16.0f)
                lineTo(x = 7.5f, y = 15.1f)
                moveToRelative(dx = 9.0f, dy = -8.09f)
                lineToRelative(dx = -3.15f, dy = 0.45f)
                verticalLineToRelative(dy = 4.95f)
                lineToRelative(dx = 3.15f, dy = -0.45f)
                verticalLineToRelative(dy = 3.15f)
                lineTo(x = 12.9f, y = 16.0f)
            }
        }.build().also { _javaScript = it }
    }

@Suppress("ObjectPropertyName")
private var _javaScript: ImageVector? = null
