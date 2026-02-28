package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scanning: ImageVector
    get() {
        val current = _scanning
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Scanning",
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
                moveTo(x = 2.0f, y = 9.0f)
                verticalLineTo(y = 6.5f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.5f, y1 = 2.0f)
                horizontalLineTo(x = 9.0f)
                moveToRelative(dx = 6.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 2.5f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.0f, y1 = 6.5f)
                verticalLineTo(y = 9.0f)
                moveToRelative(dx = 0.0f, dy = 7.0f)
                verticalLineToRelative(dy = 1.5f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.5f, dy1 = 4.5f)
                horizontalLineTo(x = 16.0f)
                moveToRelative(dx = -7.0f, dy = 0.0f)
                horizontalLineTo(x = 6.5f)
                arcTo(horizontalEllipseRadius = 4.5f, verticalEllipseRadius = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 17.5f)
                verticalLineTo(y = 15.0f)
                moveToRelative(dx = 9.0f, dy = -6.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.5f, y1 = 6.0f)
                moveToRelative(dx = -1.0f, dy = 12.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
                moveToRelative(dx = 9.0f, dy = -9.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.0f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.0f)
                moveTo(x = 13.0f, y = 15.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.73f, dy1 = -1.77f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 15.5f, y1 = 18.0f)
            }
        }.build().also { _scanning = it }
    }

@Suppress("ObjectPropertyName")
private var _scanning: ImageVector? = null
