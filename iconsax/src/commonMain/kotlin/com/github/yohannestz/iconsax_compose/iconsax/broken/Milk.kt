package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Milk: ImageVector
    get() {
        val current = _milk
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Milk",
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
                moveTo(x = 6.0f, y = 13.98f)
                lineTo(x = 9.89f, y = 14.0f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.5f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.12f, dy1 = 0.5f)
                horizontalLineTo(x = 18.0f)
                verticalLineToRelative(dy = 4.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = 3.0f)
                horizontalLineTo(x = 9.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.0f, dy1 = -3.0f)
                verticalLineToRelative(dy = -1.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.0f, y = 10.83f)
                verticalLineTo(y = 15.0f)
                horizontalLineToRelative(dx = -3.88f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 14.5f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.89f, y1 = 14.0f)
                lineTo(x = 6.0f, y = 13.98f)
                verticalLineToRelative(dy = -3.15f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.59f, dy1 = -1.42f)
                lineToRelative(dx = 2.12f, dy = -2.12f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.0f, y1 = 6.59f)
                verticalLineTo(y = 5.0f)
                horizontalLineToRelative(dx = 6.0f)
                verticalLineToRelative(dy = 1.59f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.29f, dy1 = 0.7f)
                lineToRelative(dx = 2.12f, dy = 2.12f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 10.83f)
                moveTo(x = 18.0f, y = 16.0f)
                verticalLineToRelative(dy = -1.0f)
                moveTo(x = 14.5f, y = 5.0f)
                horizontalLineToRelative(dx = -5.0f)
                curveTo(x1 = 8.67f, y1 = 5.0f, x2 = 8.0f, y2 = 4.32f, x3 = 8.0f, y3 = 3.5f)
                reflectiveCurveTo(x1 = 8.67f, y1 = 2.0f, x2 = 9.5f, y2 = 2.0f)
                horizontalLineToRelative(dx = 5.0f)
                curveTo(x1 = 15.33f, y1 = 2.0f, x2 = 16.0f, y2 = 2.68f, x3 = 16.0f, y3 = 3.5f)
                reflectiveCurveTo(x1 = 15.33f, y1 = 5.0f, x2 = 14.5f, y2 = 5.0f)
            }
        }.build().also { _milk = it }
    }

@Suppress("ObjectPropertyName")
private var _milk: ImageVector? = null
