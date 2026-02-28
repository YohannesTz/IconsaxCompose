package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableLamp: ImageVector
    get() {
        val current = _tableLamp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TableLamp",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.43f, y = 11.78f)
                lineToRelative(dx = -2.2f, dy = -8.08f)
                arcTo(horizontalEllipseRadius = 2.45f, verticalEllipseRadius = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 16.01f, y1 = 2.0f)
                horizontalLineTo(x = 7.99f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.22f, dy1 = 1.7f)
                lineToRelative(dx = -2.2f, dy = 8.08f)
                curveToRelative(dx1 = -0.44f, dy1 = 1.6f, dx2 = 0.56f, dy2 = 2.91f, dx3 = 2.22f, dy3 = 2.91f)
                horizontalLineToRelative(dx = 5.46f)
                verticalLineToRelative(dy = 5.81f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 22.0f, x2 = 8.0f, y2 = 22.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.41f, y1 = 20.5f, x2 = 16.0f, y2 = 20.5f)
                horizontalLineToRelative(dx = -3.25f)
                verticalLineToRelative(dy = -5.81f)
                horizontalLineToRelative(dx = 5.46f)
                curveToRelative(dx1 = 1.66f, dy1 = 0.0f, dx2 = 2.66f, dy2 = -1.31f, dx3 = 2.22f, dy3 = -2.91f)
            }
        }.build().also { _tableLamp = it }
    }

@Suppress("ObjectPropertyName")
private var _tableLamp: ImageVector? = null
