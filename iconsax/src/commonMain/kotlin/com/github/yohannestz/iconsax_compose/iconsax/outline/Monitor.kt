package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Monitor: ImageVector
    get() {
        val current = _monitor
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Monitor",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.56f, y = 17.97f)
                horizontalLineTo(x = 6.44f)
                curveToRelative(dx1 = -3.98f, dy1 = 0.0f, dx2 = -5.19f, dy2 = -1.21f, dx3 = -5.19f, dy3 = -5.19f)
                verticalLineTo(y = 6.44f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.98f, dx2 = 1.21f, dy2 = -5.19f, dx3 = 5.19f, dy3 = -5.19f)
                horizontalLineToRelative(dx = 11.11f)
                curveToRelative(dx1 = 3.98f, dy1 = 0.0f, dx2 = 5.19f, dy2 = 1.21f, dx3 = 5.19f, dy3 = 5.19f)
                verticalLineToRelative(dy = 6.33f)
                curveToRelative(dx1 = 0.01f, dy1 = 3.99f, dx2 = -1.2f, dy2 = 5.2f, dx3 = -5.18f, dy3 = 5.2f)
                moveTo(x = 6.44f, y = 2.75f)
                curveToRelative(dx1 = -3.14f, dy1 = 0.0f, dx2 = -3.69f, dy2 = 0.55f, dx3 = -3.69f, dy3 = 3.69f)
                verticalLineToRelative(dy = 6.33f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.14f, dx2 = 0.55f, dy2 = 3.69f, dx3 = 3.69f, dy3 = 3.69f)
                horizontalLineToRelative(dx = 11.11f)
                curveToRelative(dx1 = 3.14f, dy1 = 0.0f, dx2 = 3.69f, dy2 = -0.55f, dx3 = 3.69f, dy3 = -3.69f)
                verticalLineTo(y = 6.44f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.14f, dx2 = -0.55f, dy2 = -3.69f, dx3 = -3.69f, dy3 = -3.69f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 22.0f)
                verticalLineToRelative(dy = -4.78f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineTo(y = 22.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 10.0f, dy = -9.0f)
                horizontalLineTo(x = 2.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 1.59f, y1 = 12.25f, x2 = 2.0f, y2 = 12.25f)
                horizontalLineToRelative(dx = 20.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.5f, y = 22.75f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _monitor = it }
    }

@Suppress("ObjectPropertyName")
private var _monitor: ImageVector? = null
