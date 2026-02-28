package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WeightMeter: ImageVector
    get() {
        val current = _weightMeter
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.WeightMeter",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 2.0f)
                horizontalLineTo(x = 8.0f)
                curveTo(x1 = 5.0f, y1 = 2.0f, x2 = 3.0f, y2 = 4.0f, x3 = 3.0f, y3 = 7.0f)
                verticalLineToRelative(dy = 10.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.0f, dx2 = 2.0f, dy2 = 5.0f, dx3 = 5.0f, dy3 = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
                curveToRelative(dx1 = 3.0f, dy1 = 0.0f, dx2 = 5.0f, dy2 = -2.0f, dx3 = 5.0f, dy3 = -5.0f)
                verticalLineTo(y = 7.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -2.0f, dy2 = -5.0f, dx3 = -5.0f, dy3 = -5.0f)
                moveToRelative(dx = 1.57f, dy = 6.48f)
                lineToRelative(dx = -2.18f, dy = 3.5f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.26f, dy1 = 0.17f)
                horizontalLineToRelative(dx = -0.05f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.25f, dy1 = -0.09f)
                arcToRelative(a = 4.24f, b = 4.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.64f, dy1 = 0.0f)
                arcToRelative(a = 0.37f, b = 0.37f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.56f, dy1 = -0.08f)
                lineToRelative(dx = -2.18f, dy = -3.5f)
                curveTo(x1 = 6.33f, y1 = 8.33f, x2 = 6.36f, y2 = 8.13f, x3 = 6.5f, y3 = 8.0f)
                arcToRelative(a = 8.27f, b = 8.27f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 11.0f, dy1 = 0.0f)
                arcToRelative(a = 0.4f, b = 0.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = 0.48f)
            }
        }.build().also { _weightMeter = it }
    }

@Suppress("ObjectPropertyName")
private var _weightMeter: ImageVector? = null
