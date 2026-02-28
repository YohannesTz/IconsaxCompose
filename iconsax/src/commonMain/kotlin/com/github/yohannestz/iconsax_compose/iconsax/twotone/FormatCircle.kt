package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FormatCircle: ImageVector
    get() {
        val current = _formatCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FormatCircle",
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
                moveTo(x = 21.5f, y = 5.35f)
                arcToRelative(a = 2.85f, b = 2.85f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -5.09f, dy1 = -1.76f)
                horizontalLineToRelative(dx = 0.01f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 5.08f, dy1 = 1.76f)
                moveToRelative(dx = -13.3f, dy = 0.0f)
                arcTo(horizontalEllipseRadius = 2.84f, verticalEllipseRadius = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.35f, y1 = 8.2f)
                arcTo(horizontalEllipseRadius = 2.85f, verticalEllipseRadius = 2.85f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 8.2f, y1 = 5.35f)
                moveToRelative(dx = 13.3f, dy = 13.3f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.08f, dy1 = 1.76f)
                horizontalLineToRelative(dx = -0.01f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.0f, dy1 = -4.0f)
                verticalLineToRelative(dy = 0.01f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.09f, dy1 = 2.23f)
                moveToRelative(dx = -13.3f, dy = 0.0f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.61f, dy1 = 1.76f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.24f, dy1 = 1.09f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.76f, dy1 = -5.08f)
                verticalLineToRelative(dy = -0.01f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.61f, dy1 = 2.24f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 21.5f, y = 12.0f)
                quadToRelative(dx1 = -0.02f, dy1 = 2.41f, dx2 = -1.09f, dy2 = 4.41f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.0f, dy1 = 4.0f)
                arcTo(horizontalEllipseRadius = 9.4f, verticalEllipseRadius = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.5f)
                arcToRelative(a = 9.4f, b = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.41f, dy1 = -1.09f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.0f, dy1 = -4.0f)
                arcTo(horizontalEllipseRadius = 9.4f, verticalEllipseRadius = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.5f, y1 = 12.0f)
                arcToRelative(a = 9.4f, b = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.09f, dy1 = -4.41f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = -4.0f)
                arcToRelative(a = 9.4f, b = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.82f, dy1 = 0.0f)
                arcToRelative(a = 2.84f, b = 2.84f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = 4.0f)
                arcTo(horizontalEllipseRadius = 9.4f, verticalEllipseRadius = 9.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 21.5f, y1 = 12.0f)
            }
        }.build().also { _formatCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _formatCircle: ImageVector? = null
