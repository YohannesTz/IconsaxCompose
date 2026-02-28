package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeTrendUp: ImageVector
    get() {
        val current = _homeTrendUp
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.HomeTrendUp",
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
                moveTo(x = 9.02f, y = 2.84f)
                lineToRelative(dx = -5.39f, dy = 4.2f)
                arcTo(horizontalEllipseRadius = 4.8f, verticalEllipseRadius = 4.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 10.36f)
                verticalLineToRelative(dy = 7.4f)
                arcTo(horizontalEllipseRadius = 4.23f, verticalEllipseRadius = 4.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 6.21f, y1 = 22.0f)
                horizontalLineToRelative(dx = 11.58f)
                curveToRelative(dx1 = 2.32f, dy1 = 0.0f, dx2 = 4.21f, dy2 = -1.9f, dx3 = 4.21f, dy3 = -4.21f)
                verticalLineTo(y = 10.5f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.8f, dy1 = -3.45f)
                lineToRelative(dx = -6.18f, dy = -4.33f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.0f, dy1 = 0.12f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.5f, y = 11.5f)
                lineToRelative(dx = -4.2f, dy = 4.2f)
                lineToRelative(dx = -1.6f, dy = -2.4f)
                lineToRelative(dx = -3.2f, dy = 3.2f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 14.5f, y = 11.5f)
                horizontalLineToRelative(dx = 2.0f)
                verticalLineToRelative(dy = 2.0f)
            }
        }.build().also { _homeTrendUp = it }
    }

@Suppress("ObjectPropertyName")
private var _homeTrendUp: ImageVector? = null
