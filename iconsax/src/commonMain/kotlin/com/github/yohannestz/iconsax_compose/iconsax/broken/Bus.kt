package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bus: ImageVector
    get() {
        val current = _bus
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bus",
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
                moveTo(x = 4.0f, y = 14.96f)
                verticalLineTo(y = 5.1f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.1f, y1 = 2.0f)
                horizontalLineToRelative(dx = 9.8f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.0f, y1 = 5.1f)
                verticalLineToRelative(dy = 13.8f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.1f, dy1 = 3.1f)
                horizontalLineTo(x = 7.1f)
                arcTo(horizontalEllipseRadius = 3.1f, verticalEllipseRadius = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.0f, y1 = 18.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.5f, y = 13.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = -1.5f)
                verticalLineToRelative(dy = -2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.5f, y1 = 8.0f)
                horizontalLineToRelative(dx = -13.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 4.0f, y1 = 9.5f)
                verticalLineToRelative(dy = 2.0f)
                arcTo(horizontalEllipseRadius = 1.5f, verticalEllipseRadius = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.5f, y1 = 13.0f)
                horizontalLineToRelative(dx = 8.53f)
                moveTo(x = 9.5f, y = 5.0f)
                horizontalLineToRelative(dx = 5.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.5f,
            ) {
                moveTo(x = 8.5f, y = 17.7f)
                close()
                moveToRelative(dx = 7.0f, dy = 0.0f)
                close()
            }
        }.build().also { _bus = it }
    }

@Suppress("ObjectPropertyName")
private var _bus: ImageVector? = null
