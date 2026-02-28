package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scan: ImageVector
    get() {
        val current = _scan
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Scan",
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
                moveToRelative(dx = 15.0f, dy = -5.5f)
                verticalLineToRelative(dy = 5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = -3.0f, dy2 = 3.0f)
                horizontalLineToRelative(dx = -4.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -3.0f)
                verticalLineToRelative(dy = -5.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = 3.0f, dy2 = -3.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = 5.0f, dy = 5.5f)
                horizontalLineTo(x = 5.0f)
            }
        }.build().also { _scan = it }
    }

@Suppress("ObjectPropertyName")
private var _scan: ImageVector? = null
