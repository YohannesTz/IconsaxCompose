package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CreativeCommons: ImageVector
    get() {
        val current = _creativeCommons
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CreativeCommons",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                moveTo(x = 8.99f, y = 14.12f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.4f, dy1 = -0.53f)
                curveToRelative(dx1 = 0.31f, dy1 = -0.27f, dx2 = 0.79f, dy2 = -0.24f, dx3 = 1.06f, dy3 = 0.07f)
                reflectiveCurveToRelative(dx1 = 0.24f, dy1 = 0.79f, dx2 = -0.07f, dy2 = 1.06f)
                arcToRelative(a = 3.62f, b = 3.62f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -2.39f, dy1 = -6.34f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.39f, dy1 = 0.9f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = 1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.07f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.4f, dy1 = -0.53f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.24f)
                moveToRelative(dx = 7.0f, dy = 0.0f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.4f, dy1 = -0.53f)
                curveToRelative(dx1 = 0.31f, dy1 = -0.27f, dx2 = 0.79f, dy2 = -0.24f, dx3 = 1.06f, dy3 = 0.07f)
                reflectiveCurveToRelative(dx1 = 0.24f, dy1 = 0.79f, dx2 = -0.07f, dy2 = 1.06f)
                arcToRelative(a = 3.62f, b = 3.62f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -2.39f, dy1 = -6.34f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.39f, dy1 = 0.9f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.07f, dy1 = 1.06f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.07f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.4f, dy1 = -0.53f)
                arcToRelative(a = 2.12f, b = 2.12f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 4.24f)
            }
        }.build().also { _creativeCommons = it }
    }

@Suppress("ObjectPropertyName")
private var _creativeCommons: ImageVector? = null
