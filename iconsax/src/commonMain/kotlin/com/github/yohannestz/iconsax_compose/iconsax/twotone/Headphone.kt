package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Headphone: ImageVector
    get() {
        val current = _headphone
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Headphone",
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
                moveTo(x = 5.46f, y = 18.49f)
                verticalLineToRelative(dy = -2.92f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = -1.84f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 1.84f)
                verticalLineToRelative(dy = 2.81f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = 3.57f)
                arcTo(horizontalEllipseRadius = 3.6f, verticalEllipseRadius = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.0f, y1 = 18.38f)
                verticalLineToRelative(dy = -6.16f)
                arcToRelative(a = 9.9f, b = 9.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 9.95f, dy1 = -10.17f)
                curveTo(x1 = 17.57f, y1 = 2.05f, x2 = 22.0f, y2 = 6.6f, x3 = 22.0f, y3 = 12.11f)
                verticalLineToRelative(dy = 6.16f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = 3.57f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.57f, dy1 = -3.57f)
                verticalLineToRelative(dy = -2.81f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = -1.84f)
                arcToRelative(a = 1.83f, b = 1.83f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.84f, dy1 = 1.84f)
                verticalLineToRelative(dy = 3.03f)
            }
        }.build().also { _headphone = it }
    }

@Suppress("ObjectPropertyName")
private var _headphone: ImageVector? = null
