package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DriverRefresh: ImageVector
    get() {
        val current = _driverRefresh
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DriverRefresh",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.0f, y = 6.25f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 22.0f, y = 12.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -5.0f, dx2 = -2.0f, dy2 = -7.0f, dx3 = -7.0f, dy3 = -7.0f)
                horizontalLineTo(x = 9.0f)
                curveTo(x1 = 4.0f, y1 = 2.0f, x2 = 2.0f, y2 = 4.0f, x3 = 2.0f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 5.0f, dx2 = 2.0f, dy2 = 7.0f, dx3 = 7.0f, dy3 = 7.0f)
                horizontalLineToRelative(dx = 3.0f)
                moveTo(x = 10.0f, y = 6.25f)
                verticalLineToRelative(dy = 2.0f)
                moveTo(x = 6.0f, y = 16.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 4.0f, dy = -2.0f)
                verticalLineToRelative(dy = 2.0f)
                moveToRelative(dx = 4.0f, dy = -10.75f)
                horizontalLineToRelative(dx = 4.0f)
                moveTo(x = 2.0f, y = 12.0f)
                horizontalLineToRelative(dx = 16.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.56f, y = 20.33f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.81f, dy1 = 1.62f)
                curveToRelative(dx1 = -1.79f, dy1 = 0.0f, dx2 = -2.89f, dy2 = -1.8f, dx3 = -2.89f, dy3 = -1.8f)
                moveToRelative(dx = 0.07f, dy = -3.06f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.82f, dy1 = -1.63f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.25f, dy1 = 1.8f)
                moveToRelative(dx = 0.0f, dy = -2.01f)
                verticalLineToRelative(dy = 2.0f)
                horizontalLineToRelative(dx = -2.0f)
                moveToRelative(dx = -2.14f, dy = 2.89f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineTo(y = 22.0f)
            }
        }.build().also { _driverRefresh = it }
    }

@Suppress("ObjectPropertyName")
private var _driverRefresh: ImageVector? = null
