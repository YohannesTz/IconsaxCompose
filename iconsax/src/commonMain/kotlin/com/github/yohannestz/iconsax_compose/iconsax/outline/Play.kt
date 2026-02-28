package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Play: ImageVector
    get() {
        val current = _play
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Play",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.87f, y = 21.28f)
                arcToRelative(a = 4.4f, b = 4.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.2f, dy1 = -0.57f)
                curveToRelative(dx1 = -1.56f, dy1 = -0.9f, dx2 = -2.42f, dy2 = -2.73f, dx3 = -2.42f, dy3 = -5.14f)
                verticalLineTo(y = 8.44f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 0.86f, dy2 = -4.24f, dx3 = 2.42f, dy3 = -5.14f)
                reflectiveCurveToRelative(dx1 = 3.57f, dy1 = -0.73f, dx2 = 5.67f, dy2 = 0.48f)
                lineToRelative(dx = 6.17f, dy = 3.56f)
                curveToRelative(dx1 = 2.09f, dy1 = 1.21f, dx2 = 3.25f, dy2 = 2.87f, dx3 = 3.25f, dy3 = 4.67f)
                reflectiveCurveToRelative(dx1 = -1.15f, dy1 = 3.46f, dx2 = -3.25f, dy2 = 4.67f)
                lineToRelative(dx = -6.17f, dy = 3.56f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.47f, dy1 = 1.04f)
                moveToRelative(dx = 0.0f, dy = -17.06f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.45f, dy1 = 0.37f)
                curveTo(x1 = 5.34f, y1 = 5.21f, x2 = 4.75f, y2 = 6.58f, x3 = 4.75f, y3 = 8.44f)
                verticalLineToRelative(dy = 7.12f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.86f, dx2 = 0.59f, dy2 = 3.22f, dx3 = 1.67f, dy3 = 3.85f)
                reflectiveCurveToRelative(dx1 = 2.56f, dy1 = 0.45f, dx2 = 4.17f, dy2 = -0.48f)
                lineToRelative(dx = 6.17f, dy = -3.56f)
                curveToRelative(dx1 = 1.61f, dy1 = -0.93f, dx2 = 2.5f, dy2 = -2.12f, dx3 = 2.5f, dy3 = -3.37f)
                reflectiveCurveToRelative(dx1 = -0.89f, dy1 = -2.44f, dx2 = -2.5f, dy2 = -3.37f)
                lineToRelative(dx = -6.17f, dy = -3.56f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.72f, dy1 = -0.85f)
            }
        }.build().also { _play = it }
    }

@Suppress("ObjectPropertyName")
private var _play: ImageVector? = null
