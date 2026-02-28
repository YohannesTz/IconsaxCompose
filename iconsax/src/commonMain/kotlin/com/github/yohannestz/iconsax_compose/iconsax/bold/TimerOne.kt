package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 12.0f, y = 4.65f)
                arcTo(horizontalEllipseRadius = 8.68f, verticalEllipseRadius = 8.68f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 12.02f, y1 = 22.0f)
                arcTo(horizontalEllipseRadius = 8.68f, verticalEllipseRadius = 8.68f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 4.65f)
                moveTo(x = 12.75f, y = 13.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 11.25f, y1 = 13.4f, x2 = 11.25f, y2 = 13.0f)
                verticalLineTo(y = 8.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 12.75f, y1 = 7.59f, x2 = 12.75f, y2 = 8.0f)
                close()
                moveToRelative(dx = 2.14f, dy = -9.55f)
                horizontalLineTo(x = 9.11f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.45f)
                horizontalLineToRelative(dx = 5.78f)
                arcToRelative(a = 0.73f, b = 0.73f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.45f)
            }
        }.build().also { _timerOne = it }
    }

@Suppress("ObjectPropertyName")
private var _timerOne: ImageVector? = null
