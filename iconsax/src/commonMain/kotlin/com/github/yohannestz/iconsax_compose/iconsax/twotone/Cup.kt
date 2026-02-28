package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cup: ImageVector
    get() {
        val current = _cup
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Cup",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.15f, y = 16.5f)
                verticalLineToRelative(dy = 2.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.15f, y = 22.0f)
                horizontalLineToRelative(dx = 10.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = -6.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.0f, dy1 = 2.0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 6.15f, y = 22.0f)
                horizontalLineToRelative(dx = 12.0f)
                moveTo(x = 12.0f, y = 16.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = -7.0f)
                verticalLineTo(y = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -4.0f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = 4.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
            }
            path(
                fillAlpha = 0.34f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.34f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 5.47f, y = 11.65f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.93f, dy1 = -1.2f)
                curveToRelative(dx1 = -0.9f, dy1 = -1.0f, dx2 = -1.5f, dy2 = -2.2f, dx3 = -1.5f, dy3 = -3.6f)
                reflectiveCurveToRelative(dx1 = 1.1f, dy1 = -2.5f, dx2 = 2.5f, dy2 = -2.5f)
                horizontalLineToRelative(dx = 0.65f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.3f, dy1 = 1.5f)
                verticalLineToRelative(dy = 3.0f)
                quadToRelative(dx1 = 0.01f, dy1 = 1.5f, dx2 = 0.58f, dy2 = 2.8f)
                moveToRelative(dx = 13.06f, dy = 0.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.93f, dy1 = -1.2f)
                curveToRelative(dx1 = 0.9f, dy1 = -1.0f, dx2 = 1.5f, dy2 = -2.2f, dx3 = 1.5f, dy3 = -3.6f)
                reflectiveCurveToRelative(dx1 = -1.1f, dy1 = -2.5f, dx2 = -2.5f, dy2 = -2.5f)
                horizontalLineToRelative(dx = -0.65f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.3f, dy1 = 1.5f)
                verticalLineToRelative(dy = 3.0f)
                quadToRelative(dx1 = -0.01f, dy1 = 1.5f, dx2 = -0.58f, dy2 = 2.8f)
            }
        }.build().also { _cup = it }
    }

@Suppress("ObjectPropertyName")
private var _cup: ImageVector? = null
