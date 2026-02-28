package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forward: ImageVector
    get() {
        val current = _forward
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Forward",
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
                moveTo(x = 2.0f, y = 8.34f)
                verticalLineToRelative(dy = 7.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 1.63f, dy2 = 2.44f, dx3 = 2.93f, dy3 = 1.69f)
                lineToRelative(dx = 3.17f, dy = -1.82f)
                lineToRelative(dx = 3.17f, dy = -1.83f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.49f, dy1 = -0.41f)
                verticalLineToRelative(dy = -2.56f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.49f, dy1 = -0.41f)
                lineTo(x = 8.1f, y = 8.49f)
                lineTo(x = 4.93f, y = 6.67f)
                arcTo(horizontalEllipseRadius = 1.94f, verticalEllipseRadius = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.34f)
                moveToRelative(dx = 9.76f, dy = 0.0f)
                verticalLineToRelative(dy = 7.32f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.5f, dx2 = 1.63f, dy2 = 2.44f, dx3 = 2.93f, dy3 = 1.69f)
                lineToRelative(dx = 3.17f, dy = -1.82f)
                lineToRelative(dx = 3.17f, dy = -1.83f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.38f)
                lineToRelative(dx = -3.17f, dy = -1.83f)
                lineToRelative(dx = -3.17f, dy = -1.82f)
                arcToRelative(a = 1.94f, b = 1.94f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.93f, dy1 = 1.67f)
            }
        }.build().also { _forward = it }
    }

@Suppress("ObjectPropertyName")
private var _forward: ImageVector? = null
