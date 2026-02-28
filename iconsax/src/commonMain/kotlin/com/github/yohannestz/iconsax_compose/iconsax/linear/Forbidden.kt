package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Forbidden: ImageVector
    get() {
        val current = _forbidden
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Forbidden",
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
                moveTo(x = 14.9f, y = 2.0f)
                horizontalLineTo(x = 9.1f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.12f, dy1 = 0.88f)
                lineToRelative(dx = -4.1f, dy = 4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 9.1f)
                verticalLineToRelative(dy = 5.8f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.68f, dx2 = 0.4f, dy2 = 1.64f, dx3 = 0.88f, dy3 = 2.12f)
                lineToRelative(dx = 4.1f, dy = 4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 9.1f, y1 = 22.0f)
                horizontalLineToRelative(dx = 5.8f)
                curveToRelative(dx1 = 0.68f, dy1 = 0.0f, dx2 = 1.64f, dy2 = -0.4f, dx3 = 2.12f, dy3 = -0.88f)
                lineToRelative(dx = 4.1f, dy = -4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 22.0f, y1 = 14.9f)
                verticalLineTo(y = 9.1f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.68f, dx2 = -0.4f, dy2 = -1.64f, dx3 = -0.88f, dy3 = -2.12f)
                lineToRelative(dx = -4.1f, dy = -4.1f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 14.9f, y1 = 2.0f)
                moveTo(x = 4.94f, y = 19.08f)
                lineTo(x = 19.08f, y = 4.94f)
            }
        }.build().also { _forbidden = it }
    }

@Suppress("ObjectPropertyName")
private var _forbidden: ImageVector? = null
