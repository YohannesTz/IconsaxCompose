package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HtmlThree: ImageVector
    get() {
        val current = _htmlThree
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HtmlThree",
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
                moveTo(x = 7.5f, y = 6.98f)
                lineToRelative(dx = 9.0f, dy = 0.02f)
                lineToRelative(dx = -1.0f, dy = 9.0f)
                lineToRelative(dx = -3.5f, dy = 1.0f)
                lineToRelative(dx = -3.5f, dy = -1.0f)
                lineTo(x = 8.0f, y = 14.0f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                horizontalLineToRelative(dx = 8.06f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.32f, y = 4.91f)
                lineToRelative(dx = -0.2f, dy = -1.8f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.11f, y1 = 2.0f)
                horizontalLineToRelative(dx = 15.77f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.99f, dy1 = 1.11f)
                lineToRelative(dx = -1.8f, dy = 16.22f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 0.85f)
                lineToRelative(dx = -6.08f, dy = 1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = 0.0f)
                lineToRelative(dx = -6.08f, dy = -1.74f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = -0.85f)
                lineToRelative(dx = -1.1f, dy = -9.92f)
            }
        }.build().also { _htmlThree = it }
    }

@Suppress("ObjectPropertyName")
private var _htmlThree: ImageVector? = null
