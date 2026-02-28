package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagTickTwo: ImageVector
    get() {
        val current = _bagTickTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagTickTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.96f, y = 8.96f)
                quadToRelative(dx1 = -1.0f, dy1 = -1.1f, dx2 = -3.08f, dy2 = -1.32f)
                verticalLineTo(y = 6.88f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.6f, dy1 = -3.61f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.76f, dy1 = -1.25f)
                curveToRelative(dx1 = -2.39f, dy1 = 0.23f, dx2 = -4.4f, dy2 = 2.54f, dx3 = -4.4f, dy3 = 5.04f)
                verticalLineToRelative(dy = 0.58f)
                quadTo(x1 = 5.03f, y1 = 7.86f, x2 = 4.04f, y2 = 8.96f)
                curveToRelative(dx1 = -0.97f, dy1 = 1.08f, dx2 = -0.94f, dy2 = 2.52f, dx3 = -0.83f, dy3 = 3.52f)
                lineToRelative(dx = 0.7f, dy = 5.57f)
                curveTo(x1 = 4.12f, y1 = 20.0f, x2 = 4.91f, y2 = 22.0f, x3 = 9.21f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.58f)
                curveToRelative(dx1 = 4.3f, dy1 = 0.0f, dx2 = 5.09f, dy2 = -2.0f, dx3 = 5.3f, dy3 = -3.94f)
                lineToRelative(dx = 0.7f, dy = -5.6f)
                curveToRelative(dx1 = 0.11f, dy1 = -0.98f, dx2 = 0.14f, dy2 = -2.42f, dx3 = -0.83f, dy3 = -3.5f)
                moveToRelative(dx = -8.3f, dy = -5.55f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.83f, dy1 = 3.47f)
                verticalLineToRelative(dy = 0.7f)
                horizontalLineTo(x = 8.51f)
                verticalLineTo(y = 7.06f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.78f, dx2 = 1.47f, dy2 = -3.5f, dx3 = 3.15f, dy3 = -3.65f)
                moveTo(x = 12.0f, y = 18.58f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -7.59f)
                arcToRelative(a = 3.8f, b = 3.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.59f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.43f, y = 16.64f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -0.99f, dy = -0.99f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 0.48f, dy = 0.48f)
                lineToRelative(dx = 1.6f, dy = -1.48f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.28f, dx2 = 0.78f, dy2 = -0.26f, dx3 = 1.06f, dy3 = 0.04f)
                reflectiveCurveToRelative(dx1 = 0.26f, dy1 = 0.78f, dx2 = -0.04f, dy2 = 1.06f)
                lineToRelative(dx = -2.13f, dy = 1.97f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.2f)
            }
        }.build().also { _bagTickTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _bagTickTwo: ImageVector? = null
