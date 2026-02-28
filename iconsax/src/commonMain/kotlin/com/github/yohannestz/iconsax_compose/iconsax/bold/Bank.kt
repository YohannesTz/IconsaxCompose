package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bank: ImageVector
    get() {
        val current = _bank
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bank",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 19.0f)
                verticalLineToRelative(dy = 3.0f)
                horizontalLineTo(x = 2.0f)
                verticalLineToRelative(dy = -3.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 7.0f, y = 11.0f)
                horizontalLineTo(x = 5.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 4.0f, dy = 0.0f)
                horizontalLineTo(x = 9.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 4.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 4.0f, dy = 0.0f)
                horizontalLineToRelative(dx = -2.0f)
                verticalLineToRelative(dy = 7.0f)
                horizontalLineToRelative(dx = 2.0f)
                close()
                moveToRelative(dx = 4.0f, dy = 11.75f)
                horizontalLineTo(x = 1.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 0.59f, y1 = 21.25f, x2 = 1.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 22.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -1.63f, dy = -17.0f)
                lineToRelative(dx = -9.0f, dy = -3.6f)
                arcToRelative(a = 1.2f, b = 1.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = 0.0f)
                lineToRelative(dx = -9.0f, dy = 3.6f)
                arcTo(horizontalEllipseRadius = 1.1f, verticalEllipseRadius = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 6.68f)
                verticalLineTo(y = 10.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = 1.0f)
                horizontalLineToRelative(dx = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.0f, dy1 = -1.0f)
                verticalLineTo(y = 6.68f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.63f, dy1 = -0.93f)
                moveTo(x = 12.0f, y = 8.5f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 3.0f)
            }
        }.build().also { _bank = it }
    }

@Suppress("ObjectPropertyName")
private var _bank: ImageVector? = null
