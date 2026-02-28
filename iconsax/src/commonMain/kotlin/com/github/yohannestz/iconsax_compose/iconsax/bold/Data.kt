package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Data: ImageVector
    get() {
        val current = _data
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Data",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 20.0f, y = 14.25f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = -8.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = 0.0f, dy = 16.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
                moveToRelative(dx = -16.0f, dy = -8.0f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.5f)
                arcToRelative(a = 2.25f, b = 2.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.5f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 12.75f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = -7.25f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = 0.67f, dy2 = -2.25f, dx3 = 2.25f, dy3 = -2.25f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 19.41f, y1 = 3.25f, x2 = 19.0f, y2 = 3.25f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = 1.33f, dx3 = -3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 4.25f)
                horizontalLineTo(x = 5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 4.59f, y1 = 12.75f, x2 = 5.0f, y2 = 12.75f)
                horizontalLineToRelative(dx = 5.25f)
                verticalLineTo(y = 17.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = 1.33f, dy2 = 3.75f, dx3 = 3.75f, dy3 = 3.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.0f, dx2 = -2.25f, dy2 = -0.67f, dx3 = -2.25f, dy3 = -2.25f)
                verticalLineToRelative(dy = -4.25f)
                close()
            }
        }.build().also { _data = it }
    }

@Suppress("ObjectPropertyName")
private var _data: ImageVector? = null
