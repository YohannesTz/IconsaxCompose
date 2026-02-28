package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chart: ImageVector
    get() {
        val current = _chart
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Chart",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.0f, y = 22.75f)
                horizontalLineTo(x = 3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 2.59f, y1 = 21.25f, x2 = 3.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 18.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 5.6f, y = 8.38f)
                horizontalLineTo(x = 4.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineTo(y = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 1.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 9.38f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                moveToRelative(dx = 7.2f, dy = -3.19f)
                horizontalLineToRelative(dx = -1.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineTo(y = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 1.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 6.2f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
                moveTo(x = 20.0f, y = 2.0f)
                horizontalLineToRelative(dx = -1.6f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 15.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineTo(x = 20.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.0f, dy1 = -1.0f)
            }
        }.build().also { _chart = it }
    }

@Suppress("ObjectPropertyName")
private var _chart: ImageVector? = null
