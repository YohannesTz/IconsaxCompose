package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tag: ImageVector
    get() {
        val current = _tag
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Tag",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.07f, y = 21.98f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.9f, dy1 = -1.6f)
                lineToRelative(dx = -4.53f, dy = -4.54f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.61f, dy1 = -4.17f)
                lineToRelative(dx = 0.24f, dy = -5.0f)
                arcToRelative(a = 4.6f, b = 4.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.4f, dy1 = -4.4f)
                lineToRelative(dx = 5.0f, dy = -0.24f)
                arcToRelative(a = 5.6f, b = 5.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 4.17f, dy1 = 1.61f)
                lineToRelative(dx = 4.53f, dy = 4.53f)
                arcToRelative(a = 5.54f, b = 5.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 7.81f)
                lineToRelative(dx = -4.39f, dy = 4.4f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.91f, dy1 = 1.6f)
                moveToRelative(dx = -7.37f, dy = -7.2f)
                lineToRelative(dx = 4.53f, dy = 4.52f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.68f, dy1 = 0.0f)
                lineToRelative(dx = 4.39f, dy = -4.39f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -5.68f)
                lineTo(x = 14.77f, y = 4.7f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.03f, dy1 = -1.17f)
                lineToRelative(dx = -5.0f, dy = 0.24f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.98f, dy1 = 2.96f)
                lineToRelative(dx = -0.24f, dy = 5.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.18f, dy1 = 3.04f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.5f, y = 12.75f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.5f)
                arcToRelative(a = 3.26f, b = 3.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.5f)
                moveToRelative(dx = 0.0f, dy = -5.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -1.75f, dy2 = 0.79f, dx3 = -1.75f, dy3 = 1.75f)
                reflectiveCurveToRelative(dx1 = 0.79f, dy1 = 1.75f, dx2 = 1.75f, dy2 = 1.75f)
                reflectiveCurveToRelative(dx1 = 1.75f, dy1 = -0.79f, dx2 = 1.75f, dy2 = -1.75f)
                reflectiveCurveToRelative(dx1 = -0.79f, dy1 = -1.75f, dx2 = -1.75f, dy2 = -1.75f)
            }
        }.build().also { _tag = it }
    }

@Suppress("ObjectPropertyName")
private var _tag: ImageVector? = null
