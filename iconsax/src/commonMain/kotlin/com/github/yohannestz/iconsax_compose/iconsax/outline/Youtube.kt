package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Youtube: ImageVector
    get() {
        val current = _youtube
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Youtube",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 17.0f, y = 20.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -3.44f, dy1 = 0.0f, dx2 = -5.75f, dy2 = -2.31f, dx3 = -5.75f, dy3 = -5.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.44f, dx2 = 2.31f, dy2 = -5.75f, dx3 = 5.75f, dy3 = -5.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.44f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.31f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.44f, dx2 = -2.31f, dy2 = 5.75f, dx3 = -5.75f, dy3 = 5.75f)
                moveToRelative(dx = -10.0f, dy = -16.0f)
                curveTo(x1 = 4.42f, y1 = 4.75f, x2 = 2.75f, y2 = 6.42f, x3 = 2.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.58f, dx2 = 1.67f, dy2 = 4.25f, dx3 = 4.25f, dy3 = 4.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 2.58f, dy1 = 0.0f, dx2 = 4.25f, dy2 = -1.67f, dx3 = 4.25f, dy3 = -4.25f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -1.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                moveTo(x = 10.59f, y = 15.53f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = -0.21f)
                curveToRelative(dx1 = -0.58f, dy1 = -0.33f, dx2 = -0.92f, dy2 = -1.0f, dx3 = -0.92f, dy3 = -1.83f)
                verticalLineToRelative(dy = -2.96f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.83f, dx2 = 0.33f, dy2 = -1.5f, dx3 = 0.92f, dy3 = -1.83f)
                curveToRelative(dx1 = 0.58f, dy1 = -0.33f, dx2 = 1.33f, dy2 = -0.27f, dx3 = 2.04f, dy3 = 0.16f)
                lineToRelative(dx = 2.47f, dy = 1.48f)
                curveToRelative(dx1 = 0.68f, dy1 = 0.41f, dx2 = 1.07f, dy2 = 1.02f, dx3 = 1.07f, dy3 = 1.67f)
                reflectiveCurveToRelative(dx1 = -0.39f, dy1 = 1.26f, dx2 = -1.07f, dy2 = 1.67f)
                lineToRelative(dx = -2.47f, dy = 1.48f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.22f, dy1 = 0.37f)
                moveToRelative(dx = 0.0f, dy = -5.56f)
                lineTo(x = 10.5f, y = 9.99f)
                curveToRelative(dx1 = -0.07f, dy1 = 0.04f, dx2 = -0.15f, dy2 = 0.22f, dx3 = -0.15f, dy3 = 0.53f)
                verticalLineToRelative(dy = 2.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.3f, dx2 = 0.08f, dy2 = 0.48f, dx3 = 0.15f, dy3 = 0.53f)
                curveToRelative(dx1 = 0.08f, dy1 = 0.04f, dx2 = 0.27f, dy2 = 0.02f, dx3 = 0.53f, dy3 = -0.14f)
                lineToRelative(dx = 2.47f, dy = -1.48f)
                quadToRelative(dx1 = 0.36f, dy1 = -0.24f, dx2 = 0.34f, dy2 = -0.39f)
                quadToRelative(dx1 = 0.02f, dy1 = -0.14f, dx2 = -0.34f, dy2 = -0.39f)
                lineToRelative(dx = -2.47f, dy = -1.48f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.44f, dy1 = -0.16f)
            }
        }.build().also { _youtube = it }
    }

@Suppress("ObjectPropertyName")
private var _youtube: ImageVector? = null
