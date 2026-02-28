package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimerOne: ImageVector
    get() {
        val current = _timerOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.TimerOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 9.5f, b = 9.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.02f, dy1 = -19.02f)
                arcTo(horizontalEllipseRadius = 9.5f, verticalEllipseRadius = 9.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -17.5f)
                arcToRelative(a = 8.01f, b = 8.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 16.0f)
                arcToRelative(a = 8.01f, b = 8.01f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -16.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 13.75f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.25f, y1 = 13.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 7.59f, x2 = 12.75f, y2 = 8.0f)
                verticalLineToRelative(dy = 5.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 13.75f)
                moveToRelative(dx = 3.0f, dy = -11.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 8.59f, y1 = 2.75f, x2 = 8.25f, y2 = 2.41f, x3 = 8.25f, y3 = 2.0f)
                reflectiveCurveTo(x1 = 8.59f, y1 = 1.25f, x2 = 9.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 15.41f, y1 = 2.75f, x2 = 15.0f, y2 = 2.75f)
            }
        }.build().also { _timerOne = it }
    }

@Suppress("ObjectPropertyName")
private var _timerOne: ImageVector? = null
