package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagCross: ImageVector
    get() {
        val current = _bagCross
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagCross",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 19.24f, y = 5.58f)
                horizontalLineToRelative(dx = -0.4f)
                lineTo(x = 15.46f, y = 2.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.99f)
                lineToRelative(dx = 2.39f, dy = 2.39f)
                horizontalLineTo(x = 7.14f)
                lineToRelative(dx = 2.39f, dy = -2.4f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.98f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.0f)
                lineTo(x = 5.17f, y = 5.58f)
                horizontalLineToRelative(dx = -0.4f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -2.77f, dy2 = 0.0f, dx3 = -2.77f, dy3 = 2.56f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.97f, dx2 = 0.2f, dy2 = 1.6f, dx3 = 0.62f, dy3 = 2.03f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.84f, dy1 = 0.45f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.9f, dy1 = 0.08f)
                horizontalLineToRelative(dx = 15.28f)
                quadToRelative(dx1 = 0.46f, dy1 = 0.0f, dx2 = 0.88f, dy2 = -0.08f)
                curveToRelative(dx1 = 0.84f, dy1 = -0.2f, dx2 = 1.48f, dy2 = -0.8f, dx3 = 1.48f, dy3 = -2.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.56f, dx2 = -1.87f, dy2 = -2.56f, dx3 = -2.76f, dy3 = -2.56f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.66f, y = 10.7f)
                horizontalLineTo(x = 4.36f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -0.09f)
                lineToRelative(dx = 1.26f, dy = 7.69f)
                curveTo(x1 = 5.01f, y1 = 20.02f, x2 = 5.76f, y2 = 22.0f, x3 = 9.09f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.61f)
                curveToRelative(dx1 = 3.37f, dy1 = 0.0f, dx2 = 3.97f, dy2 = -1.69f, dx3 = 4.33f, dy3 = -3.58f)
                lineToRelative(dx = 1.51f, dy = -7.81f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.88f, dy1 = 0.09f)
                moveToRelative(dx = -5.74f, dy = 7.19f)
                quadToRelative(dx1 = -0.23f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                lineToRelative(dx = -0.85f, dy = -0.85f)
                lineToRelative(dx = -0.88f, dy = 0.88f)
                quadToRelative(dx1 = -0.24f, dy1 = 0.22f, dx2 = -0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = -0.29f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 0.88f, dy = -0.88f)
                lineToRelative(dx = -0.85f, dy = -0.85f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.85f, dy = 0.85f)
                lineToRelative(dx = 0.82f, dy = -0.82f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -0.82f, dy = 0.82f)
                lineToRelative(dx = 0.85f, dy = 0.85f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
            }
        }.build().also { _bagCross = it }
    }

@Suppress("ObjectPropertyName")
private var _bagCross: ImageVector? = null
