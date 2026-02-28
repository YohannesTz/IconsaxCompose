package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Command: ImageVector
    get() {
        val current = _command
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Command",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 8.0f)
                horizontalLineTo(x = 8.0f)
                verticalLineToRelative(dy = 8.0f)
                horizontalLineToRelative(dx = 8.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 5.0f, y = 22.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -1.65f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 1.35f, dx3 = -3.0f, dy3 = 3.0f)
                reflectiveCurveToRelative(dx1 = 1.35f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveTo(x = 5.0f, y = 8.0f)
                horizontalLineToRelative(dx = 3.0f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.65f, dx2 = -1.35f, dy2 = -3.0f, dx3 = -3.0f, dy3 = -3.0f)
                reflectiveCurveTo(x1 = 2.0f, y1 = 3.35f, x2 = 2.0f, y2 = 5.0f)
                reflectiveCurveToRelative(dx1 = 1.35f, dy1 = 3.0f, dx2 = 3.0f, dy2 = 3.0f)
                moveToRelative(dx = 11.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 1.65f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.35f, dx3 = 3.0f, dy3 = -3.0f)
                reflectiveCurveToRelative(dx1 = -1.35f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                reflectiveCurveToRelative(dx1 = -3.0f, dy1 = 1.35f, dx2 = -3.0f, dy2 = 3.0f)
                close()
                moveToRelative(dx = 3.0f, dy = 14.0f)
                curveToRelative(dx1 = 1.65f, dy1 = 0.0f, dx2 = 3.0f, dy2 = -1.35f, dx3 = 3.0f, dy3 = -3.0f)
                reflectiveCurveToRelative(dx1 = -1.35f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = -3.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.0f, dy1 = 3.0f)
            }
        }.build().also { _command = it }
    }

@Suppress("ObjectPropertyName")
private var _command: ImageVector? = null
