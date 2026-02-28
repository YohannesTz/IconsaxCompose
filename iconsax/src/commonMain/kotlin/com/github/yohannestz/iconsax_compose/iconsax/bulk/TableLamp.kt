package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.21f, y = 14.69f)
                horizontalLineTo(x = 5.79f)
                curveToRelative(dx1 = -1.66f, dy1 = 0.0f, dx2 = -2.66f, dy2 = -1.31f, dx3 = -2.22f, dy3 = -2.91f)
                lineToRelative(dx = 2.2f, dy = -8.08f)
                arcTo(horizontalEllipseRadius = 2.45f, verticalEllipseRadius = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.99f, y1 = 2.0f)
                horizontalLineToRelative(dx = 8.02f)
                arcToRelative(a = 2.45f, b = 2.45f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.22f, dy1 = 1.7f)
                lineToRelative(dx = 2.2f, dy = 8.08f)
                curveToRelative(dx1 = 0.44f, dy1 = 1.6f, dx2 = -0.56f, dy2 = 2.91f, dx3 = -2.22f, dy3 = 2.91f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.75f, y = 21.25f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 22.0f)
                horizontalLineTo(x = 8.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 7.59f, y1 = 20.5f, x2 = 8.0f, y2 = 20.5f)
                horizontalLineToRelative(dx = 3.25f)
                verticalLineToRelative(dy = -5.8f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 5.8f)
                horizontalLineTo(x = 16.0f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = 0.75f)
            }
        }.build().also { _tableLamp = it }
    }

@Suppress("ObjectPropertyName")
private var _tableLamp: ImageVector? = null
