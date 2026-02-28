package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarSlash: ImageVector
    get() {
        val current = _starSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.StarSlash",
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
                moveTo(x = 16.05f, y = 7.67f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.55f, dy1 = -0.64f)
                lineToRelative(dx = -1.76f, dy = -3.52f)
                curveToRelative(dx1 = -0.95f, dy1 = -1.91f, dx2 = -2.51f, dy2 = -1.91f, dx3 = -3.47f, dy3 = 0.0f)
                lineTo(x = 8.5f, y = 7.03f)
                arcTo(horizontalEllipseRadius = 2.0f, verticalEllipseRadius = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.91f, y1 = 7.7f)
                moveTo(x = 5.28f, y = 18.65f)
                lineToRelative(dx = 0.57f, dy = -2.47f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.52f, dy1 = -1.81f)
                lineToRelative(dx = -2.48f, dy = -2.48f)
                curveTo(x1 = 1.39f, y1 = 10.43f, x2 = 1.86f, y2 = 8.95f, x3 = 3.9f, y3 = 8.61f)
                moveToRelative(dx = 16.2f, dy = 0.0f)
                curveToRelative(dx1 = 2.04f, dy1 = 0.34f, dx2 = 2.52f, dy2 = 1.82f, dx3 = 1.05f, dy3 = 3.28f)
                lineToRelative(dx = -2.48f, dy = 2.48f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.52f, dy1 = 1.81f)
                lineToRelative(dx = 0.71f, dy = 3.07f)
                curveToRelative(dx1 = 0.56f, dy1 = 2.43f, dx2 = -0.73f, dy2 = 3.37f, dx3 = -2.88f, dy3 = 2.1f)
                lineToRelative(dx = -2.99f, dy = -1.77f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.98f, dy1 = 0.0f)
                lineToRelative(dx = -2.99f, dy = 1.77f)
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _starSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _starSlash: ImageVector? = null
