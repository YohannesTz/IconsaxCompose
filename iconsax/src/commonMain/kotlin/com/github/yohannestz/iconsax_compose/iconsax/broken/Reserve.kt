package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Reserve: ImageVector
    get() {
        val current = _reserve
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Reserve",
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
                moveTo(x = 18.97f, y = 22.0f)
                horizontalLineToRelative(dx = -14.0f)
                curveToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = -1.35f, dx3 = -3.0f, dy3 = -3.0f)
                verticalLineToRelative(dy = -1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = -1.0f)
                horizontalLineToRelative(dx = 18.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.0f, dy1 = 1.0f)
                verticalLineToRelative(dy = 1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.65f, dx2 = 0.0f, dy2 = 3.0f, dx3 = -3.0f, dy3 = 3.0f)
                moveTo(x = 4.62f, y = 8.56f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.27f, y1 = 5.0f)
                horizontalLineToRelative(dx = 1.45f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.0f, dy1 = 8.0f)
                verticalLineToRelative(dy = 4.0f)
                horizontalLineTo(x = 3.27f)
                verticalLineToRelative(dy = -4.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 4.5f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.09f, dy1 = 0.68f)
                arcTo(horizontalEllipseRadius = 8.0f, verticalEllipseRadius = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.72f, y1 = 5.0f)
                horizontalLineToRelative(dx = -1.45f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.68f, dy1 = 0.18f)
                arcTo(horizontalEllipseRadius = 3.0f, verticalEllipseRadius = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 9.5f, y1 = 4.5f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.0f, dy1 = 0.0f)
                moveTo(x = 15.0f, y = 11.0f)
                horizontalLineTo(x = 9.0f)
            }
        }.build().also { _reserve = it }
    }

@Suppress("ObjectPropertyName")
private var _reserve: ImageVector? = null
