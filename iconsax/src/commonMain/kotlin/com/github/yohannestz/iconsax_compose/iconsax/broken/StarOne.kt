package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StarOne: ImageVector
    get() {
        val current = _starOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.StarOne",
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
                moveTo(x = 20.1f, y = 8.61f)
                curveToRelative(dx1 = 2.04f, dy1 = 0.34f, dx2 = 2.52f, dy2 = 1.82f, dx3 = 1.05f, dy3 = 3.28f)
                lineToRelative(dx = -2.48f, dy = 2.48f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.52f, dy1 = 1.81f)
                lineToRelative(dx = 0.71f, dy = 3.07f)
                curveToRelative(dx1 = 0.56f, dy1 = 2.43f, dx2 = -0.73f, dy2 = 3.37f, dx3 = -2.88f, dy3 = 2.1f)
                lineToRelative(dx = -2.99f, dy = -1.77f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.98f, dy1 = 0.0f)
                lineToRelative(dx = -2.99f, dy = 1.77f)
                curveToRelative(dx1 = -2.14f, dy1 = 1.27f, dx2 = -3.44f, dy2 = 0.32f, dx3 = -2.88f, dy3 = -2.1f)
                lineToRelative(dx = 0.71f, dy = -3.07f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.52f, dy1 = -1.81f)
                lineToRelative(dx = -2.48f, dy = -2.48f)
                curveTo(x1 = 1.39f, y1 = 10.43f, x2 = 1.86f, y2 = 8.95f, x3 = 3.9f, y3 = 8.61f)
                lineToRelative(dx = 3.19f, dy = -0.53f)
                arcTo(horizontalEllipseRadius = 2.2f, verticalEllipseRadius = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 8.5f, y1 = 7.03f)
                lineToRelative(dx = 1.76f, dy = -3.52f)
                curveToRelative(dx1 = 0.95f, dy1 = -1.91f, dx2 = 2.51f, dy2 = -1.91f, dx3 = 3.47f, dy3 = 0.0f)
                lineToRelative(dx = 1.76f, dy = 3.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.49f, dy1 = 0.59f)
            }
        }.build().also { _starOne = it }
    }

@Suppress("ObjectPropertyName")
private var _starOne: ImageVector? = null
