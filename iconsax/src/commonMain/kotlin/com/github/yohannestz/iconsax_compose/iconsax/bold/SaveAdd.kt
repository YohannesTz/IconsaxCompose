package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SaveAdd: ImageVector
    get() {
        val current = _saveAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SaveAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.0f, y = 5.11f)
                verticalLineToRelative(dy = 11.36f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = -1.04f, dy2 = 2.06f, dx3 = -2.31f, dy3 = 1.36f)
                lineToRelative(dx = -1.93f, dy = -1.08f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = -0.44f)
                verticalLineTo(y = 8.99f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.61f, dy1 = -4.61f)
                horizontalLineTo(x = 8.82f)
                curveToRelative(dx1 = -0.37f, dy1 = 0.0f, dx2 = -0.63f, dy2 = -0.39f, dx3 = -0.46f, dy3 = -0.71f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.11f, y1 = 2.0f)
                horizontalLineToRelative(dx = 7.78f)
                curveTo(x1 = 20.6f, y1 = 2.0f, x2 = 22.0f, y2 = 3.4f, x3 = 22.0f, y3 = 5.11f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.89f, y = 5.88f)
                horizontalLineTo(x = 5.11f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 8.98f)
                verticalLineToRelative(dy = 11.37f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.45f, dx2 = 1.04f, dy2 = 2.06f, dx3 = 2.31f, dy3 = 1.36f)
                lineToRelative(dx = 3.93f, dy = -2.2f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.52f, dy1 = 0.0f)
                lineToRelative(dx = 3.93f, dy = 2.2f)
                curveTo(x1 = 14.96f, y1 = 22.4f, x2 = 16.0f, y2 = 21.8f, x3 = 16.0f, y3 = 20.35f)
                verticalLineTo(y = 8.99f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.71f, dx2 = -1.4f, dy2 = -3.11f, dx3 = -3.11f, dy3 = -3.11f)
                moveTo(x = 11.0f, y = 12.75f)
                horizontalLineTo(x = 9.75f)
                verticalLineTo(y = 14.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.4f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.25f, y1 = 14.4f, x2 = 8.25f, y2 = 14.0f)
                verticalLineToRelative(dy = -1.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 11.25f, x2 = 7.0f, y2 = 11.25f)
                horizontalLineToRelative(dx = 1.25f)
                verticalLineTo(y = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 9.75f, y1 = 9.59f, x2 = 9.75f, y2 = 10.0f)
                verticalLineToRelative(dy = 1.25f)
                horizontalLineTo(x = 11.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _saveAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _saveAdd: ImageVector? = null
