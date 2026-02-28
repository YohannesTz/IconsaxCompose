package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Android: ImageVector
    get() {
        val current = _android
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Android",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 11.0f, y = 18.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = -0.4f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.5f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                close()
                moveToRelative(dx = 4.0f, dy = 0.0f)
                verticalLineToRelative(dy = 3.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.5f, dx2 = -0.4f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.5f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -3.0f)
                close()
                moveToRelative(dx = 2.0f, dy = -7.0f)
                verticalLineToRelative(dy = 5.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = 2.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = -2.0f)
                verticalLineToRelative(dy = -5.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = -2.0f)
                horizontalLineToRelative(dx = 6.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.0f, dy1 = 2.0f)
                moveTo(x = 5.0f, y = 11.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = -0.4f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.4f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = 0.4f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.4f, dx2 = 1.0f, dy2 = 1.0f)
                moveToRelative(dx = 16.0f, dy = 0.0f)
                verticalLineToRelative(dy = 4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.6f, dx2 = -0.4f, dy2 = 1.0f, dx3 = -1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.4f, dx2 = -1.0f, dy2 = -1.0f)
                verticalLineToRelative(dy = -4.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.6f, dx2 = 0.4f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.4f, dx2 = 1.0f, dy2 = 1.0f)
                moveToRelative(dx = -8.0f, dy = 7.0f)
                horizontalLineToRelative(dx = -2.0f)
                moveTo(x = 9.6f, y = 7.0f)
                horizontalLineToRelative(dx = 4.8f)
                curveTo(x1 = 15.3f, y1 = 7.0f, x2 = 16.0f, y2 = 6.25f, x3 = 16.0f, y3 = 5.29f)
                curveTo(x1 = 16.0f, y1 = 2.93f, x2 = 14.2f, y2 = 1.0f, x3 = 12.0f, y3 = 1.0f)
                reflectiveCurveTo(x1 = 8.0f, y1 = 2.93f, x2 = 8.0f, y2 = 5.29f)
                curveTo(x1 = 8.0f, y1 = 6.25f, x2 = 8.7f, y2 = 7.0f, x3 = 9.6f, y3 = 7.0f)
            }
        }.build().also { _android = it }
    }

@Suppress("ObjectPropertyName")
private var _android: ImageVector? = null
